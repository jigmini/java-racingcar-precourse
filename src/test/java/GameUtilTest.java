import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GameUtilTest {

    @Test
    @DisplayName("자동차 생성 테스트")
    public void generateCarsTest() {
        String carNames = "hello,world,java";
        Cars cars = GameUtil.generateCars(carNames);
        assertThat(cars).isInstanceOf(Cars.class);
        for (Car car : cars.getCars()) {
            assertThat(car).isInstanceOf(Car.class);
        }
    }

    @Test
    @DisplayName("자동차 이름 유효성 테스트")
    public void validateCarNameTest() {
        assertThatIllegalArgumentException().isThrownBy(() -> GameUtil.generateCars("hello,xxxxxxx")).withMessage("유효하지 않은 자동차 이름입니다.");
    }

    @Test
    @DisplayName("0~9 사이 랜덤 값 생성 테스트")
    public void generateRandomNumberTest() {
        assertThat(GameUtil.generateRandomNumber()).isBetween(0, 9);
    }
}
