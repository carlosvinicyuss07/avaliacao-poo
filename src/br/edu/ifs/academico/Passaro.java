package br.edu.ifs.academico;

public class Passaro extends Animal {

    public Passaro(String nome) {
        super(nome);
    }

    private String tipoDeVoo;
    private double tamanhoAsas;
    private String corDasPenas;
    private boolean canSing;
    private double velocidadeVoo;

    public String getTipoDeVoo() {
        return tipoDeVoo;
    }

    public void setTipoDeVoo(String tipoDeVoo) {
        this.tipoDeVoo = tipoDeVoo;
    }

    public double getTamanhoAsas() {
        return tamanhoAsas;
    }

    public void setTamanhoAsas(double tamanhoAsas) {
        this.tamanhoAsas = tamanhoAsas;
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }

    public boolean isCanSing() {
        return canSing;
    }

    public void setCanSing(boolean canSing) {
        this.canSing = canSing;
    }

    public double getVelocidadeVoo() {
        return velocidadeVoo;
    }

    public void setVelocidadeVoo(double velocidadeVoo) {
        this.velocidadeVoo = velocidadeVoo;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "canSing=" + canSing +
                ", tipoDeVoo='" + tipoDeVoo + '\'' +
                ", tamanhoAsas=" + tamanhoAsas +
                ", corDasPenas='" + corDasPenas + '\'' +
                ", velocidadeVoo=" + velocidadeVoo +
                "} " + super.toString();
    }
}
