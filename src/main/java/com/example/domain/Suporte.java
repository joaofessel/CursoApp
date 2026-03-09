package com.example.domain;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Suporte extends Pessoa{

    @OneToMany(mappedBy = "Suporte")
    private List<Chamados> Chamados = new ArrayList<>();

    public Suporte(){
        super();
        addPerfis(Perfil.CLIENTE);
    }

    public Suporte (Integer id, String cpf, String email, String nome, String senha){
        super(id,cpf,email,nome,senha);
        addPerfis(Perfil.CLIENTE);
    }

    public List<Chamados> getChamados() {
        return Chamados;
    }

    public void setChamados(List<Chamados> Chamados) {
        this.Chamados = Chamados;
    }
}
