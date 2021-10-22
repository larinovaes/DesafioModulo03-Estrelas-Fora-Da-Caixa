package br.com.zup;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("============= CLIENTE ================ ");
        dados.append("\n Nome: " + getNome());
        dados.append("\n CPF: " + getCpf());
        dados.append("\n Email: " + getEmail());
        return dados.toString();
    }
}

