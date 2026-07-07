/**
 * Representa um gerente, que possui permissão admin.
 *
 * <p>
 * O gerente pode gerar um relatório textual que fica armazenado na instância.
 * </p>
 */
public class Gerente extends Colaborador {
    /** Conteúdo do relatório gerado. */
    private String relatorio;

    /**
     * @param nome nome do gerente.
     * @param email email do gerente.
     * @param senha senha do gerente.
     */
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    /**
     * @return relatório atual.
     */
    public String getRelatorio() {
        return relatorio;
    }

    /**
     * Atualiza o relatório.
     *
     * @param relatorio novo conteúdo do relatório.
     */
    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    /**
     * Solicita ao usuário o conteúdo do relatório e armazena em {@link #relatorio}.
     */
    public void gerarRelatorio(){
        System.out.println("Escreva o relatório");
        setRelatorio(sc.nextLine());

        System.out.println("Relatório feito com sucesso!");
    }
}

