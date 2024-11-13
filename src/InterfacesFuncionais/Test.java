package InterfacesFuncionais;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 25);

            // Usando peek para depuração em um pipeline
            List<Integer> resultado = numeros.stream()
                    .filter(n -> n > 10) // Filtra números maiores que 10
                    .peek(n -> System.out.println("Após filtro: " + n)) // Inspeciona após o filtro
                    .map(n -> n * 2) // Multiplica por 2
                    .peek(n -> System.out.println("Após multiplicação: " + n)) // Inspeciona após a multiplicação
                    .toList();

            System.out.println(STR."Resultado final: \{resultado}"); // Resultado: [20, 30, 50]
        }
    }


