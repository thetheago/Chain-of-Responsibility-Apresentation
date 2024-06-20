package chainOfResponsibility;

public class Main {
	public static void main(String[] args) {
        // Cria os verificadores
        VerificadorAnaliseCredito analiseCredito = new VerificadorAnaliseCredito();
        VerificadorVerificacaoRenda verificacaoRenda = new VerificadorVerificacaoRenda();
        VerificadorAvaliacaoRisco avaliacaoRisco = new VerificadorAvaliacaoRisco();

        // Conecta os verificadores em uma cadeia
        analiseCredito.setNext(verificacaoRenda);
        verificacaoRenda.setNext(avaliacaoRisco);
        
        avaliacaoRisco.nome = "testeué";
        
        verificacaoRenda.printnomenext();

        // Cria uma solicitação de empréstimo
        SolicitacaoEmprestimo solicitacao = new SolicitacaoEmprestimo(10000, "João da Silva");

        // Envia a solicitação para a cadeia de verificadores
        analiseCredito.processarSolicitacao(solicitacao);
    }
}
