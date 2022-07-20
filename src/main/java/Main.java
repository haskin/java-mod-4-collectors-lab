import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Main {

    // modify this method
    public static long multiplySquaresOfNumbers(List<Integer> numbers) {
        return numbers.stream().map(ele -> ele * ele)
                .collect(Collectors.reducing((product, individual) -> product * individual)).get();
    }

    public static void main(String[] args) {
        System.out.println("Input number values to get a product of all squared values : ");
        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String val : values) {
            numbers.add(Integer.parseInt(val));
        }

        long val = multiplySquaresOfNumbers(numbers);

        System.out.println(val);

        scanner.close();
    }
}