// 2 . Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

package HomeTask02;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task02 {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task02.class.getName());  
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

        int[] arr = new int[] { 1, 9, 4, 7, 3 };
        boolean isSorted = false;
        while (!isSorted) {
            isSorted= true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    logger.info(Arrays.toString(arr));
                }    
            }
        }
    }
}