import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2 = 0;

        System.out.println("Калькулятор запущен!\nДля очистки значения введите C , для выхода введите S в выборе операции:");
        System.out.println("Введите первое число:");
        num1 = scanner.nextInt();

        while (true) {
            System.out.println("Введите операцию (+, -, *, /)или C, S:");
            String operation = scanner.next();

            int res = 0;

            switch (operation) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        res = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Неверная операция.Ввведите снова");
                    continue;   //Служит для того чтобы поссле ввода неверного значения цикл начался с начала(с 12 строки"while)
                case "S":
                    System.out.println("Пока пока!");
                    System.exit(0);
                case "C":
                    System.out.println("Значение очищено!");
                    System.out.println("Введите первое число:");
                    num1 = scanner.nextInt();
                    continue;   //Служит для того чтобы поссле ввода "С" цикл начался с начала(с 12 строки"while)

            }
            System.out.println("Введите второе число:");
            num2 = scanner.nextInt();

            System.out.print("Ответ:");

            switch (operation) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        res = num1 / num2;
                    } else {
                        System.out.println("На 0 делить нельзя!");
                        continue;
                    }
                    break;
            }
            System.out.println(res);
            num1 = res;
        }

    }
}
