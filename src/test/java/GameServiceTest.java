import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GameServiceTest {
    GameService gameService = new GameService();

    @Test
    @DisplayName("자동차 생성 테스트")
    public void generateCarsTest() {
        String carNames = "hello,world,java";
        Cars cars = gameService.generateCars(carNames);
        assertThat(cars).isInstanceOf(Cars.class);
        for (Car car : cars.getCars()) {
            assertThat(car).isInstanceOf(Car.class);
        }
    }

    @Test
    @DisplayName("자동차 이름 유효성 테스트")
    public void validateCarNameTest() {
        assertThatIllegalArgumentException().isThrownBy(() -> gameService.generateCars("hello,xxxxxxx")).withMessage("유효하지 않은 자동차 이름입니다.");
    }
}
