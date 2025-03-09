package br.edu.ifs.academico;

public class Urso extends Animal {

    public Urso(String nome) {
        super(nome);
    }

    private String corDoPelo;
    private boolean canSwin; //indica se o urso sabe nadar
    private String tipoDeFocinho; //(ex:comprido, médio)
    private String tamanho;

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public boolean isCanSwin() {
        return canSwin;
    }

    public void setCanSwin(boolean canSwin) {
        this.canSwin = canSwin;
    }

    public String getTipoDeFocinho() {
        return tipoDeFocinho;
    }

    public void setTipoDeFocinho(String tipoDeFocinho) {
        this.tipoDeFocinho = tipoDeFocinho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Urso{" +
                "canSwin=" + canSwin +
                ", corDoPelo='" + corDoPelo + '\'' +
                ", tipoDeFocinho='" + tipoDeFocinho + '\'' +
                ", tamanho='" + tamanho + '\'' +
                "} " + super.toString();
    }
}
