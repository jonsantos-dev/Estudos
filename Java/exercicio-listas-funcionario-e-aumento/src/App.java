import java.util.Scanner;
import java.util.Locale;
import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String nome = "";
        double salario = 0.00;

        Funcionario novoFuncionario;

        
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();


        System.out.println("Informe quantos funcionários deseja cadastrar: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {

            boolean idJaExiste = false;
            
            do {

                System.out.printf("Digite o ID do %d° funcionario: ", i+1);
                int idParaVerificar = sc.nextInt();
                sc.nextLine();
                
                idJaExiste = funcionarios.stream()
                .anyMatch(obj -> obj.getId() == idParaVerificar);

                if(idJaExiste) {
                    System.out.println("Esse ID já existe, vamos tentar novamente.");
                } else {
                    id = idParaVerificar;
                }
                    
            } while (idJaExiste == true);

            
            
            System.out.printf("Digite o nome do %d° funcionario: ", i+1);
            nome = sc.nextLine();
            System.out.printf("Digite o salario do %d° funcionario: ", i+1);
            salario = sc.nextDouble();
            sc.nextLine();

            novoFuncionario = new Funcionario(id, nome, salario);
            funcionarios.add(novoFuncionario);

        }

        int escolha;
        do {
            System.out.printf("Escolha uma das opções abaixo: %n1 - Dar aumento%n2 - Encerrar sessão");
            escolha = sc.nextInt();

            if(!(escolha == 1) || (escolha == 2)) {
                System.out.println("Valor inválido, Digite 1 ou 2");
            } else if (escolha == 1) {
                
                boolean idJaExiste;

                do {

                    System.out.printf("Digite o ID do funcionario: ");
                    int idParaVerificar = sc.nextInt();
                    sc.nextLine();
                    
                    idJaExiste = funcionarios.stream()
                    .anyMatch(obj -> obj.getId() == idParaVerificar);

                    if(idJaExiste == false) {
                        System.out.println("Não existe funcionário cadastrado com esse ID, vamos tentar novamente.");
                    } else {
                        System.out.println("Informe quantos % deseja dar de aumento: ");
                        double porcentagemAumento = sc.nextDouble();
                        sc.nextLine();
                        
                    }
                    
                } while (idJaExiste == false);
            }

        } while (!(escolha == 1) || (escolha == 2));

        System.out.println(funcionarios);

        System.out.println("Fim da sessão");

        sc.close();
    }
}
