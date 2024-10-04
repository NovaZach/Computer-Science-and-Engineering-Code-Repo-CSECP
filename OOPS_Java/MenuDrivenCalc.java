import java.util.Scanner;

public class MenuDrivenCalc {
    public static void main(String[] args) {
        int  choice, a, b, result;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(".Calculator Menu.");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first number: ");
                    a = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    b = scanner.nextInt();
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                    
                case 2:
                    System.out.println("Enter first number: ");
                    a = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    b = scanner.nextInt();
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;
                    
                case 3:
                    System.out.println("Enter first number: ");
                    a = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    b = scanner.nextInt();
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;
                    
                case 4:
                    System.out.println("Enter first number: ");
                    a = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    b = scanner.nextInt();
                    result = a / b;
                    System.out.println("Result: " + result);
                    break;
                    
                case 5:
                    System.out.println("lol bye");
                    break;
                    
                default:
                    System.out.println("PICK RIGHT");
            }
        } while (choice != 5);

        scanner.close();
    }
}

