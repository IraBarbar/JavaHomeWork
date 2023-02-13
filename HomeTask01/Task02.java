// 2. Вывести все простые числа от 1 до 1000 
package HomeTask01;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int num = 1000;
        int j = 0;
        int[] arr = new int[168];
        for (int i = 2; i < 10; i++) {  
            if (i != 4 && i !=6 && i !=8 && i!=9) {
                arr[j]=i;
                j++;  
            }
        }
        for ( int i = 10; i < 100; i++) { 
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                arr[j]=i;
                j++;
            }    
        }
        for ( int i = 100; i < num+1; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 
            && i % 11 != 0 && i % 13 != 0 && i % 17 != 0
            && i % 19 != 0 && i % 23 != 0 && i % 29 != 0 && i % 31 != 0){
                arr[j]=i;
                j++;
            }      
        }    
        System.out.println(Arrays.toString(arr));
    }
}
