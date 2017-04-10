import java.util.Random;

public class GuessNumber {
    public static int COUNT = 5;

    public int genarateRandomNumber(int start, int end){
        Random randomGenerator = new Random();
        int number = randomGenerator.nextInt(end) + 1;
        return number;
    }

    public int calCount(int count) {
        return count + 1;
    }

    public String compareNumber(int userNumber, int randomNumber) {
        String msg = "";
        if(userNumber < randomNumber) {
            msg = "猜小啦";
        } else if(userNumber > randomNumber) {
            msg = "猜大啦";
        } else {
            msg = "猜中啦";
        }
        return msg;
    }
    public boolean isExcessCount(int count) {
        return count >= COUNT;
    }
}
