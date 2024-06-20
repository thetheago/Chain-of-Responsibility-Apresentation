package chainOfResponsibility;

class VerificadorVerificacaoRenda extends VerificadorBase {
    @Override
    protected boolean verificar(SolicitacaoEmprestimo solicitacao) {
        // Lógica de verificação de renda (simplificada para o exemplo)
        System.out.println("Verificando renda...");
        return solicitacao.getValor() <= 2 * solicitacao.getRendaMensal();
    }
}
