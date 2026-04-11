package entities;

public class Pessoa {
    private String nome;
    private double altura;
    private int idade;

    public Pessoa(String nome, double altura, int idade){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
