package br.edu.ifs.academico;

public class Cao extends Animal {

    private String raca;
    private String tamanho;
    private int nivelEnergia;
    private boolean obediente;
    private boolean habilidadeGuarda;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public boolean isObediente() {
        return obediente;
    }

    public void setObediente(boolean obediente) {
        this.obediente = obediente;
    }

    public boolean isHabilidadeGuarda() {
        return habilidadeGuarda;
    }

    public void setHabilidadeGuarda(boolean habilidadeGuarda) {
        this.habilidadeGuarda = habilidadeGuarda;
    }
}
