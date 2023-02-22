// 2 . Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

package HomeTask02;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task02_LOG {

    public static void main(String[] args) throws IOException {
        try {

            Logger logger = Logger.getLogger(Task02_LOG.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);

            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            int[] arr = new int[] { 1, 9, 4, 7, 3 };
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
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
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}