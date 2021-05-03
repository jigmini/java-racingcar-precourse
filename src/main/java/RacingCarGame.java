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
                Cars cars = gameService.generateCars(GameUtil.inputCarNames());
                int numberOfAttempts = GameUtil.inputNumberOfAttempts();
            } catch (IllegalArgumentException e) {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        RacingCarGame racingCarGame = new RacingCarGame();
        racingCarGame.start();
    }
}
