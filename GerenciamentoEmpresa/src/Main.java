void main() {
    System.out.println("===== TESTE GERENTE =====");

    Gerente gerente = new Gerente(
            "Carlos",
            "carlos@email.com",
            "123456"
    );

    System.out.println("Nome: " + gerente.getNome());
    System.out.println("Email: " + gerente.getEmail());
    System.out.println("Senha: " + gerente.getSenha());
    System.out.println("Admin: " + gerente.isAdmin());

    gerente.setEmail("novoemail@email.com");
    gerente.setSenha("novasenha");

    System.out.println("\nApós alteração:");
    System.out.println("Email: " + gerente.getEmail());
    System.out.println("Senha: " + gerente.getSenha());

    gerente.gerarRelatorio();
    System.out.println("Relatório:");
    System.out.println(gerente.getRelatorio());



    System.out.println("\n===== TESTE VENDEDOR =====");
    Vendedor vendedor = new Vendedor(
            "João",
            "joao@email.com",
            "abc123"
    );

    System.out.println("Nome: " + vendedor.getNome());
    System.out.println("Email: " + vendedor.getEmail());
    System.out.println("Admin: " + vendedor.isAdmin());

    vendedor.setQuantDeVendas(5);
    System.out.println("Quantidade de vendas: "
            + vendedor.getQuantDeVendas());


    System.out.println("\n===== TESTE ATENDENTE =====");

    Atendente atendente = new Atendente(
            "Maria",
            "maria@email.com",
            "senha123"
    );

    System.out.println("Nome: " + atendente.getNome());
    System.out.println("Email: " + atendente.getEmail());
    System.out.println("Admin: " + atendente.isAdmin());

    atendente.receberPagamento();
    atendente.adicionarAoCaixa(1000);
    System.out.println("Valor em caixa: "
            + atendente.getValorCaixa());

    atendente.fecharCaixa();
}

