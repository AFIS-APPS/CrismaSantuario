package com.apps.afis.crismasantuario.Models;

import java.util.ArrayList;

public class Avisos {
    private String tituloAviso;
    private String dataAviso;
    private String autorAviso;
    private String corpoAviso;
    private ArrayList<String> turmasAviso;

    public Avisos() {
    }

    public ArrayList<String> getTurmasAviso() {
        return turmasAviso;
    }

    public void setTurmasAviso(ArrayList<String> turmasAviso) {
        this.turmasAviso = turmasAviso;
    }

    public String getTituloAviso() {
        return tituloAviso;
    }

    public void setTituloAviso(String tituloAviso) {
        this.tituloAviso = tituloAviso;
    }

    public String getDataAviso() {
        return dataAviso;
    }

    public void setDataAviso(String dataAviso) {
        this.dataAviso = dataAviso;
    }

    public String getAutorAviso() {
        return autorAviso;
    }

    public void setAutorAviso(String autorAviso) {
        this.autorAviso = autorAviso;
    }

    public String getCorpoAviso() {
        return corpoAviso;
    }

    public void setCorpoAviso(String corpoAviso) {
        this.corpoAviso = corpoAviso;
    }
}
