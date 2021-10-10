package br.com.zup;

public class Venda {

    private Cliente cliente;
    private Vendedor vendedorResponsavel;
    private String dataDeRegistro;
    private double valorAserPago;

    public Venda() {

    }

    public Venda(Cliente cliente, Vendedor vendedorResponsavel, String dataDeRegistro, double valorAserPago) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.dataDeRegistro = dataDeRegistro;
        this.valorAserPago = valorAserPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        dataDeRegistro = dataDeRegistro;
    }

    public double getValorAserPago() {
        return valorAserPago;
    }

    public void setValorAserPago(double valorAserPago) {
        this.valorAserPago = valorAserPago;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("============= VENDAS ================ ");
        dados.append("\n Cliente: " + cliente.getNome());
        dados.append("\n Vendedor: " + vendedorResponsavel.getNome());
        dados.append("\n Valor a pagar: R$" + valorAserPago);
        dados.append("\n Data de registro: " + dataDeRegistro);
        return dados.toString();
    }
}
