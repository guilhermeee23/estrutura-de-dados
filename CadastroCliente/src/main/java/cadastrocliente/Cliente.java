/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrocliente;

/**
 *
 * @author Guilherme Antunes
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    private String dtNascimento;
    private String fone;
    
    public Cliente(int codigo, String nome, String dtNascimento, String fone) {
        this.codigo = codigo;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.fone = fone;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Data de Nascimento: " + dtNascimento + ", Fone: " + fone;
    }    
     
}
