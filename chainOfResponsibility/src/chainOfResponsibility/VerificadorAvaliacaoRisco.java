package chainOfResponsibility;

class VerificadorAvaliacaoRisco extends VerificadorBase {
    @Override
    protected boolean verificar(SolicitacaoEmprestimo solicitacao) {
        // Lógica de avaliação de risco (simplificada para o exemplo)
        System.out.println("Avaliando risco...");
        return solicitacao.getValor() <= 10000;
    }
}
