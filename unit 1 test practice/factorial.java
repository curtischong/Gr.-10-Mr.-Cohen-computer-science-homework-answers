import java.util.Scanner;
public class factorial{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("give me a number to give you the factorials");
        int num = scanner.nextInt();
        int small = num;
        while (num > 0){
            System.out.print(num + " ");
            num--;
            small = small *num;
        }
        System.out.println(small);
    }
}