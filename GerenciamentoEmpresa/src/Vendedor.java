public class Vendedor extends Colaborador{
    private int quantDeVendas;
    private int venda;
    //Qualquer vendedor que for criado nunca será admin
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public int getQuantDeVendas() {
        return quantDeVendas;
    }

    public void setQuantDeVendas(int quantDeVendas) {
        this.quantDeVendas = venda + quantDeVendas;
    }
}
