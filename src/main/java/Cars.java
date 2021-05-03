import java.util.ArrayList;
import java.util.List;

/**
 * 자동차의 일급 컬렉션 클래스
 */
public class Cars {
    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Cars matchPosition(Position position) {
        Cars matchCars = new Cars();
        for (Car car : cars) {
            if (car.getPosition().getPosition() == position.getPosition()) {
                matchCars.addCar(car);
            }
        }
        return matchCars;
    }

    public int getCount() {
        return cars.size();
    }

    public Position getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(car.getPosition().getPosition(), maxPosition);
        }
        return new Position(maxPosition);
    }
}
