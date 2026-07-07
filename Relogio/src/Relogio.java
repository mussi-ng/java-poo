/**
 * Classe base para representar um relógio com horário em formato 24h (BRL)
 * ou 12h (US) por meio das especializações.
 *
 * <p>
 * Responsável por armazenar hora/minuto/segundo e fornecer operações básicas
 * de acesso e validação.
 * </p>
 */
public sealed abstract class Relogio permits BRLRelogio, USRelogio {
    /** Hora do relógio (varia conforme a implementação concreta). */
    protected int hora;
    /** Minuto do relógio. */
    protected int minuto;
    /** Segundo do relógio. */
    protected int segundo;

    /**
     * @return segundo atual.
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Define o segundo do relógio, limitando valores acima do máximo permitido.
     *
     * @param segundo valor do segundo.
     */
    public void setSegundo(int segundo) {
        if (segundo > 60){
            this.segundo =60;
            return;
        }
        this.segundo = segundo;
    }

    /**
     * @return minuto atual.
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Define o minuto do relógio, limitando valores acima do máximo permitido.
     *
     * @param minuto valor do minuto.
     */
    public void setMinuto(int minuto) {
        if (minuto > 60){
            this.minuto =60;
            return;
        }
        this.minuto = minuto;
    }

    /**
     * @return hora atual.
     */
    public int getHora() {
        return hora;
    }

    /**
     * Define a hora do relógio.
     *
     * @param hora valor da hora (será limitada quando exceder o máximo).
     */
    public void setHora(int hora) {
        if (hora > 24) {
            this.hora = 24;
        }

    }

    /**
     * @return string com o tempo no formato "hora:minuto:segundo".
     */
    public String getTempo(){
        return hora + ":" + minuto + ":" + segundo;
    }

    /**
     * Converte o horário recebido para o formato/sistema do relógio concreto.

     *
     * @param relogio relógio de origem.
     * @return esta instância após a conversão.
     */
    abstract Relogio conversor(Relogio relogio);
}
