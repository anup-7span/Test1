import java.util.Scanner;

public class MyDemo {

    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num");
        n=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
