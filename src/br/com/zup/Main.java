package br.com.zup;

public class Main {


    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        Sistema.cadastrarVendedor();
        ServicoVendedor.exibirVendedores();

    }
}
