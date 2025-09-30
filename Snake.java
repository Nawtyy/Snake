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
        snakeBody.addFirst(new Point(newCols, newRows));
    }
    public void removeTail(){
        snakeBody.removeLast();
    }
    public void move(char movementKey){
        Point head = snakeBody.getFirst();
        int newCols = head.x;
        int newRows = head.y;
        snakeCols = newCols;
        snakeRows = newRows;
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
        snakeCols = newCols;
        snakeRows = newRows;

        switch (movementKey){
            case 'a' -> newCols--;
            case 'w' -> newRows--;
            case 'd' -> newCols++;
            case 's' -> newRows++;
        }
        addHead(newCols, newRows);  
    }
    public boolean EatingSelf(LinkedList <Point> snakeBody){
        Point head = snakeBody.getFirst();
        if(snakeBody.size() == 1) return false;
        for(int part = 1; part < snakeBody.size(); part++){
            Point body = snakeBody.get(part);
            if(body.y == head.y && body.x == head.x) return true;
        }
        return false;
    }
    
    

}
