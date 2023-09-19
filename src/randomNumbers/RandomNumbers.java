package randomNumbers;

import java.util.Random;

public class RandomNumbers{
    public int[] getRandomNumbers(int number) {
        int[] randomNumbers = new int[number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            randomNumbers[i] = random.nextInt(10) +1;
        }
        return randomNumbers;
    }

    public int evaluateArray(int[] randomNumbers, int digit){
        int count = 0;
        for(int i=1;i<=randomNumbers.length;i++){
            if(randomNumbers[i-1]==digit){
                count++;
            }
        }
        return count;
    }

    public String getRandomNumbersToString(int[] randomNumbers){
        String response = "";
        for (int i = 0; i < randomNumbers.length; i++) {
            response += randomNumbers[i] + " ";
        }
        return response;
    }

}