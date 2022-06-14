import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1е число");
        int operand1 = scanner.nextInt();
        System.out.println("Введите операцию");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите 2е число");
        int operand2 = scanner.nextInt();
        System.out.println(operand1+ " " +operation+ " " +operand2+ " =" +calculate(operand1, operand2, operation));
    }
    public static int calculate (int operand1, int operand2, char operation) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> {
                System.out.println("Операция нераспознана");
                yield 0;
            }
        };
    }
}
