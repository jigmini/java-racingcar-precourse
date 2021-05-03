package dto;

public class CarName {
    private String carName;

    public CarName(String carName) {
        validateCarName(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void validateCarName(String carName) {
        if (carName == null || carName.length() == 0 || carName.length() > 5) {
            System.out.println("유효하지 않은 자동차 이름입니다.");
            throw new IllegalArgumentException("유효하지 않은 자동차 이름입니다.");
        }
    }

    @Override
    public String toString() {
        return carName;
    }
}
