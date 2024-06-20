package chainOfResponsibility;

public interface Verificador {
	void processarSolicitacao(SolicitacaoEmprestimo solicitacao);
    void setNext(Verificador next);
    void printnome();
}
