import java.util.*;
public class orseshoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        HashSet<Integer> h=new HashSet<>();
        h.add(a);
        h.add(b);
        h.add(c);
        h.add(d);

        System.out.println(4-h.size());
    }
    
}
