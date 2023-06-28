/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import model.Jogador;

/**
 *
 * @author 182120013
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
        return j;}
}//fim da class
