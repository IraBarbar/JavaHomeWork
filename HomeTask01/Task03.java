// 3. Реализовать простой калькулятор
package HomeTask01;

import java.util.Scanner;

public class Task03 {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Input the fist number: ");
    int num1 = iScanner.nextInt();

    System.out.printf("Input  symbol: ");
    String sym = iScanner.next();

    System.out.printf("Input the second  number: ");
    int num2 = iScanner.nextInt();
    iScanner.close();
    
    int res = 0;

    switch (sym) {
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
        res = num1/num2;
      break;            

      default:
          System.out.println("Mistake!");
        break;

      }
      System.out.printf("\t %d %s %d = %d", num1, sym, num2, res);
      System.out.println();  

  }
}
