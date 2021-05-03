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
}
