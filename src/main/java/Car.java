/**
 * 자동차 클래스
 */
public class Car {
    private CarName carName;
    private Position position;

    public Car(CarName carName) {
        this.carName = carName;
        this.position = new Position();
    }

    public CarName getCarName() {
        return carName;
    }

    public Position getPosition() {
        return position;
    }

    public void moveForward() {
        position.addPosition();
    }
}
