/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Jogador;

/**
 *
 * @author artur
 */
public class CJogador {
     ArrayList <Jogador> jogador = new ArrayList();
    public void addJogador(Jogador j){
        this.addJogador(j);
    }//fim do addJogador
    public void removeJogador(Jogador j){
        this.jogador.remove(j);
    }//fim do remove jogador
    public ArrayList<Jogador> getJogador(){
        return this.jogador;
    }//fim do getJogador
    public Jogador getJogadorUsuário(String Nome){
        Jogador j = null;
        for(Jogador jog : jogador){
            if(jog.getNome().equalsIgnoreCase(Nome)){
                j = jog;
                break;
            }//fim do if
        }//fim do for
        return j;
    }
}
