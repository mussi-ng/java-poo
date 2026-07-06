import java.util.Scanner;

public class Colaborador {
    protected Scanner sc = new Scanner(System.in);

    private String nome;
    private String email;
    private String senha;
    private boolean admin;

    //Construtor criado para nao ter alteração de admin das classes que herdaram
    public Colaborador(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private void login(){
        System.out.println(this.getNome() + " realizou o login...");
    }

    private void logout(){
        System.out.println(this.getNome() + " realizou o logout...");
    }

    private void alterarDados(){
        System.out.println("Altere seu email");
        setEmail(sc.nextLine());

        System.out.println(this.getNome() + " mudou o email");
        System.out.println("Novo email: " + this.getEmail());
    }

    private void alterarSenha(){
        System.out.println("Escreva a nova senha");
        setSenha(sc.nextLine());

        System.out.println(this.getNome() + " mudou a senha");
        System.out.println("Nova senha: " + this.getSenha());
    }
}
