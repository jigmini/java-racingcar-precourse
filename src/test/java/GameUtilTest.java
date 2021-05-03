import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GameUtilTest {

    @Test
    @DisplayName("0~9 사이 랜덤 값 생성 테스트")
    public void generateRandomNumberTest() {
        assertThat(GameUtil.generateRandomNumber()).isBetween(0, 9);
    }
}
