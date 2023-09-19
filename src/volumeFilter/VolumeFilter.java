package volumeFilter;

public class VolumeFilter {

    public int[] smoothValues(int[] values) {
        int[] result = new int[values.length];
        for (int i = 1; i < values.length-1; i++) {
            result[i] = (values[i - 1] + values[i] + values[i + 1]) / 3;
        }
        result[0] = (values[0] + values[1]) / 2;
        result[values.length-1] = (values[values.length-1] + values[values.length-2]) / 2;
        return result;
    }
}
