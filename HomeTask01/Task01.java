// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)
package HomeTask01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input n: ");
        boolean flag = iScanner.hasNextInt();
        int n = iScanner.nextInt();
        iScanner.close(); // ввод числа от пользователя и проверка на число  безполезная

        int sum = 0;
        int pro = 1;
        int[] arr = new int[n];
        for (int i = 1; i < arr.length + 1; i++) {
            sum += i;
            pro *= i;
        }
        System.out.printf(
                "\t Треугольное значение от %d = %d\n\t Произведение от %d = %d", n, sum, n, pro);
    }

}