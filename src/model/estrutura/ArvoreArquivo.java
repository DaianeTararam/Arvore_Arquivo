//@author: Daiane Tararam

package model.estrutura;
import model.estrutura.No;

public class ArvoreArquivo {
    private No raiz;

    public ArvoreArquivo() {
        this.raiz = null;
    }

    public void inserir(String dado) {
        No atual = new No(dado);
        if (raiz == null) {
            this.raiz = atual;
        } else {
            inserirNo(raiz, atual);
        }
    }

    public void inserirNo(No raiz, No atual) {
        if (atual.getDado().compareTo(raiz.getDado()) > 0) {
            if (raiz.getDireita() == null) {
                raiz.setDireita(atual);
            } else {
                inserirNo(raiz.getDireita(), atual);
            }
        } else {
            if (raiz.getEsquerda() == null) {
                raiz.setEsquerda(atual);
            } else {
                inserirNo(raiz.getEsquerda(), atual);
            }
        }
    }

    public void ordem(No no, StringBuilder builder) {
        if (no == null) return;
        ordem(no.getEsquerda(), builder);
        builder.append("/home/usuario/").append(no.getDado());
        builder.append(" - ");
        ordem(no.getDireita(), builder);
    }

    @Override
    public String toString() {
        if (this.raiz == null) return "/home/usuario/";
        StringBuilder builder = new StringBuilder("/home/usuario/");
        ordem(this.raiz, builder);
        builder.append(".");
        return builder.toString().trim();
    }
}

