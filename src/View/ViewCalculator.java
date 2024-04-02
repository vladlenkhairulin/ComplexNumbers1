package View;

import Model.Domain.ComplexNumber;
import Model.Interfaces.iCalculable;
import Model.Service.Decorator;

import java.util.Scanner;

public class ViewCalculator {
    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double realPart1 = promptDouble("Введите действительную часть первого аргумента: ");
            double imagPart1 = promptDouble("Введите мнимую часть первого аргумента: ");
            ComplexNumber firstNumber = new ComplexNumber(realPart1, imagPart1);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /) : ");
                if (cmd.equals("*")) {
                    double realPart = promptDouble("Введите действительную часть второго аргумента: ");
                    double imagPart = promptDouble("Введите мнимую часть второго аргумента: ");
                    ComplexNumber secondNumber = new ComplexNumber(realPart, imagPart);
                    calculator.multi(firstNumber, secondNumber);
                    break;
                }
                if (cmd.equals("+")) {
                    double realPart = promptDouble("Введите действительную часть второго аргумента: ");
                    double imagPart = promptDouble("Введите мнимую часть второго аргумента: ");
                    ComplexNumber secondNumber = new ComplexNumber(realPart, imagPart);
                    calculator.sum(firstNumber, secondNumber);
                    break;
                }
                // если пользователь введёт "/", программа произведёт деление первого числа на второе
                if (cmd.equals("/")){
                    double realPart = promptDouble("Введите действительную часть второго аргумента: ");
                    double imagPart = promptDouble("Введите мнимую часть второго аргумента: ");
                    ComplexNumber secondNumber = new ComplexNumber(realPart, imagPart);
                    calculator.div(firstNumber, secondNumber);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
