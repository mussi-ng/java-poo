/**
 * Representa um atendente, que controla o valor total do caixa.
 */
public class Atendente extends Colaborador {
    /** Valor atualmente acumulado no caixa. */
    private double valorCaixa;

    /**
     * @param nome nome do atendente.
     * @param email email do atendente.
     * @param senha senha do atendente.
     */
    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    /**
     * @return valor total do caixa.
     */
    public double getValorCaixa() {
        return valorCaixa;
    }

    /**
     * Adiciona um valor ao caixa.
     *
     * @param valorCaixa valor a adicionar.
     */
    public void adicionarAoCaixa(double valorCaixa) {
        this.valorCaixa += valorCaixa;
    }

    /**
     * Solicita ao usuário o valor do pagamento e adiciona ao caixa.
     */
    public void receberPagamento(){
        System.out.println("Escreva o valor do pagamento");
        adicionarAoCaixa(sc.nextDouble());
    }

    /**
     * Finaliza o processo de fechamento do caixa (apenas imprime mensagem no código atual).
     */
    public void fecharCaixa(){
        System.out.println("Fechando caixa...");
    }
}
