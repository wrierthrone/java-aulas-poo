package br.sesi.gk.poo.cabeca;

public class Cabeca {
    public Olho olho;
    public Orelha orelha;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.olho = new Olho();
        this.orelha = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
