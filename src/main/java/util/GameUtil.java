package util;

import dto.Car;
import dto.CarName;
import dto.Cars;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 게임 유틸 클래스
 * 게임의 부가적인 기능을 제공한다.
 */
public class GameUtil {

    public static String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static Cars generateCars(String carNames) {
        Cars cars = new Cars();
        for (String carName : carNames.split(",")) {
            cars.addCar(new Car(new CarName(carName)));
        }
        return cars;
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

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static void outputCarPosition(Car car) {
        System.out.print(car.getCarName().getCarName() + " : ");
        int position = car.getPosition().getPosition();
        while (position > 0) {
            System.out.print("-");
            position--;
        }
        System.out.println();
    }
}
