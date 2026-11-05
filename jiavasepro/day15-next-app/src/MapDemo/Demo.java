package MapDemo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Map<String,List<String>> map = new HashMap<>();
        List<String> cities = new ArrayList<>();
        Collections.addAll(cities,"南京市","扬州市","苏州市","无锡市","常州市");
        map.put("江苏",cities);

        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        map.put("湖北",cities1);

        map.forEach((p,c)->{
            System.out.println(p+"------>"+c);
        });
    }
}
