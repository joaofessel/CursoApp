package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Suporte extends Pessoa{
    private List<Chamados> Chamados = new ArrayList<>();

    public Suporte(){
        super();
    }

    public Suporte (Integer id, String cpf, String email, String nome, String senha){
        super(id,cpf,email,nome,senha);
    }

    public List<Chamados> getChamados() {
        return Chamados;
    }

    public void setChamados(List<Chamados> Chamados) {
        this.Chamados = Chamados;
    }
}
