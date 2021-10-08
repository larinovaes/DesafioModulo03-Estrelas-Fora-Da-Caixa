package br.com.zup;

public class Venda {

    private Cliente cliente;
    private Vendedor vendedorResponsavel;
    private String DataDeRegistro;
    private double valorAserPago;

    public Venda(Cliente cliente, Vendedor vendedorResponsavel, String dataDeRegistro, double valorAserPago) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        DataDeRegistro = dataDeRegistro;
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
        return DataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        DataDeRegistro = dataDeRegistro;
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
        dados.append("\n Valor a pagar: " + getValorAserPago());
        dados.append("\n Data de registro: " + getDataDeRegistro());
        dados.append(vendedorResponsavel.toString());
        dados.append(cliente.toString());

        return dados.toString();
    }
}
