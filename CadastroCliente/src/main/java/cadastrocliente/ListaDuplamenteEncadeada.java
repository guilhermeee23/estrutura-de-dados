/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrocliente;

/**
 *
 * @author Guilherme Antunes
 */
public class ListaDuplamenteEncadeada {
    
    private Nodo inicio;
    private Nodo fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionar(Cliente cliente) {
        Nodo novoNodo = new Nodo(cliente);
        if (inicio == null) {
            inicio = fim = novoNodo;
        } else {
            fim.setProximo(novoNodo);
            novoNodo.setAnterior(fim);
            fim = novoNodo;
        }
    }

    public boolean remover(int codigo) {
        Nodo atual = inicio;
        while (atual != null) {
            if (atual.getCliente().getCodigo() == codigo) {
                if (atual == inicio && atual == fim) {
                    inicio = fim = null;
                } else if (atual == inicio) {
                    inicio = atual.getProximo();
                    inicio.setAnterior(null);
                } else if (atual == fim) {
                    fim = atual.getAnterior();
                    fim.setProximo(null);
                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public Cliente buscar(int codigo) {
        Nodo atual = inicio;
        while (atual != null) {
            if (atual.getCliente().getCodigo() == codigo) {
                return atual.getCliente();
            }
            atual = atual.getProximo();
        }
        return null;
    }

    public void exibirTodos() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.println(atual.getCliente());
            atual = atual.getProximo();
        }
    }
}
