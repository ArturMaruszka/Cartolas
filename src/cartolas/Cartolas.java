/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartolas;

import controladores.CCarta;
import controladores.CJogador;
import java.util.InputMismatchException;
import java.util.Scanner;
import view.principal;

/**
 *
 * @author 182120013
 */
public class Cartolas {
public static CJogador cadJogador  = new CJogador();
public static CCarta cadCarta = new CCarta();
    static Scanner leia = new Scanner(System.in);
    

    public static void main(String[] args) {
     principal janela = new principal();
        janela.setVisible(true);   // TODO code application logic here
    }//fim da main

     public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        try {
            return leiaNum.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Добро пожаловать в товарищеский Советский Союз!");
        }
        return 99;
    }//fim do leiaNumInt
}//fim da class
