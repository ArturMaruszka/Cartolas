/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120013
 */
public class Cartas {
    
 private String Nome;
    private String Edicao;
    private int Quantidade;
    private float Preco;
    private Jogador Dono;

    public Cartas() {
    }

    public Cartas(String Nome, String Edicao, int Quantidade, float Preco, Jogador Dono) {
        this.Nome = Nome;
        this.Edicao = Edicao;
        this.Quantidade = Quantidade;
        this.Preco = Preco;
        this.Dono = Dono;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String Edicao) {
        this.Edicao = Edicao;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(int Preco) {
        this.Preco = Preco;
    }

    public Jogador getDono() {
        return Dono;
    }

    public void setDono(Jogador Dono) {
        this.Dono = Dono;
    }

    @Override
    public String toString() {
        return "Cartas{" + "Nome=" + Nome + ", Edicao=" + Edicao + ", Quantidade=" + Quantidade + ", Preco=" + Preco + ", Dono=" + Dono + '}';
    }
    
}
