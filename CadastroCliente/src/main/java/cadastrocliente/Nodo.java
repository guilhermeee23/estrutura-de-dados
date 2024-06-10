/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrocliente;

/**
 *
 * @author Guilherme Antunes
 */
public class Nodo {
    
    private Cliente cliente;
    private Nodo anterior;
    private Nodo proximo;

    public Nodo(Cliente cliente) {
        this.cliente = cliente;
        this.anterior = null;
        this.proximo = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
