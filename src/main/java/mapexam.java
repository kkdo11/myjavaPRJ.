import java.util.HashMap;
import java.util.Map;

public class mapexam {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
//              key값  ,  value key는 중복이 허용되지 않음
        map.put("name","김도원");
        map.put("email","kdw030612");
        map.put("dept","데이터분석과");

        System.out.println("-------------------------");


        System.out.println(map.get("name"));
        System.out.println(map.get("email"));
        System.out.println(map.get("dept"));


        System.out.println("-------------------------");
    }
}
