package br.edu.ifs.academico;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    private String raca;
    private String corDoPelo;
    private String comportamento;
    private boolean habilidadeCaca;
    private int quantidadeRonronar;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public boolean isHabilidadeCaca() {
        return habilidadeCaca;
    }

    public void setHabilidadeCaca(boolean habilidadeCaca) {
        this.habilidadeCaca = habilidadeCaca;
    }

    public int getQuantidadeRonronar() {
        return quantidadeRonronar;
    }

    public void setQuantidadeRonronar(int quantidadeRonronar) {
        this.quantidadeRonronar = quantidadeRonronar;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "comportamento='" + comportamento + '\'' +
                ", raca='" + raca + '\'' +
                ", corDoPelo='" + corDoPelo + '\'' +
                ", habilidadeCaca=" + habilidadeCaca +
                ", quantidadeRonronar=" + quantidadeRonronar +
                "} " + super.toString();
    }
}
