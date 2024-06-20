package chainOfResponsibility;

class SolicitacaoEmprestimo {
    private double valor;
    private String nomeCliente;
    private double rendaMensal;

    public SolicitacaoEmprestimo(double valor, String nomeCliente) {
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.rendaMensal = 5000; // Renda mensal predefinida para o exemplo
    }

    public double getValor() {
        return valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
}
