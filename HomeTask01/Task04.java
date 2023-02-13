/* 
4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
восстановить выражение до верного равенства. Предложить хотя бы
одно решение или сообщить, что его нет.
*/
package HomeTask01;

public class Task04 {
    public static void main(String[] args) {

        String[] strFunc = new String[] { "1?", "+", "?2", "=", "35" };
        String symbol = "?";
        int w = 0;
        int q = 0;
        for (String item : strFunc) {
            // находим w через ? в начале:
            if (item.startsWith(symbol)) {
                String wStr = item.replace(symbol, "");
                w = Integer.parseInt(wStr);
            }
            // находим q через ? в конце:
            if (item.endsWith(symbol)) {
                String qString = item.replace(symbol, "0");
                q = Integer.parseInt(qString);
            }
            
        }
        // находим e , просто берем последее значение:
        String eString = strFunc[strFunc.length - 1];
        int e = Integer.parseInt(eString);

        int res = e - w - q;  

        int res_w = res/10;
        String temp =Integer.toString(res_w) + Integer.toString(w) ;
        w = Integer.parseInt(temp);
        
        int res_q = res%10;
        
        temp = Integer.toString(q);
        temp = temp.replace("0", "");
        temp = temp+Integer.toString(res_q) ;
        q = Integer.parseInt(temp);
        
        if (e == sum(q, w)){
            System.out.printf("\t %d + %d = %d", q, w, sum(q,w));;
        }
        else {
            System.out.println("Решений нет!");
        }
    }

    static int sum(int q, int w) {
        int e = q + w;
        return e;
    }
}
