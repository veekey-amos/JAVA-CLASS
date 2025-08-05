import java.util.Scanner;

public class ArrayExample {
    public static void main(String[]arg) {

        Scanner input = new Scanner(System.in);

        int[] myArray = {1,3,5,7,9};
        int[] anotherArray = new int[10];
        String[] gender = {"Female","Male"};

        for( int i = 0; i < myArray.length; i++){
            System.out.println("Insert Item at"+ i);
            System.out.println("item at: " +i+ " is " + myArray[i]);
            anotherArray[i] = input.nextInt();
        }
    }
}