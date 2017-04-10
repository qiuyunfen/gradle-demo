import java.util.Scanner;

public class handleInput {
    public static String INPUT_HINT = "请输入猜测的数字:";
    public static String GUESS_SUCCESS = "猜中啦";
    public static String EXCESS_MAX_COUNT = "你已经超过猜测次数，请再接再厉哦";
    public static String IS_CONTINUE = "是否继续游戏?(YES or NO)";
    public static String NOT_CONTINUE_PLAY = "NO";
    public static int count = 0;
    public static int random = 0;
    public static GuessNumber guessNumber = new GuessNumber();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            init();
            System.out.println(INPUT_HINT);
            while(true) {
                String msg = guessNumber(sc.nextInt());
                System.out.println(msg);
                if(msg.equals(GUESS_SUCCESS)) {
                    break;
                }else if(guessNumber.isExcessCount(count)) {
                    System.out.println(EXCESS_MAX_COUNT);
                    break;
                }
            }
            System.out.println(IS_CONTINUE);
            if(sc.next().equals(NOT_CONTINUE_PLAY)){
                break;
            }
        }
    }

    public static void init() {
        count = 0;
        random = guessNumber.genarateRandomNumber(1, 10);
    }

    public static String guessNumber(int userNum) {
        count = guessNumber.calCount(count);
        return guessNumber.compareNumber(userNum, random);
    }
}
