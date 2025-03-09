package br.edu.ifs.academico;

public class Animal {

    public Animal(String nome) {
        this.nome = nome;
    }

    private String nome;
    private int idade;
    private String especie;
    private double peso;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", especie='" + especie + '\'' +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }
}
