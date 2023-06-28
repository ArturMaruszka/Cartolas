/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author 182120013
 */
public class DAOFactory {
     private static JogadorDAO jdao = new JogadorDAO();
    public static JogadorDAO getjogadordao(){
        return jdao;
    }
    private static CartaDAO cdao = new CartaDAO();
    public static CartaDAO getcartadao(){
        return cdao;
    }
}
