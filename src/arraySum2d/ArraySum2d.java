package arraySum2d;

public class ArraySum2d {
    public int sumAll(int[][] array) throws IllegalArgumentException {
        checkForExceptions(array);
        int summe = 0;
        if (!checkForExceptions(array)) {
            for (int i = 0;i <= array.length - 1;i++) {
                for (int j = 0;j <= array[i].length - 1;j++) {
                    summe += array[i][j];
                }
            }
        }
        return summe;
    }

    public int[] rowSums(int[][] array) throws IllegalArgumentException {
        checkForExceptions(array);
        int[] summeRow = new int[array.length];
        if (!checkForExceptions(array)) {
            for (int i = 0;i <= array.length - 1;i++) {
                for (int j = 0;j <= array[i].length - 1;j++) {
                    summeRow[i] += array[i][j];
                }
            }

        }
        return summeRow;
    }

    public int[] colSums(int[][] array) throws IllegalArgumentException {
        checkForExceptions(array);
        // find max length of columns
        int maxColLength = 0;
        // for each row in array find max length of columns and save it in maxColLength
        for (int i = 0; i < array.length; i++) {
            if (array[i].length > maxColLength) {
                maxColLength = array[i].length;
            }
        }
        // create new array with maxColLength, which will be returned
        int[] summCol = new int[maxColLength];
        // for each column in array sum all elements in column and save it in summCol
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summCol[j] += array[i][j];
            }
        }
        return summCol;
    }


    private boolean checkForExceptions (int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        } else {
            return false;
        }
    }
}
