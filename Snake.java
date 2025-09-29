import java.awt.Point;
import java.util.LinkedList;


public class Snake {
    
    private LinkedList<Point> snakeBody;
    private int snakeCols; // x == cols
    private int snakeRows; // y == rows
    public Snake(int snakeCols, int snakeRows){
        snakeBody = new LinkedList<>();
        snakeBody.addFirst(new Point(snakeCols, snakeRows));
        //point(x,y) == point(cols,rows)
        this.snakeCols = snakeCols;
        this.snakeRows = snakeRows;
    }

    //setter and getter
    public void setSnakeCols(int snakeCols){
        this.snakeCols = snakeCols;
    }
    public int getSnakeCols(){
        return snakeCols;
    }
    public void setSnakeRows(int snakeRows){
        this.snakeRows = snakeRows;
    }
    public int getSnakeRows(){
        return snakeRows;
    }
    public LinkedList<Point> getSnakeBody(){
        return snakeBody;
    }
    public void setSnakeBody(LinkedList<Point> snakeBody){
        this.snakeBody = snakeBody;
    }

    //function
    public void addHead(int newCols, int newRows){
        snakeCols = newCols;
        snakeRows = newRows;
        snakeBody.addFirst(new Point(newCols, newRows));
    }
    public void removeTail(){
        snakeBody.removeLast();
    }
    public void move(char movementKey){
        Point head = snakeBody.getFirst();
        int newCols = head.x;
        int newRows = head.y;
        switch (movementKey){
            case 'a' -> newCols--;
            case 'w' -> newRows--;
            case 'd' -> newCols++;
            case 's' -> newRows++;
        }
        addHead(newCols, newRows);
        removeTail();
    }
    public void grow(char movementKey){
        Point head = snakeBody.getFirst();
        int newCols = head.x;
        int newRows = head.y;
        switch (movementKey){
            case 'a' -> newCols--;
            case 'w' -> newRows--;
            case 'd' -> newCols++;
            case 's' -> newRows++;
        }
        addHead(newCols, newRows);  
    }
    
    

}
