/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Cartas;

/**
 *
 * @author artur
 */
public class CCarta {
     ArrayList<Cartas> cartas = new ArrayList<>();
    public void addCarta(Cartas c){
        this.cartas.add(c);
        
    }//fim addCarta
    public void removeCarta(Cartas c){
        this.removeCarta(c);
    }//fim removeCarta
    public ArrayList<Cartas> getCartas(){
        return this.cartas;
    }//fim array carta
    public Cartas getCarta(String Nome){
        Cartas c = null;
        for(Cartas carta : cartas){
            if(carta.getNome().equals(Nome)){
                c =carta;
                break;
            }//fim do if
        }//fim do for
        return c;
    }//fim do getCarta
}
