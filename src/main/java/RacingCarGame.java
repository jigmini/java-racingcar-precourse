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
            Cars cars = gameService.generateCars(GameUtil.inputCarNames());
            if (cars == null) {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        RacingCarGame racingCarGame = new RacingCarGame();
        racingCarGame.start();
    }
}
