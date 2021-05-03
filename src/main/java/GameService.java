/**
 * 게임서비스 클래스
 * 자동차 경주 게임의 핵심 로직 담당
 */
public class GameService {

    public Cars generateCars(String carNames) {
        Cars cars = new Cars();
        for (String carName : carNames.split(",")) {
            cars.addCar(new Car(new CarName(carName)));
        }
        return cars;
    }

    public void runRace(Cars cars, int numberOfAttempts) {
        for (int i = 0; i < numberOfAttempts; i++) {
            driveCars(cars);
        }
    }

    public void driveCars(Cars cars) {
        for (Car car : cars.getCars()) {
            calculatePosition(car);
        }
    }

    public void calculatePosition(Car car) {
        int number = GameUtil.generateRandomNumber();
        if (number >= 4) {
            car.moveForward();
        }
    }
}
