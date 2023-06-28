/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import model.Cartas;
import dao.CartaDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Cartas;
import model.Jogador;

/**
 *
 * @author 182120013
 */
public class CartaServicos {
    public void cadastroCarta(Cartas cVO) {
        CartaDAO cdao = DAOFactory.getcartadao();
        cdao.cadastrarCartadao(cVO);
    }//fim do cadastrar

    public ArrayList<Cartas> getCarta() {
        CartaDAO cdao = DAOFactory.getcartadao();
        return cdao.getCartas();
    }//fimdo array

    public Cartas getcardbyname(String nome) {
        CartaDAO cdao = DAOFactory.getcartadao();
        return cdao.getcardbyname(nome);
    }//fim getcard

    public void atualizarCartaDAO(Cartas cVO) {
        CartaDAO cdao = DAOFactory.getcartadao();
        cdao.atualizarCartaDAO(cVO);
    }//fim do atualizar

    public void deletacarta(String nome) {
        CartaDAO cdao = DAOFactory.getcartadao();
        cdao.deletarCartaDAO(nome);
    }//fim do  deletar carta

    public Jogador getjogadorbycard(String dono) {
        CartaDAO cdao = DAOFactory.getcartadao();
        return cdao.getJogadorbycard(dono);
    }

    public ArrayList<Cartas> getcardbydono(String dono) {
        CartaDAO cdao = DAOFactory.getcartadao();
        return cdao.getcardbydono(dono);
    }//fim getcardbydono
}
