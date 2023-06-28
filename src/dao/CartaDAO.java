/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cartas;
import model.Jogador;
import servicos.CartaServicos;
import servicos.JogadorServicos;
import servicos.ServicosFactory;

/**
 *
 * @author 182120013
 */
public class CartaDAO {

   public void cadastrarCartadao(Cartas cVO) {
        try {
            JogadorServicos jogadorJ = ServicosFactory.getJogadorServicos();
            Connection con = Conexao.getConexao();
            String sql = "insert into jogador (  Nome, Edicao, Quantidade, Preco, Dono) values(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getEdicao());
            pst.setInt(3, cVO.getQuantidade());
            pst.setFloat(4, cVO.getPreco());
            pst.setInt(5, jogadorJ.getjogadorByDoc(cVO.getDono().getNome()).getIdJogador());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Deu ruim meu chapa, não consegui cadastrar!!!!!!!!!!!!!!!!!!!!!!\n" + e.getMessage());
        }
    }//fim do cadastra cartas

    public ArrayList<Cartas> getCartas() {
        JogadorServicos jogadorJ = ServicosFactory.getJogadorServicos();
        ArrayList<Cartas> cartas = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select cartas.*,jogador.Nome as Nome from cartas join jogador on cartas.Jogador_idJogador  = jogador.idJogador ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.out.println(rs.getNString("Nome"));
                Cartas c = new Cartas();
                c.setNome(rs.getNString("Nome"));
                c.setEdicao(rs.getString("Edicao"));

                c.setQuantidade(rs.getInt("Quantidade"));
                c.setPreco(rs.getInt("Preco"));
                c.setDono(jogadorJ.getjogadorByDoc(rs.getString("Nome")));
                cartas.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Não rolou o registro!!\n" + e.getMessage());
        }
        return cartas;
    }//fim do array cartas

    public Cartas getcardbyname(String Nome) {
        Cartas c = new Cartas();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select*from cartas where Nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Nome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c.setNome(rs.getString("Nome"));
                c.setEdicao(rs.getString("Edicao"));

                c.setQuantidade(rs.getInt("Quantidade"));
                c.setPreco(rs.getInt("Preco"));
                JogadorServicos jogadorJ = ServicosFactory.getJogadorServicos();
                c.setDono(jogadorJ.getjogadorByDoc(rs.getString("Nome")));
            }
        } catch (SQLException e) {
            System.out.println("Não achei!!\n" + e.getMessage());
        }
        return c;
    }//fim do getcard

    public void atualizarCartaDAO(Cartas cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update cartas set Nome = ?, Edicao = ?, Quantidade =?, Preco = ?, where Nome = ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(4, cVO.getQuantidade());
            pst.setFloat(5, cVO.getPreco());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Falha ao atualizar os dados!!\n" + e.getMessage());
        }
    }//fim do atualiza carta

    public void deletarCartaDAO(String nome) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "Select*from cartas where nome = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Não deu camarada, nãoconsegui apagar essa carta!!\n" + e.getMessage());

        }
    }//fim do deletacarta

    public ArrayList<Cartas> getcardbydono(String Dono) {
        JogadorServicos jogadorJ = ServicosFactory.getJogadorServicos();
        ArrayList<Cartas> cartas = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from cartas where dono like ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Dono);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cartas c = new Cartas();
                c.setNome(rs.getNString("Nome"));
                c.setEdicao(rs.getString("Edicao"));
                c.setQuantidade(rs.getInt("Quantidade"));
                c.setPreco(rs.getInt("Preco"));
                c.setDono(jogadorJ.getjogadorByDoc(rs.getString("Nome")));
                cartas.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Não rolou o registro!!\n" + e.getMessage());
        }
        return cartas;
    }//fim getcardbydono

    public Jogador getJogadorbycard(String Dono) {
        CartaServicos cartaC = ServicosFactory.getCartaServicos();
        Jogador j = new Jogador();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * Dono from cartas where nome like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Dono);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                j.setIdJogador(rs.getInt("idJogador"));
                j.setNome(rs.getString("Nome"));
                j.setTelefone(rs.getString("Telefone"));
                j.setEmail(rs.getString("Email"));
                j.setCidade(rs.getString("Cidade"));
            }
        } catch (SQLException e) {
            System.out.println("Não encontrei o documento desse cara!!\n");
        }
        return j;
    }
}//fim da class
