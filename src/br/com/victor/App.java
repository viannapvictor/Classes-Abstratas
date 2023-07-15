package br.com.victor;

import br.com.victor.persons.PessoaFisica;
import br.com.victor.persons.PessoaJuridica;

public class App {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(123456L);
        pf.setNome("Vitin");
        pf.setImposto("IRPJ");
        pf.imprimir();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj("456789");
        pj.setNome("Rodrigo");
        pj.setImposto("IRPF");
        pj.imprimir();
    }

}
