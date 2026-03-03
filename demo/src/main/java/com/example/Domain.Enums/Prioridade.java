package com.exeample.Domain.Enums;

public class Prioridade {
   BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

   private Integer Codigo;
   private String Descricao;

   private Prioridade (Integer Codigo, String Descricao){
    this.Codigo = Codigo;
    this.Descricao = Descricao;
   }

   public Integer getCodigo(){
        return Codigo;
   }
   public String getDesc(){
        return Descricao;
   }

   public static Prioridade toEnum(Integer cod){
    if (cod == null){
        return null;
    }
    for (Prioridade x : Prioridade.values()){
        if(cod.equals(x.getCodigo())){
            return x;
        }
    }
    throw new IllegalArgumentException("Prioridade Inválida");
   }
}
