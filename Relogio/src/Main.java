/**
 * Classe de teste para demonstrar a conversão entre BRL (24h) e US (12h).
 */
void main() {
    // Cria um relógio BRL (24h) e configura hora/minuto/segundo.
    Relogio brlRelogio = new BRLRelogio();
    brlRelogio.setMinuto(0);
    brlRelogio.setSegundo(0);
    brlRelogio.setHora(25);

    // Exibe o horário atual no formato BRL (24h).
    System.out.println(brlRelogio.getTempo());

    // Converte para US (12h) e exibe o resultado.
    System.out.println(new USRelogio().conversor(brlRelogio).getTempo());
}

