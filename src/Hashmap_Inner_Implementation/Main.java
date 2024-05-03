package Hashmap_Inner_Implementation;

public class Main {
    public static void main(String[] args) {
       OurHashMap<Integer,String> map=new OurHashMap<>();
       map.put(3,"sishtum");
       map.put(5,"hang");
       map.put(1,"laddu gopal");
       map.put(2,"kapil");

//       map.remove(3);

        System.out.println(map.get(3));
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        System.out.println(map.get(2));


    }
}
