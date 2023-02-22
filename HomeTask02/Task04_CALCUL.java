//4*. К калькулятору из предыдущего дз добавить логирование.
package HomeTask02;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task04_CALCUL {
  public static void main(String[] args) throws IOException {
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/log_cal.txt");

    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Input the first number: ");
    double num1 = iScanner.nextDouble();

    System.out.printf("Input  symbol: ");
    String sym = iScanner.next();

    System.out.printf("Input the second  number: ");
    double num2 = iScanner.nextDouble();
    iScanner.close();
    double res = 0;
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
        res = num1 / num2;
        break;
      default:
        System.out.println("ERROR!");
        break;
    }
    String result = num1 + " " + sym + " " + num2 + " = " + res;
    strLog(result, pathFile);
  }

  public static void strLog(String str, String pathFile) throws IOException {
    try {
      Logger logger = Logger.getLogger(Task04_CALCUL.class.getName());
      FileHandler fh = new FileHandler(pathFile);
      logger.addHandler(fh);

      SimpleFormatter sFormat = new SimpleFormatter();
      fh.setFormatter(sFormat);
      logger.info(str);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
