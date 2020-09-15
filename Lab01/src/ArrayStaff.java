import java.util.Random;

public class ArrayStaff {
    static void fillArrayRandom(int[][] arr){
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rnd.nextInt(10);
            }
        }
    }

    static int[] createArray(int begin, int end, int step){
        int[] arr = new int[(end - begin)/step+1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = begin;
            begin+=step;
        }
        return arr;
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
