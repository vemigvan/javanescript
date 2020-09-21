import java.lang.reflect.Array;
import java.util.ArrayList;
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
        if((end-begin > 0 && step<0) || (end-begin < 0 && step>0))
            return new int[0];
        int[] arr = new int[Math.abs((end - begin)/step+1)];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = begin;
            begin+=step;
        }
        return arr;
    }

    static int[] findSecDiagonalEvenNumbers(int arr[][]){
        if(arr.length != arr[0].length) {
            return new int[0];
        }
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[arr.length-i-1][i] % 2 == 0){
                even.add(arr[arr.length-i-1][i]);
            }
        }
        int result[] = new int[even.size()];
        for(int i = 0; i < even.size(); i++){
            result[i] = even.get(i);
        }
        return result;
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
