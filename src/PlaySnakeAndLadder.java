import java.util.*;

public class PlaySnakeAndLadder {
    private static Object Jumper;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice(1);
        Player p1 =new Player("Gaurav", 1);
        Player p2 =new Player("Ravi", 2);
        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(p1);
        allPlayers.offer(p2);
        List<Snake> snakes = new ArrayList<>();
            Snake snake = new Snake(62, 5);
            snakes.add(snake);
            Snake snake1 = new Snake(33, 6);
            snakes.add(snake1);
            Snake snake2 = new Snake(49, 9);
            snakes.add(snake2);
            Snake snake3 = new Snake(41, 20);
            snakes.add(snake3);
            Snake snake4 = new Snake(56, 53);
            snakes.add(snake4);
            Snake snake5 = new Snake(87, 15);
            snakes.add(snake5);
            Snake snake6 = new Snake(93, 73);
            snakes.add(snake6);
            Snake snake7 = new Snake(98, 64);
            snakes.add(snake7);

            List<Ladder> ladders = new ArrayList<>();
        Ladder ladder = new Ladder(2, 37);
        ladders.add(ladder);
        Ladder ladder1 = new Ladder(10, 32);
        ladders.add(ladder1);
        Ladder ladder2 = new Ladder(27, 46);
        ladders.add(ladder2);
        Ladder ladder3 = new Ladder(51, 68);
        ladders.add(ladder3);
        Ladder ladder4 = new Ladder(61, 79);
        ladders.add(ladder4);
        Ladder ladder5 = new Ladder(65, 84);
        ladders.add(ladder5);
        Ladder ladder6 = new Ladder(71, 91);
        ladders.add(ladder6);
        Ladder ladder7 = new Ladder(81, 100);
        ladders.add(ladder7);
        Map<String,Integer> currentPosition = new HashMap<>();
        currentPosition.put("Gaurav", 0);
        currentPosition.put("Ravi", 0);
        GameBoard gd = new GameBoard(dice,allPlayers, ladders, snakes,currentPosition,100);
        gd.gamestart();
    }
}