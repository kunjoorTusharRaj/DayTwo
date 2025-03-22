import java.util.Scanner;

public class evenorodd {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("enter a number ");
            int num = s.nextInt();
            if(num%2==0){
                System.out.println("even");
                return;
            }else{
                System.out.println("odd");
            }
        } catch (Exception e) {
            System.out.println("errot message "+e);
        }
    }
}