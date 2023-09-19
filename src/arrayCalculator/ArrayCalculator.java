package arrayCalculator;


public class ArrayCalculator {
    public int[] duplicateArrayValues(int[] array) {
        int[] result = new int[array.length];
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] * 2;
            }
            return result;
        }
        return null;
    }

    public int[] sumArrays(int[] array1, int[] array2) throws IllegalArgumentException {
        int[] result = new int[Math.max(array1.length, array2.length)];
        if (array1.length ) {

        }
        return null;
    }

    public int[] swapArrays(int[] array) {
        return null;
    }

    public int sumEven(int[] array) {
        return 0;
    }

    public int[] getLargestTwo(int[] array) throws IllegalArgumentException {
        return null;
    }
}
