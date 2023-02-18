import java.util.Scanner;

public class ConditionalDemos {

    public static void main(String[]  args){
        int number;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        number=scanner.nextInt();

        if(number % 2==0) {
            System.out.println("number is even");

        }else{
            System.out.println("number is odd");
        }

    }
}
