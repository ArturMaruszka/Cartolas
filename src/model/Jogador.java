/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 182120013
 */
public class Jogador {
 
     private int idJogador;
    private String Nome;
    private String Telefone;
    private String Email;
    private String Cidade;
    private String Cpf;

    public Jogador() {
    }

   /* public Jogador(int idJogador, String Nome, String Telefone, String Email, String Cidade, String Cpf) {
        this.idJogador = idJogador;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Cidade = Cidade;
        this.Cpf = Cpf;
    }*/

    public Jogador(Object object, String nome, String telefone, String email, String cidade, String cpf) {
        this.Nome = nome;
        this.Telefone = telefone;
        this.Email = email;
        this.Cidade = cidade;
        this.Cpf = cpf;
    }

    

    
    

    /**
     *
     * @return
     */
    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    @Override
    public String toString() {
        return "Jogador{" + "idJogador=" + idJogador + ", Nome=" + Nome + ", Telefone=" + Telefone + ", Email=" + Email + ", Cidade=" + Cidade + ", Cpf=" + Cpf + '}';
    }
    

    
    
}//fim da class
