package Step12_UtilClass.test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass16 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("송태정");
        names.add("김태준");
        names.add("김혜란");
        names.add("오영찬");
        names.add("이승우");

        // 반복자 객체 생성
        Iterator<String> it = names.iterator();
        // 더이상 데이터가 없을 때까지 수행
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);
        }
    }
}
