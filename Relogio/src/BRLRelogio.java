/**
 * Implementação de um relógio em formato 24h (BRL).
 */
public non-sealed class BRLRelogio extends Relogio {

    /**
     * Converte um relógio de origem para a representação BRL (24h).
     */
    @Override
    public Relogio conversor(final Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio){
            // Caso origem esteja em 12h (US), converte para 24h somando 12h quando PM.
            case USRelogio usRelogio ->
                this.hora = (usRelogio.getIndicadorDePeriodo().equals("PM")) ?
                        usRelogio.getHora() + 12 :
                        usRelogio.getHora();
            // Caso origem já esteja em 24h (BRL), apenas copia a hora.
            case BRLRelogio brlRelogio -> this.hora = brlRelogio.getHora();
        }


        return this;
    }


}
