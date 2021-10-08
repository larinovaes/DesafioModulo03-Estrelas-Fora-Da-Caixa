package br.com.zup;

public class Vendedor {

    private String nome;
    private String cpf;
    private String email;

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("============= VENDEDOR ================ ");
        dados.append("\n Nome: " + nome);
        dados.append("\n CPF: " + cpf);
        dados.append("\n Email: " + email);
        return dados.toString();
    }

}
