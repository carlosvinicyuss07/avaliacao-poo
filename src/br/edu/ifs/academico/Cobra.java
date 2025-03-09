package br.edu.ifs.academico;

public class Cobra extends Animal {

    public Cobra(String nome) {
        super(nome);
    }

    private String ambientePrincipal; //terrestre ou aquático
    private boolean venenosa; //indica se a cobra é venenosa ou não
    private boolean peconhenta;
    private String padraoDePele; //(ex: listrada, manchada)

    public String getAmbientePrincipal() {
        return ambientePrincipal;
    }

    public void setAmbientePrincipal(String ambientePrincipal) {
        this.ambientePrincipal = ambientePrincipal;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public boolean isPeconhenta() {
        return peconhenta;
    }

    public void setPeconhenta(boolean peconhenta) {
        this.peconhenta = peconhenta;
    }

    public String getPadraoDePele() {
        return padraoDePele;
    }

    public void setPadraoDePele(String padraoDePele) {
        this.padraoDePele = padraoDePele;
    }

    @Override
    public String toString() {
        return "Cobra{" +
                "ambientePrincipal='" + ambientePrincipal + '\'' +
                ", venenosa=" + venenosa +
                ", peconhenta=" + peconhenta +
                ", padraoDePele='" + padraoDePele + '\'' +
                "} " + super.toString();
    }
}
