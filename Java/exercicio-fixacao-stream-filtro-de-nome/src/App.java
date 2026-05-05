import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> nomes = new ArrayList<>();

        nomes.add("jonathan");
        nomes.add("rafaela");
        nomes.add("maia");
        nomes.add("maria");
        nomes.add("gabriela");

        List<String> resultado = nomes.stream()
        .filter(x -> x.length() > 5)
        .collect(Collectors.toList());

        System.out.println(resultado);
        System.out.println("Fim do programa");
    }
}
