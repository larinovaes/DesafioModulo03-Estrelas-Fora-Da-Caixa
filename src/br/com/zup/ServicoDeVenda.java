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
        List<Venda> comprasDoCliente = new ArrayList<>();
        for (Venda vendaReferencia: vendas) {
            if (vendaReferencia.getCliente().getCpf().equals(cpf)){
                comprasDoCliente.add(vendaReferencia);
            } else{
                throw new Exception("Este cliente não está cadastrado.");
            }
        }
        return comprasDoCliente;
    }
    public static List<Venda> pesquisarVendaDeVendedorEspecifico(String email) throws Exception {
      List<Venda> vendaDoVendedor = new ArrayList<>();
        for (Venda vendaReferencia: vendas) {
            if(vendaReferencia.getVendedorResponsavel().getEmail().equals(email)){
                vendaDoVendedor.add(vendaReferencia);
            } else{
                throw new Exception("Este vendedor não está cadastrado");
            }
        }
        return vendaDoVendedor;
    }
}
