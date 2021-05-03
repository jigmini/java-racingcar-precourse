import java.util.InputMismatchException;
import java.util.Scanner;

public class GameUtil {

    public static String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int inputNumberOfAttempts() {
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("숫자 형식이 아닙니다.");
            throw new NumberFormatException("숫자 형식이 아닙니다.");
        }
        return number;
    }
}
