import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    private Dice dice;
    private Queue<Player> players;
    private List<Ladder> Ladder;
    private List<Snake> Snake;
    private Map<String,Integer> playerpos;
    private int boardSize;

    GameBoard(){}
    public GameBoard(Dice dice, Queue<Player> players, List<Ladder> ladder, List<Snake> snake, Map<String, Integer> playerpos, int boardSize) {
        this.dice = dice;
        this.players = players;
        this.Ladder = ladder;
        this.Snake = snake;
        this.playerpos = playerpos;
        this.boardSize = boardSize;
    }


    public void gamestart() {
        while (players.size() > 1) {
            Player player = players.poll();
            int nextCell = playerpos.get(player.getName()) + dice.diceval();
            if (nextCell > boardSize) players.offer(player);
            else if (nextCell == boardSize) {
                System.out.println(player.getName() + "  has won the game.");
            } else {
                int[] nextPosition= new int[1];
                boolean[] b= new boolean[1];
                nextPosition[0]=nextCell;
                Snake.forEach(v ->{
                    if (v.start==nextCell)
                        nextPosition[0]=v.end;
                });
                if (nextPosition[0]!=nextCell){
                    System.out.println(player.getName()+" has been bitten by snake is at position "+nextCell);
                }
                Ladder.forEach(v->{
                    if (v.start==nextCell){
                        nextPosition[0] = v.end;
                        b[0] = true;
                    }
                });
                if (nextPosition[0]!=nextCell&&b[0]){
                    System.out.println(player.getName()+" has used ladder at position "+nextCell);
                }
                if (nextPosition[0]==boardSize){
                    System.out.println(player.getName()+" has won the game!");
                }else {
                    playerpos.put(player.getName(), nextPosition[0]);
                    System.out.println(player.getName()+" is at position "+nextPosition[0]);
                    players.offer(player);
                }
            }
        }
    }}