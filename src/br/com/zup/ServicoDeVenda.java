package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoDeVenda {

    private static List<Venda> vendas = new ArrayList<>();

    public ServicoDeVenda() {

    }

    public static Venda cadastrarVendas(Cliente nomeDoCliente, Vendedor vendedor, String dataDeRegistro, double valorAserPago) {
        Venda venda = new Venda(nomeDoCliente, vendedor, dataDeRegistro, valorAserPago);
        vendas.add(venda);
        return venda;
    }

    public static List<Venda> exibirVendas() {
        for (Venda vendaReferencia : vendas) {
            System.out.println(vendaReferencia);
        }
        return vendas;
    }

    public static List<Venda> pesquisarCompraDeClienteEspecifico(String cpf) throws Exception {
        List<Venda> compraDoCliente = new ArrayList<>();
        for (Venda vendaReferencia : vendas) {
            if (vendaReferencia.getCliente().getCpf().equals(cpf)) {
                compraDoCliente.add(vendaReferencia);
            }
        }
        if (compraDoCliente.size() == 0) {
            throw new Exception("Este cliente não possui nenhuma compra ou não está cadastado.");
        }
        return compraDoCliente;
    }

    public static List<Venda> pesquisarVendaDeVendedorEspecifico(String email) throws Exception {
        List<Venda> vendasDoVendedor = new ArrayList<>();
        for (Venda vendaReferencia : vendas) {
            if (vendaReferencia.getVendedorResponsavel().getEmail().equalsIgnoreCase(email)) {
                vendasDoVendedor.add(vendaReferencia);
            }
        }
        if (vendasDoVendedor.size() == 0) {
            throw new Exception("Este vendedor não possui nenhuma venda ou não está cadastado.");
        }
        return vendasDoVendedor;
    }
}
