import java.util.Scanner;
public class students{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("How many students?");
    int numOfStudents = scanner.nextInt();
    System.out.println("How many groups?");
    int numOfGroups = scanner.nextInt();
    int remainder = numOfStudents%numOfGroups;
    int finalGroups = numOfStudents/numOfGroups;
    System.out.println(remainder +" "+finalGroups);
    }
}