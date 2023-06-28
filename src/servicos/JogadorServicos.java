/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.JogadorDAO;
import java.util.ArrayList;
import model.Jogador;

/**
 *
 * @author 182120013
 */
public class JogadorServicos {
    public void cadastroJogador(Jogador jVO){
        JogadorDAO jdao = DAOFactory.getjogadordao();
        jdao.cadastrarjogadordao(jVO);
    }
    public ArrayList<Jogador> getJogador(){
         JogadorDAO jdao = DAOFactory.getjogadordao();
         return jdao.getJogador();
    }
    public Jogador getjogadorByDoc(String Usuario){
        JogadorDAO jdao = DAOFactory.getjogadordao();
        return jdao.getJogadorByDoc(Usuario);
    }
    
    
    public void atualizarJogadorDAO(Jogador jVO){
        JogadorDAO jdao = DAOFactory.getjogadordao();
        jdao.atualizarJogadordao(jVO);
    }
    public void deletarJogador(String cpf){
       JogadorDAO jdao = DAOFactory.getjogadordao();
        jdao.deletarJogadordao(cpf);
    }
}
