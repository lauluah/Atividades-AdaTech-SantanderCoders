package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicate1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,78,9,97,5,3,2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero limite: ");
        int limit = sc.nextInt();
        System.out.println("Deseja filtrar números (1) Maiores ou (2) Menores que o limite? ");
        int res = sc.nextInt();

        Predicate<Integer> filter;
        if (res == 1) {
            filter = (n) -> n >= limit;
        } else if (res == 2) {
           filter = (n) -> n <= limit;
        } else {
            System.out.println("Escolha inválida! Por favor, selecione 1 ou 2.");
            return;
        }

        List<Integer> filteredNumbers = numbers.stream().filter(filter).toList();

        System.out.println(filteredNumbers);
    }
}
