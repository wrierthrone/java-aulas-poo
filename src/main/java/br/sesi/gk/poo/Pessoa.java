package br.sesi.gk.poo;

import br.sesi.gk.poo.cabeca.Cabeca;
import br.sesi.gk.poo.inferior.MembrosInferiores;
import br.sesi.gk.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
