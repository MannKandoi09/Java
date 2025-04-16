//Requirements:
//Interface Game: method start()
//Classes: CricketGame, FootballGame, ChessGame
//Use array to store multiple games and start all

interface Game{
    void start();
}
class CricketGame implements Game{

    @Override
    public void start() {
        System.out.println("Starting Cricket Game.....");
    }
}

class FootBallGame implements Game{

    @Override
    public void start() {
        System.out.println("Starting FootBall Game.....");
    }
}

class ChessGame implements Game{

    @Override
    public void start() {
        System.out.println("Chess Game is Starting.....");
    }
}

public class GameSystem {
    public static void main(String[] args) {
        Game[] games = {new CricketGame() , new FootBallGame(), new ChessGame()};

        for (Game g : games){
            g.start();

        }

    }
}
