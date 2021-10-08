package br.com.zup;

public class Main {


    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        Cliente cliente = new Cliente();
        Venda venda = new Venda();
        Sistema.cadastrarVendedor();
        ServicoCliente.cadastrarCliente("joao","2429238","sokdhfgk");
        ServicoDeVenda.cadastrarVendas(cliente,vendedor,"23/04/21",900);
        ServicoVendedor.exibirVendedores();
        ServicoDeVenda.exibirVendas();
        ServicoCliente.exibirClientes();


    }
}
