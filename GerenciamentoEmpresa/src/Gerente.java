public class Gerente extends Colaborador {
    private String relatorio;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    public void gerarRelatorio(){
        System.out.println("Escreva o relatório");
        setRelatorio(sc.nextLine());

        System.out.println("Relatório feito com sucesso!");
    }
}
