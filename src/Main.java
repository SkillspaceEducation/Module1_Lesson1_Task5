/*
1. Написать метод, принимающий на вход четырехзначное число abcd и возвращающий сумму ab + cd
2. Получать число abcd через scanner в методе main
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое четырехзначное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("\nВозможно выполнение арифметических операций с этими числами, результат сложения этих чисел равен " + numberConvers(number) + ".");
    }
    static int numberConvers(int i){
        int a = i / 1000; // получение первой цифры из числа
        int b = (i % 1000) / 100; // получение второй цифры из числа
        int c = (i % 100) / 10; // получение третей цифры из числа
        int d = ((i % 1000) % 100) % 10; // получение четвертой цифры из числа
        int number1 = operWithDigit(a,b);
        int number2 = operWithDigit(c,d);
        System.out.printf("Число %d возможно разделить на два числа %d и %d.", i, number1, number2);
        return number1 + number2;
    }
    static int operWithDigit(int num1, int num2){
        String twoNumInOne = Integer.toString(num1) + Integer.toString(num2); // объединение двух чисел в строку
        return Integer.parseInt(twoNumInOne); // обратное пребразование полученного числа в целый тип
    }
}