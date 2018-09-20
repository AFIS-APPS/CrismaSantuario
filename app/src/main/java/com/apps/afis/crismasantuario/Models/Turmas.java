package com.apps.afis.crismasantuario.Models;

import java.util.ArrayList;
import java.util.Date;

public class Turmas {

    private String idTurma;
    private String nomeTurma;
    private Date dataCriacaoTurma;
    private Date dataFechamentoTurma;
    private ArrayList<String> catequistasTurma;
    private ArrayList<Crismando> crismandosTurma;

    public Turmas() {
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Date getDataCriacaoTurma() {
        return dataCriacaoTurma;
    }

    public void setDataCriacaoTurma(Date dataCriacaoTurma) {
        this.dataCriacaoTurma = dataCriacaoTurma;
    }

    public Date getDataFechamentoTurma() {
        return dataFechamentoTurma;
    }

    public void setDataFechamentoTurma(Date dataFechamentoTurma) {
        this.dataFechamentoTurma = dataFechamentoTurma;
    }

    public ArrayList<String> getCatequistasTurma() {
        return catequistasTurma;
    }

    public void setCatequistasTurma(ArrayList<String> catequistasTurma) {
        this.catequistasTurma = catequistasTurma;
    }

    public ArrayList<Crismando> getCrismandosTurma() {
        return crismandosTurma;
    }

    public void setCrismandosTurma(ArrayList<Crismando> crismandosTurma) {
        this.crismandosTurma = crismandosTurma;
    }

}
