package entities;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;


    public Funcionario(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void aumentoSalario(double porcentage){
        salario = salario + (salario * porcentage) / 100;
    }

    public String toString(){
        return "\nDADOS DO FUNCIONARIO\n\n" + "ID: " + id + "\nNOME: " + nome + String.format("\nSalario: %.2f", salario);
    }

}
