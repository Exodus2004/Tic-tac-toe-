package Tictactoe;
import java.util.ArrayList;
import java.util.List;

public class Gamebuilder {
     Board board;
     List<Player> players = new ArrayList<>();

    private Gamestatus gamestatus;

    
    public Gamebuilder setboard(Board board){
        this.board = board;
        return this;


    }
    public Gamebuilder setplayers(List<Player> players){
        this.players = players;
        return this;
    }

    // public Gamebuilder setgamestatus(Gamestatus gamestatus){
    //     this.gamestatus = gamestatus;
    //     return this;
    // }
    public boolean validate(){
        if(players.size()<2) return false;

        return true;
    }


    public Game build() throws Exception{

        if(!validate()){
            throw new Exception("minimum 2 players required");
        }

        return new Game(this);

    }


    










    
}
