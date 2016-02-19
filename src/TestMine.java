import java.util.Map;


public class TestMine {

    public static void main(String[] args) {


        MyHashMap mHM = new MyHashMap();
        Map<Integer, String> map = new MyHashMap<>();
        map.put(17, "qq11114");
        map.put(2, "qq1");
        map.put(3, "qq2");
        map.put(1, "A1");
        System.out.println(map.get(17));
        map.put(17, "A2");
        map.put(8, "qq4");
        map.put(33, "A3");
        System.out.println("Get");

        System.out.println(map.get(8));
        System.out.println(map.get(3));


        System.out.println(map.get(2));
        System.out.println(map.get(1));
        System.out.println(map.get(17));
        System.out.println(map.get(33));

        System.out.println(map.remove(3));
        System.out.println(map.remove(33));

        System.out.println(map.get(1));
        System.out.println(map.get(17));
        System.out.println(map.get(33));

        System.out.println(map.get(3));
        map.put(3, "N2");
        System.out.println(map.get(3));
    }


}