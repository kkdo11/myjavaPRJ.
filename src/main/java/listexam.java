import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listexam {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        {

            list.add("존나");
            list.add("어렵네");
            list.add("조진듯");

            list.forEach(k -> System.out.println(" : " + k));
        }

        List<String> list2 = new LinkedList<>();
        {

            list2.add("순서가");
            list2.add("바뀌냐?");

            list2.forEach(seq -> System.out.println("seq : " + seq));
        }

        List<String> pList = new ArrayList<>();{

        pList.add("이협건");
        pList.add("고길동");
        pList.add("둘리");

        pList.forEach(name->System.out.println(name));
    }}
}