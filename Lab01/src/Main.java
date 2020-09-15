import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.print("First task:\n");
        //Filling 2d array with random numbers
        int[][] array1 = new int[5][5];
        ArrayStaff.fillArrayRandom(array1);
        ArrayStaff.printArray(array1);

        System.out.print("Second task:\n");
        //Creating array from 'a' to 'b' with 'c' step
        int[] array2 = ArrayStaff.createArray(3,33,5);
        ArrayStaff.printArray(array2);

    }


}


