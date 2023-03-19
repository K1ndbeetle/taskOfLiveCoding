import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> keyValue = new HashMap<Integer,String>();
        keyValue.put(1, "Первый");
        keyValue.put(2, "Второй");
        keyValue.put(3, "Третий");
        //Цикл While
        Iterator iter = keyValue.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry x = (Map.Entry) iter.next();
            System.out.println("Ключ это " + x.getKey() + " Значение это " + x.getValue());
        }
        System.out.println();
        //Цикл For
        for(Map.Entry s : keyValue.entrySet()) {
            System.out.println("Ключ это: " + s.getKey() + " Значение это: " + s.getValue());
        }
    }
}
