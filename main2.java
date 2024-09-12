import java.util.Scanner;
public class main2{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min=sc.nextInt();
		int max=sc.nextInt();
		int step=sc.nextInt();

		for(int i=min;i<=max;i+=step){
			double c=(5/9)*(i-32);
			System.out.println(i+"\t"+(int)c);
		}
    }

}