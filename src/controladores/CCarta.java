/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import model.Cartas;

/**
 *
 * @author 182120013
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
    }
}//fim da class
