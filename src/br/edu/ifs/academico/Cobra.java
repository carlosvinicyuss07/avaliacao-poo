package br.edu.ifs.academico;

public class Cobra extends Animal {

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
}
