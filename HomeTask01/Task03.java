// 3. Реализовать простой калькулятор
package HomeTask01;

import java.util.Scanner;

public class Task03 {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Input the first number: ");
    int num1 = iScanner.nextInt();

    System.out.printf("Input  symbol: ");
    String sym = iScanner.next();

    System.out.printf("Input the second  number: ");
    int num2 = iScanner.nextInt();
    iScanner.close();
    
    switch (sym) {
      case "+":
        System.out.printf("\t %d %s %d = %d", num1, sym, num2, num1 + num2);
        break;
      case "-":
        System.out.printf("\t %d %s %d = %d", num1, sym, num2, num1 - num2);
        break;
      case "*":
        System.out.printf("\t %d %s %d = %d", num1, sym, num2, num1 * num2);
        break;
      case "/":
        double num1D = num1; double num2D = num2;
        System.out.printf("\t %d %s %d = %.2f", num1, sym, num2, num1D/ num2D);
        break;

      default:
        System.out.println("ERROR!");
        break;
    }
  }
}
