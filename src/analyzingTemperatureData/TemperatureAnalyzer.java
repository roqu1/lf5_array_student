package analyzingTemperatureData;

public class TemperatureAnalyzer {

    public int getMaxPeriod(double[] temperatureList, double minimumValue) {
        int maxPeriod = 0;
        int currentPeriod = 0;
        for (int i = 0; i < temperatureList.length; i++) {
            if (temperatureList[i] >= minimumValue) {
                currentPeriod++;
            } else {
                if (currentPeriod > maxPeriod) {
                    maxPeriod = currentPeriod;
                }
                currentPeriod = 0;
            }
        }
        if (currentPeriod > maxPeriod) {
            maxPeriod = currentPeriod;
        }
        return maxPeriod;

    }
}
