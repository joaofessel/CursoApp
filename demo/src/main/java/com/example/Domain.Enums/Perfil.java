package com.exeample.Domain.Enums;

public class Perfil {

   ADMIN(0, "ROLE_ADM"), CLIENTE(1, "ROLE_CLI"), SUPORTE(2, "ROLE_SUP");

   private Integer Codigo;
   private String Descricao;

   private Perfil (Integer Codigo, String Descricao){
    this.Codigo = Codigo;
    this.Descricao = Descricao;
   }

   public Integer getCodigo(){
        return Codigo;
   }
   public String getDesc(){
        return Descricao;
   }

   public static Perfil toEnum(Integer cod){
    if (cod == null){
        return null;
    }
    for (Perfil x : Perfil.values()){
        if(cod.equals(x.getCodigo())){
            return x;
        }
    }
    throw new IllegalArgumentException("Perfil Inválido");
   }
}
