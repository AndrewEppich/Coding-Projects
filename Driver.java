public class Driver {
    public static void main(String[] args) {
        int numPlayers = 4; 
        Game game = new Game(numPlayers);

        System.out.println("Game started with " + numPlayers + " players.");

        int winner = game.play();

        System.out.println("Player " + winner + " is the winner!");
        
        //got help from chatgpt here
        for (Player player : game.getPlayers()) {
            // end got help from chat gpt here
            System.out.println("Player " + player.getPlayerNum() + " hand: " + player.getHand());
        }
    }
}