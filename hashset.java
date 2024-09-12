import java .util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(200);
        set.add(2);
        System.out.println(set);

        System.out.println("size is : "+set.size());

        if(set.contains(200)){
            System.out.println("yes it contains 200");
        }
        if(!set.contains(500)){
            System.out.println("It does not contain 500");
        }

        set.remove(200);
        Iterator it =set.iterator();

        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());

        


        System.out.println(set);
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
    
}
