/**
 * Implementação de um relógio em formato 12h (US), representado por AM/PM.
 */
public non-sealed class USRelogio extends Relogio {
    /** Indicador de período (AM ou PM). */
    private String indicadorDePeriodo;

    /**
     * @return indicador de período ("AM" ou "PM").
     */
    public String getIndicadorDePeriodo() {
        return indicadorDePeriodo;
    }


    /** Define o relógio para o período PM. */
    public void setDepoisDoMeioDia(){
        this.indicadorDePeriodo = "PM";
    }

    /** Define o relógio para o período AM. */
    public void setAntesDoMeioDia(){
        this.indicadorDePeriodo = "AM";
    }


    /**
     * Ajusta a hora no formato 12h e define automaticamente AM/PM.
     *
     * @param hora valor de entrada (assumido no intervalo 0..24+).
     */
    public void setHora(int hora) {
        setAntesDoMeioDia();
        if ((hora >= 12) && (hora <= 23)){
            this.indicadorDePeriodo = "PM";
            this.hora = hora - 12;
        } else if (hora >= 24) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }


    /**
     * Converte um relógio de origem para a representação US (12h).
     */
    @Override
    Relogio conversor(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case USRelogio usRelogio -> {
                this.hora = usRelogio.getHora();
                this.indicadorDePeriodo = getIndicadorDePeriodo();
            }
            case BRLRelogio brlRelogio -> this.setHora(brlRelogio.getHora());
        }
    return this;
    }


    /**
     * @return tempo no formato "hora:minuto:segundo AM/PM".
     */
    @Override
    public String getTempo() {
        return super.getTempo() + " " + this.indicadorDePeriodo;
    }
}

