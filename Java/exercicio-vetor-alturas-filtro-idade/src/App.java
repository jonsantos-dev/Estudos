import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade, quantidade, quantidadeIdadeAbaixo = 0;
        double altura, mediaAltura, porcentagemIdade, somaAltura =0;

        System.out.print("Digite a quantidade de pessoas voce quer cadastrar: ");
        quantidade = sc.nextInt();
        sc.nextLine();

        String[] vetNome = new String[quantidade];
        double[] vetAltura = new double[quantidade];
        int[] vetIdade = new int[quantidade];

        for (int i = 0; i < vetNome.length; i++) {
            System.out.printf("Cadastre o %d° nome: ", i+1);
            nome = sc.nextLine();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();

            Pessoa novaPessoa = new Pessoa(nome, altura, idade);
            vetNome[i] = novaPessoa.getNome();
            vetAltura[i] = novaPessoa.getAltura();
            vetIdade[i] = novaPessoa.getIdade();

            if (idade < 16) {
                quantidadeIdadeAbaixo += 1;
            }

            somaAltura += altura;
            
        }

        mediaAltura = somaAltura/quantidade;
        porcentagemIdade = (double) (quantidadeIdadeAbaixo * 100) / quantidade;

        System.out.printf("Altura media: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.2f", porcentagemIdade);
        System.out.println("%");
        

        for (int i = 0; i < vetNome.length; i++) {
            if (vetIdade[i] < 16) {
                System.out.println(vetNome[i]);
            }
        }

        // Pessoa novaPessoa = new Pessoa();

        sc.close();
    }
}
