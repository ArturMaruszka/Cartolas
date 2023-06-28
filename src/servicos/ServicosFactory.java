/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author 182120013
 */
public class ServicosFactory {
      private static JogadorServicos jogadorJ = new JogadorServicos();

    public static JogadorServicos getJogadorServicos() {
        return jogadorJ;
    }
    private static CartaServicos cartaC = new CartaServicos();

    public static CartaServicos getCartaServicos() {

        return cartaC;
    }
}
