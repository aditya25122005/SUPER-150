import java.util.*;
public class translation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int l=0;
        int r=s.length()-1;

        char[] chars = s.toCharArray();
        while(l<r){
            char ch= chars[l];
            chars[l]=chars[r];
            chars[r]=ch;
            l++;
            r--;
        }
        s=new String(chars);
        if(s.equals(t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        

        
    }
}