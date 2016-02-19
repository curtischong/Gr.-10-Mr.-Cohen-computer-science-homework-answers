import java.util.Scanner;
public class grade{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    System.out.println("give me a grade");
    double gr1 = scanner.nextDouble();
    System.out.println("give me a grade");
    double gr2 = scanner.nextDouble();
    System.out.println("give me a grade");
    double gr3 = scanner.nextDouble();
    System.out.println("give me a grade");
    double gr4 = scanner.nextDouble();
    System.out.println("give me a grade");
    double gr5 = scanner.nextDouble();
    double totalGrades = gr1+gr2+gr3+gr4+gr5;
    double percent = totalGrades/5;
    System.out.println("your average is "+percent+"%");
    }
}