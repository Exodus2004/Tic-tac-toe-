
import java.util.*;

public class Board {

    int size;
    List<List<Cell>> cells = new ArrayList<>();



    public Board(int size){
        this.size = size;
        
    List<Cell> columns = Collections.nCopies(size, new Cell());

    List<List<Cell>> rows = Collections.nCopies(size,columns);


    this.cells = rows;


    }




    
}
