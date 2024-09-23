import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        Double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        Double num3 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        Double result;

        switch (operator) {
            case '+':
                result = num1 + num2 + num3;
                break;
            case '-':
                result = num1 - num2 - num3;
                break;
            case '*':
                result = num1 * num2 * num3;
                break;
            case '/':
                result = num1 / num2 / num3;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+" "+num3+": "+result);
    }
}

