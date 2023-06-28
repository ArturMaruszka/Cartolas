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
import model.Jogador;

/**
 *
 * @author 182120013
 */
public class JogadorDAO {
 public void cadastrarjogadordao(Jogador jVO) {
        try {
            //buscar conexao com BD
            Connection con = Conexao.getConexao();
            //criar script sql de insert
            String sql = "insert into jogador ( idJogador, Nome, Telefone, Email, Cidade, Cpf) values(null,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, jVO.getNome());
            pst.setString(2, jVO.getTelefone());
            pst.setString(3, jVO.getEmail());
            pst.setString(4, jVO.getCidade());
            pst.setString(5, jVO.getCpf());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Falha ao Cadastrar Jogador\n" + e.getMessage());
        }
    }//fim do cadastrar jogador

    public ArrayList<Jogador> getJogador() {
        ArrayList<Jogador> jogador = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select jogador.*";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Jogador j = new Jogador();
                j.setIdJogador(rs.getInt("idJogador"));
                j.setNome(rs.getString("Nome"));
                j.setTelefone(rs.getString("Telefone"));
                j.setTelefone(rs.getString("Email"));
                j.setCidade(rs.getString("Cidade"));
                j.setCpf(rs.getString("Cpf"));
            }
        } catch (SQLException e) {
            System.out.println("Falha ao recuperar o Array.\n");
        }
        return jogador;

    }//fim do array

    public Jogador getJogadorByDoc(String Nome) {
        Jogador j = new Jogador();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from jogador where Nome like = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Nome);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                j.setIdJogador(rs.getInt("idJogador"));
                j.setNome(rs.getString("Nome"));
                j.setTelefone(rs.getNString("Telefone"));
                j.setEmail(rs.getString("Email"));
                j.setCidade(rs.getString("Cidade"));
                j.setCpf(rs.getString("Cpf"));
            }
        } catch (SQLException e) {
            System.out.println("Não encontrei o documento desse Jogador.\n");
        }
        return j;
    }//fim getjoadorbydoc

    public void atualizarJogadordao(Jogador jVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update jogador set Nome = ?, Telefone = ?, Email = ?, Cidade = ?, Cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, jVO.getNome());
            pst.setString(2, jVO.getTelefone());
            pst.setString(3, jVO.getEmail());
            pst.setString(4, jVO.getCidade());
            pst.setString(5, jVO.getCpf());

        } catch (SQLException e) {
            System.out.println("Não Consegui atualizar este Jogador.\n");
        }
    }//fim do atualiza jogador

    public void deletarJogadordao(String Nome) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from jogador where Nome = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Nome);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Não consegui apagar esse registro!!\n");

        }
    }//fim deleta jogador

}//fim da class
