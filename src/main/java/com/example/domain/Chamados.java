package com.example.domain;

import java.time.LocalDate;
import com.example.domain.enums.Prioridade;
import com.example.domain.enums.Status;

public class Chamados {

    private Integer Id;
    private LocalDate creatAt_open = LocalDate.now();
    private LocalDate endAt_finish;
    private Prioridade Prioridade;
    private Status Status;
    private String Titulo;
    private String Descricao;
    private Suporte Suporte;
    private Cliente Cliente;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
        Chamados other = (Chamados) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        return true;
    }

    public Chamados(Cliente Cliente, String Descricao, Integer Id, Proridade Prioridade, Status Status, Suporte Suporte, String Titulo) {
        this.Cliente = Cliente;
        this.Descricao = Descricao;
        this.Id = Id;
        this.Prioridade = Prioridade;
        this.Status = Status;
        this.Suporte = Suporte;
        this.Titulo = Titulo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public LocalDate getCreatAt_open() {
        return creatAt_open;
    }

    public void setCreatAt_open(LocalDate creatAt_open) {
        this.creatAt_open = creatAt_open;
    }

    public LocalDate getEndAt_finish() {
        return endAt_finish;
    }

    public void setEndAt_finish(LocalDate endAt_finish) {
        this.endAt_finish = endAt_finish;
    }

    public Prioridade getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(Prioridade Prioridade) {
        this.Prioridade = Prioridade;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Suporte getSuporte() {
        return Suporte;
    }

    public void setSuporte(Suporte Suporte) {
        this.Suporte = Suporte;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    
}
