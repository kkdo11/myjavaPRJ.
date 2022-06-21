import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("name", "1");
        map.put("name1", "2");

        list.add(map);
        map = null;


        map = new HashMap<>();
        map.put("name", "3");
        map.put("name1", "4");

        list.add(map);
        map = null;


        list.forEach(rMap -> {
                    System.out.println(rMap.get("name"));
                    System.out.println(rMap.get("name1"));
                }
        );
    }
}