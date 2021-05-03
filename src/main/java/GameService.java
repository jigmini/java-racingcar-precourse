/**
 * 게임서비스 클래스
 * 자동차 경주 게임의 핵심 로직 담당
 */
public class GameService {

    public Cars generateCars(String carNames) {
        Cars cars = new Cars();
        try {
            for (String carName : carNames.split(",")) {
                cars.addCar(new Car(carName));
            }
        } catch (IllegalArgumentException e) {
            cars = null;
        }
        return cars;
    }
}
