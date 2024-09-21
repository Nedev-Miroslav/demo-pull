public class Calculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = Integer.ParseInt(scanner.nextLine);
        int SecondNumber = Integer.ParseInt(scanner.nextLine);
        
        System.out.println(firstNumber + SecondNumber);
    }
}
