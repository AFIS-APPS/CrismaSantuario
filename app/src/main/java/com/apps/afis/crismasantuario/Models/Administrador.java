package com.apps.afis.crismasantuario.Models;

public class Administrador {

    private String nomeAdm;
    private String emailAdm;
    private String telefoneAdm;
    private char cargoAdm; //cargoAdm => ('S' - Supervisor) ('C' - Catequista)

    public Administrador() {
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }

    public String getTelefoneAdm() {
        return telefoneAdm;
    }

    public void setTelefoneAdm(String telefoneAdm) {
        this.telefoneAdm = telefoneAdm;
    }

    public char getCargoAdm() {
        return cargoAdm;
    }

    public void setCargoAdm(char cargoAdm) {
        this.cargoAdm = cargoAdm;
    }

}
