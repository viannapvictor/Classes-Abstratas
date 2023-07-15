package br.com.victor.persons;

public class PessoaFisica extends Person {

    private Long cpf;
    private String imposto;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getImposto() {
        return imposto;
    }

    public void setImposto(String imposto) {
        this.imposto = imposto;
    }

    @Override
    public void imprimir() {
        System.out.println(this.getNome() + "É uma pessoa Física. Seu imposto é: " + this.imposto);
        System.out.println("Seu cpf é: " + this.cpf);
    }
}
