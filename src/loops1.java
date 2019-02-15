import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        matrixCounter(n);
//        minMaxNumber(input);
//        toto();
//        displayNumbers7and3(input);
//        someNumbers(input);
//        higherNumber(input);
//        rememberNumbers(input);
//        selector(input);
//        maxNumber(input);
//        checkNumerOnSeven(input);
//        toto();
//        fibbonacciNumbers(input);
//        isEqual(input);
//        arrayProduc5();


    }

    private static void arrayProduc5() {
        int [] numbers =new int[20];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i*5;

        }

        System.out.println(Arrays.toString(numbers));
    }

    private static void isEqual(Scanner input) {
        System.out.println("enter num");
        int n = input.nextInt();
        int[] container = new int[n];

        for (int i = 0; i < container.length; i++) {
            System.out.println("enter");
            container[i] = input.nextInt();
        }
        boolean isEqual = true;

        for (int i = 0; i < (container.length + 1) / 2; i++) {

            if (container[i] != container[n - i - 1]) {
                isEqual = false;

            }
            System.out.print(" " + container[n - i - 1]);
        }
        System.out.println(Arrays.toString(container));
        System.out.println(isEqual);
    }

    private static void fibbonacciNumbers(Scanner input) {
        int n = input.nextInt();
        int sum;
        int container1 = 0;
        int container2 = 1;


        for (int i = 0; i <= n; i++) {


            sum = container1 + container2;
            container1 = container2;
            container2 = sum;


            System.out.print(" " + sum);
        }
    }


    private static void matrixCounter(int n) {
        int countur = 0;

        for (int i = 0; i < n; i++) {
            countur = i;

            for (int j = 1; j <= n; j++) {

                countur++;
                System.out.print(countur);
            }
            System.out.println();


        }
    }

    private static void minMaxNumber(Scanner input) {
        int max = 0;
        int min = 10000;
        int n;
        do {
            System.out.println("enter number");

            n = input.nextInt();
            if (n >= max) {
                max = n;
            }
            if (n <= min) {
                min = n;
            }


        } while (n != 0);

        System.out.println(" max = " + max + " min = " + min);
    }

    private static void displayNumbers7and3(Scanner input) {
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {

            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }

        }
    }

    private static void toto() {
        for (int i1 = 1; i1 <= 44; i1++)
            for (int i2 = i1 + 1; i2 <= 45; i2++)
                for (int i3 = i2 + 1; i3 <= 46; i3++)
                    for (int i4 = i3 + 1; i4 <= 47; i4++)
                        for (int i5 = i4 + 1; i5 <= 48; i5++)
                            for (int i6 = i5 + 1; i6 <= 49; i6++)
                                System.out.printf(
                                        "%d %d %d %d %d %d%n",
                                        i1, i2, i3, i4, i5, i6);
    }

    private static void someNumbers(Scanner input) {
        System.out.print("n=");
        int n = input.nextInt();
        System.out.print("m=");
        int m = input.nextInt();
        for (int num = n; num <= m; num++) {
            boolean prime = true;
            int divider = 2;
            int maxDivider = (int) Math.sqrt(num);
            while (divider <= maxDivider) {
                if (num % divider == 0) {
                    prime = false;
                    break;

                }
                divider++;
            }
            if (prime) {
                System.out.printf("%d ", num);
            }
        }
    }

    public static void checkNumerOnSeven(Scanner input) {
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (i % 7 == 0) {

                continue;

            }
            if (i % 3 == 0) {

                continue;

            }
            System.out.println(i);

        }
    }

    public static void maxNumber(Scanner input) {
        System.out.print("Enter a positive Number: ");
        int num = input.nextInt();
        int divider = 2;
        int maxDivider = (int) Math.sqrt(num);
        System.out.println(Math.sqrt(num));
        boolean prime = true;
        while (prime && (divider <= maxDivider)) {
            if (num % divider == 0) {
                prime = false;
            }
            divider++;
        }
        System.out.println("Prime? " + prime);

    }

    private static void selector(Scanner input) {

        String select = input.nextLine();

        switch (select) {

            case "a":
                System.out.println("asen");
                break;
            case "b":
                System.out.println("Bobi");
                break;
            default:
                System.out.println("cant find");
        }

    }

    private static void rememberNumbers(Scanner input) {
        System.out.println("enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("numbers = " + a + " and " + b);
    }

    private static void higherNumber(Scanner input) {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            int b = input.nextInt();
            if (a <= b) {
                a = b;
            }
        }
        System.out.println("The higher number youd entered is " + a);
    }
}
