public class Atendente extends Colaborador {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void adicionarAoCaixa(double valorCaixa) {
        this.valorCaixa += valorCaixa;
    }

    public void receberPagamento(){
        System.out.println("Escreva o valor do pagamento");
        adicionarAoCaixa(sc.nextDouble());
    }

    public void fecharCaixa(){
        System.out.println("Fechando caixa...");
    }
}
