package MapDemo;

import java.util.*;

public class mapDemo {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        String[] selects = {"A","B","C","D"};
        Random re = new Random();
        for (int i = 1; i <= 80; i++) {
            int index = re.nextInt(4);
            data.add(selects[index]);
        }
        System.out.println(data);

        Map<String,Integer> result = new HashMap<>();
        for (String s : data) {
            if(result.containsKey(s)){
                result.put(s,result.get(s)+1);
            }else{
                result.put(s,1);
            }
        }
        System.out.println(result);
    }
}
