

public interface IGame {
  public void addPlayerOne(String playerName);

  public void addPlayerTwo(String playerName);

  public void submitPlayerOneScore(String playerName, int score, String result);

  public void submitPlayerTwoScore(String playerName, int score, String result);

  public IGameState getCurrentGameState();

  public void startGame();

  public String playerOneGetScore();
  
  public String playerTwoGetScore();
}
