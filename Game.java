import java.util.List;

public class Game {
    Board board;
    private List<Player> players = new ArrayList<>();

    private Gamestatus gameStatus= Gamestatus.inprogress;
    Gamebuilder g;


    public  Game(Gamebuilder g){
        this.board = g.board;
        this.players = g.players;
    }

    

    
    
}
