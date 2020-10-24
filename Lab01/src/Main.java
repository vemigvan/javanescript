import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.print("First task:\n");
        //Filling 2d array with random numbers
        int[][] array1 = new int[5][8];
        ArrayStaff.fillArrayRandom(array1);
        ArrayStaff.printArray(array1);
        //
        System.out.print("Even numbers in the secondary diagonal:\n");
        int[] even = ArrayStaff.findSecDiagonalEvenNumbers(array1);
        ArrayStaff.printArray(even);

        System.out.print("Second task:\n");
        //Creating array from 'a' to 'b' with 'c' step
        int[] array2 = ArrayStaff.createArray(3,33,-30);
        ArrayStaff.printArray(array2);

    }


}


