/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_wip;

import java.sql.Date;

/**
 *
 * @author joana
 */
public class projeto {
    
    private int id;
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private double investimentoInicial;
    private double taxa; //fica double a percentagem?? (se nao, alterar tb no phpmyadmin)
    private int id_restricao;
    Object getid_restricao;

    
    public projeto(int id, String nome, Date dataInicio, Date dataFim, double investimentoInicial, double taxa, int id_restricao ){
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.investimentoInicial = investimentoInicial;
        this.taxa = taxa;
        this.id_restricao = id_restricao;
        
    }
    
    public int getId(){
        return id;
    }
    
     public String getNome(){
        return nome;
    }
    
    public Date getdataInicio(){
        return dataInicio;
    }
    
    public Date getdataFim(){
        return dataFim;
    }
    
    public double getinvestimentoInicial(){
        return investimentoInicial;
    }
    
    public double gettaxa(){
        return taxa;
    }
    
    public int getid_restricao(){
        return id_restricao;
    }
    
   
}


