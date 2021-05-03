package service;

import dto.Car;
import dto.Cars;
import dto.Position;
import util.GameUtil;

/**
 * 게임서비스 클래스
 * 자동차 경주 게임의 핵심 로직 담당
 */
public class GameService {

    public void runRace(Cars cars, int numberOfAttempts) {
        System.out.println("실행 결과");
        for (int i = 0; i < numberOfAttempts; i++) {
            driveCars(cars);
        }
        determineWinner(cars);
    }

    public void driveCars(Cars cars) {
        for (Car car : cars.getCars()) {
            calculatePosition(car);
            GameUtil.outputCarPosition(car);
        }
        System.out.println();
    }

    public void calculatePosition(Car car) {
        int number = GameUtil.generateRandomNumber();
        if (number >= 4) {
            car.moveForward();
        }
    }

    public void determineWinner(Cars cars) {
        Position maxPosition = cars.getMaxPosition();
        Cars winCars = cars.matchPosition(maxPosition);
        int winnerCount = winCars.getCount();
        for (int i = 0; i < winnerCount; i++) {
            System.out.print(winCars.getCars().get(i).getCarName());
            if (i < winnerCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
