/**
 * 자동차 클래스
 */
public class Car {
    private String name;
    private int position;

    public Car(String name) {
        validateCarNames(name);
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void validateCarNames(String name) {
        if (name == null || name.length() == 0 || name.length() > 5) {
            System.out.println("유효하지 않은 자동차 이름입니다.");
            throw new IllegalArgumentException("유효하지 않은 자동차 이름입니다.");
        }
    }
}
