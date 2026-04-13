import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> paresMultiplicados = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .collect(Collectors.toList());

        System.out.println(paresMultiplicados);
    }
}
