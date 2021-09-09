import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
    * Arrays
    * Provide a int value to see if its part of the
    * array. If the value enter is not part of the array the
    * program will output "-1".
    * */
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[7];

        intArray[0] = 12;
        intArray[1] = 9;
        intArray[2] = -35;
        intArray[3] = 30;
        intArray[4] = 7;
        intArray[5] = 143;
        intArray[6] = -12;

        System.out.println("Enter an Integer value: ");
        int number = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == number){
                index = i;
                break;
            }
        }
        System.out.println("Index = "+index);

    }
}
