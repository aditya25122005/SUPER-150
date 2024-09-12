import java.util.*;
public class stringtask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        String s=sc.nextLine();
        String s1=s.replaceAll("[aeiouyAEIOUY]", "");
        // String ans;
        for(int i=0;i<s1.length();i++){
            ans.append(".");
            ans.append(String.valueOf(s1.charAt(i)).toLowerCase());
        }
        System.out.println(ans);
        


    }
    
}
