import java.util.Scanner;

public class evenorodd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = s.nextInt();
        if(num%2==0){
            System.out.println("even");
            return;
        }else{
            System.out.println("odd");
        }
    }
}