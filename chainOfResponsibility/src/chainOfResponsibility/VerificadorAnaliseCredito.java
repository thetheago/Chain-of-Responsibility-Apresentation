package chainOfResponsibility;

class VerificadorAnaliseCredito extends VerificadorBase {
    @Override
    protected boolean verificar(SolicitacaoEmprestimo solicitacao) {
        // Lógica de verificação de crédito (simplificada para o exemplo)
        System.out.println("Verificando análise de crédito...");
        return solicitacao.getValor() <= 50000;
    }
}
