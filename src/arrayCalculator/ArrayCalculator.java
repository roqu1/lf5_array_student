package arrayCalculator;


import java.util.Arrays;

public class ArrayCalculator {
    public int[] duplicateArrayValues(int[] array) {
        if (array != null) {
            int[] result = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] * 2;
            }
            return result;
        }
        return null;
    }

    public int[] sumArrays(int[] array1, int[] array2) throws IllegalArgumentException {
        if (array1 == null || array2 == null) {
            return null;
        }
        if (array1.length != array2.length) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] + array2[i];
            }
            return result;
        }

    public int[] swapArrays(int[] array) {
        if (array == null) {
            return null;
        }
        int[] result = new int[array.length];


            for (int i = 0; i < array.length; i++) {
                result[i] = array[array.length - 1 - i];
            }
            return result;
        }


    public int sumEven(int[] array) {
        int summe = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    summe += array[i];
                }
            }
            return summe;
        } else {
            return 0;
        }
    }

    public int[] getLargestTwo(int[] array) throws IllegalArgumentException {

        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            throw new IllegalArgumentException();
        }
        int[] response = new int[2];
        Arrays.sort(array);
        response[0] = array[array.length-1];
        response[1] = array[array.length-2];
        return response;
    }
}
