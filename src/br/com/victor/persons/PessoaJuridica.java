package br.com.victor.persons;

public class PessoaJuridica extends Person{

    private String cnpj;
    private String imposto;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getImposto() {
        return imposto;
    }

    public void setImposto(String imposto) {
        this.imposto = imposto;
    }

    @Override
    public void imprimir() {
        System.out.println(this.getNome() + "É uma pessoa Jurídica. Seu imposto é: " + this.imposto);
        System.out.println("Seu cnpj é: " + this.cnpj);
    }
}
