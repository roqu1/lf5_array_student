# Lösung TemperatureAnalyzer
```java
public int getMaxPeriod(double[] temperatureList, double minimumValue){
        int period = 0;
        int currentPeriod;

        for(int i = 0; i < temperatureList.length; i++){
            currentPeriod =0;
            while(i < temperatureList.length && temperatureList[i] >= minimumValue){
                currentPeriod++;
                i++;
            }
            if(currentPeriod > period){
                period = currentPeriod;
            }
        }
        return period;
}
```
oder
```java
public int getMaxPeriod(double[] temperatureList, double minimumValue){
    int number = 0;
    int biggestNumber =0;
    boolean isPeriod = false;
    for(int i = 0; i<temperatureList.length; i++){
        if(temperatureList[i] >= minimumValue){
            isPeriod = true;
            number++;
        }
        else{
            if(number > biggestNumber){
                biggestNumber = number;
            }
            isPeriod=false;
            number = 0;
        }
        if(i==temperatureList.length-1 && isPeriod){
            if(number > biggestNumber){
                biggestNumber = number;
            }
        }
    }
    return biggestNumber;
}
```
