/**
 * Representa um vendedor (não admin) e controla quantidade de vendas.
 */
public class Vendedor extends Colaborador{
    /** Quantidade total de vendas. */
    private int quantDeVendas;
    /**
     * Variável auxiliar.
     * (Observação: a lógica de soma usa esse campo conforme o código original.)
     */
    private int venda;
    /**
     * Qualquer vendedor que for criado nunca será admin.
     */
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    /**
     * @return quantidade de vendas acumulada.
     */
    public int getQuantDeVendas() {
        return quantDeVendas;
    }

    /**
     * Atualiza a quantidade de vendas usando a regra existente no código.
     *
     * @param quantDeVendas quantidade a somar.
     */
    public void setQuantDeVendas(int quantDeVendas) {
        this.quantDeVendas = venda + quantDeVendas;
    }
}
