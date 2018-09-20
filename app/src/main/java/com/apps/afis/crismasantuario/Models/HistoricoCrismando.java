package com.apps.afis.crismasantuario.Models;

import java.util.Date;

public class HistoricoCrismando {

    private String idTurma;
    private String nomeCrismando;
    private Date dataChamadaHistorico;
    private Boolean isPresent;
    private int numFaltas;

    public HistoricoCrismando() {
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getNomeCrismando() {
        return nomeCrismando;
    }

    public void setNomeCrismando(String nomeCrismando) {
        this.nomeCrismando = nomeCrismando;
    }

    public Date getDataChamadaHistorico() {
        return dataChamadaHistorico;
    }

    public void setDataChamadaHistorico(Date dataChamadaHistorico) {
        this.dataChamadaHistorico = dataChamadaHistorico;
    }

    public Boolean getPresent() {
        return isPresent;
    }

    public void setPresent(Boolean present) {
        isPresent = present;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }
}
