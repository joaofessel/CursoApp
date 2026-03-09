package com.example.domain.enums;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.example.domain.enums.Perfil;

public abstract class Pessoa{
    
    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;
    protected Set<Perfil> perfis = new HashSet<>();
    protected LocalDate CreatAT = LocalDate.now();
    


    protected Integer Id;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    public Pessoa(){
        super();
    }

    public Pessoa(Integer Id, String cpf, String email, String nome, String senha) {
        this.Id = Id;
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(Set<Perfil> perfis) {
        this.perfis = perfis;
    }

    public LocalDate getCreatAT() {
        return CreatAT;
    }

    public void setCreatAT(LocalDate CreatAT) {
        this.CreatAT = CreatAT;
    }

    
}