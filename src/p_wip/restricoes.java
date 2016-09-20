/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_wip;

/**
 *
 * @author joana
 */
public class restricoes {
    private int id_restricao;
    private String nome_restricao;
    private double valor_restricao;
    
public restricoes(int id_restricao, String nome_restricao, double valor_restricao){
    this.id_restricao = id_restricao;
    this.nome_restricao = nome_restricao;
    this.valor_restricao = valor_restricao;
}    

public int getid_restricao(){
    return id_restricao;
}
    
public String getnome_restricao(){
    return nome_restricao;
}

public double getvalor_restricao(){
    return valor_restricao;
}
}
