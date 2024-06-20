package chainOfResponsibility;

abstract class VerificadorBase implements Verificador {
    private Verificador next;
    public String nome;

    @Override
    public void setNext(Verificador next) {
        this.next = next;
    }

    @Override
    public void processarSolicitacao(SolicitacaoEmprestimo solicitacao) {
        if (this.verificar(solicitacao)) {
            System.out.println(this.getClass().getSimpleName() + ": Aprovado!");
            if (this.next != null) {
                this.next.processarSolicitacao(solicitacao);
            }
        } else {
            System.out.println(this.getClass().getSimpleName() + ": Rejeitado!");
        }
    }

    // Método abstrato para verificar a solicitação
    protected abstract boolean verificar(SolicitacaoEmprestimo solicitacao);
    
    public void printnome() {
    	if (this.nome != null) {
    		System.out.println(this.nome);    		
    	}
    }
    
    public void printnomenext() {
    	if (this.next != null) {
    		this.next.printnome();    		
    	}
    }
}
