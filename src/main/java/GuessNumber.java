import java.util.Random;
import java.util.Scanner;

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

    public static void main(String[] args) {
        System.out.println("请输入猜测的数字:");
        GuessNumber guessNumber = new GuessNumber();
        int count = 0;
        int random = guessNumber.genarateRandomNumber(1, 100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            int userNum = sc.nextInt();
            count = guessNumber.calCount(count);
            String msg = guessNumber.compareNumber(userNum, random);
            System.out.println(msg);
            if(msg == "猜中啦") {
                break;
            }
            boolean isExccessCount = guessNumber.isExcessCount(count);
            if(isExccessCount) {
                System.out.println("你已经超过猜测次数");
                break;
            }
        }
    }
}
