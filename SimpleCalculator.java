import java.util.Scanner;

public class SimpleCalculator {
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    static int sub(int n1, int n2) {
        return n1 - n2;
    }

    static int mul(int n1, int n2) {
        return n1 * n2;
    }

    static int div(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation : +, -, *, /");
        char op = sc.next().charAt(0);

        System.out.print("Enter first Integer : ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second integer : ");
        int n2 = sc.nextInt();

        switch (op){
            case '+':
                System.out.println(add(n1,n2));
                break;

            case '-':
                System.out.println(sub(n1,n2));
                break;

            case '*':
                System.out.println(mul(n1,n2));
                break;

            case '/':
                System.out.println(div(n1,n2));
                break;

            default:
                System.out.println("Invalid Expression");
        }

        sc.close();
    }
}
