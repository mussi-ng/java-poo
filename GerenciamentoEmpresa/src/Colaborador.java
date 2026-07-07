import java.util.Scanner;

/**
 * Classe base para representar um colaborador da empresa.
 *
 * <p>
 * Mantém dados comuns (nome, email, senha) e a flag de permissão de admin.
 * </p>
 */
public class Colaborador {
    /**
     * Scanner usado pelos métodos de fluxo interativo do sistema.
     */
    protected Scanner sc = new Scanner(System.in);

    /** Nome do colaborador. */
    private String nome;
    /** Email do colaborador. */
    private String email;
    /** Senha do colaborador. */
    private String senha;
    /** Indica se o colaborador possui privilégios administrativos. */
    private boolean admin;

    /**
     * Construtor principal.
     *
     * <p>
     * A flag {@code admin} é definida no momento da criação e repassada às
     * classes filhas.
     * </p>
     */
    // Construtor criado para nao ter alteração de admin das classes que herdaram
    /**
     * @param nome nome do colaborador.
     * @param email email do colaborador.
     * @param senha senha do colaborador.
     * @param admin true se for admin, false caso contrário.
     */
    public Colaborador(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    /**
     * @return true se o colaborador é admin, caso contrário false.
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * @return nome do colaborador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return email do colaborador.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Atualiza o email do colaborador.
     * @param email novo email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return senha do colaborador.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Atualiza a senha do colaborador.
     * @param senha nova senha.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Método privado de demonstração de login (imprime mensagem).
     */
    private void login(){
        System.out.println(this.getNome() + " realizou o login...");
    }

    /**
     * Método privado de demonstração de logout (imprime mensagem).
     */
    private void logout(){
        System.out.println(this.getNome() + " realizou o logout...");
    }

    /**
     * Altera dados do colaborador (email), lendo via {@link #sc}.
     */
    private void alterarDados(){
        System.out.println("Altere seu email");
        setEmail(sc.nextLine());

        System.out.println(this.getNome() + " mudou o email");
        System.out.println("Novo email: " + this.getEmail());
    }

    /**
     * Altera a senha do colaborador, lendo via {@link #sc}.
     */
    private void alterarSenha(){
        System.out.println("Escreva a nova senha");
        setSenha(sc.nextLine());

        System.out.println(this.getNome() + " mudou a senha");
        System.out.println("Nova senha: " + this.getSenha());
    }
}
