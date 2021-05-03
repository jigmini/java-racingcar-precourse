import dto.Cars;
import service.GameService;
import util.GameUtil;

/**
 * 자동차경주게임 클래스
 */
public class RacingCarGame {
    GameService gameService;

    public RacingCarGame() {
        gameService = new GameService();
    }

    public void start() {
        while (true) {
            try {
                String carNames = GameUtil.inputCarNames();
                Cars cars = GameUtil.generateCars(carNames);
                int numberOfAttempts = GameUtil.inputNumberOfAttempts();
                gameService.runRace(cars, numberOfAttempts);
                break;
            } catch (IllegalArgumentException ignored) {
            }
        }
    }

    public static void main(String[] args) {
        RacingCarGame racingCarGame = new RacingCarGame();
        racingCarGame.start();
    }
}
