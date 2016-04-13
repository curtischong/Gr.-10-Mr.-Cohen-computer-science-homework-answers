import java.util.Scanner;
public class Test{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Give me a number");
        int number = scanner.nextInt();
        repeater(number);
    }
    public static void repeater(int num){
        double halfwayPoint = (double)num;
        halfwayPoint = halfwayPoint/2.0;
        halfwayPoint = Math.round(halfwayPoint);
        for(int i = 1; i < num+1;i++){
            if(i == (int)halfwayPoint && num%2 == 1){
                System.out.print("$");
            }else{
                System.out.print(num);
            }
        }
    }
}