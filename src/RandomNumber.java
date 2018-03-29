import java.util.Random;

public class RandomNumber {
    public int min;
    public int max;

    public RandomNumber() {
    }

    public RandomNumber(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int randomInterger(){
        Random rn = new Random();
        int range = max - min + 1;
        int randomNum = min + rn.nextInt(range);
        return randomNum;
    }
}
