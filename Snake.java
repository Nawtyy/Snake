import java.awt.Point;
import java.util.LinkedList;


public class Snake {
    
    private LinkedList<Point> snakeBody;
    private int snakeX;
    private int snakeY;
    public Snake(int snakeX, int snakeY){
        snakeBody = new LinkedList<>();
        snakeBody.addFirst(new Point(snakeX, snakeY));
        this.snakeX = snakeX;
        this.snakeY = snakeY;
    }

    //setter and getter
    public void setSnakeX(int snakeX){
        this.snakeX = snakeX;
    }
    public int getSnakeX(){
        return snakeX;
    }
    public void setSnakeY(int snakeY){
        this.snakeY = snakeY;
    }
    public int getSnakeY(){
        return snakeY;
    }
    public LinkedList<Point> getSnakeBody(){
        return snakeBody;
    }
    public void setSnakeBody(LinkedList<Point> snakeBody){
        this.snakeBody = snakeBody;
    }

    //function
    public void addHead(int newX, int newY){
        snakeX = newX;
        snakeY = newY;
        snakeBody.addFirst(new Point(newX, newY));
    }
    public void removeTail(){
        snakeBody.removeLast();
    }
    public void move(char movementKey){
        Point head = snakeBody.getFirst();
        int newX = head.x;
        int newY = head.y;
        switch (movementKey){
            case 'a' -> newX--;
            case 'w' -> newY--;
            case 'd' -> newX++;
            case 's' -> newY++;
        }
        addHead(newX, newY);
        removeTail();
    }
    public void grow(char movementKey){
        Point head = snakeBody.getFirst();
        int newX = head.x;
        int newY = head.y;
        switch (movementKey){
            case 'a' -> newX--;
            case 'w' -> newY--;
            case 'd' -> newX++;
            case 's' -> newY++;
        }
        addHead(newX, newY);  
    }
    
    // public static void main(String[] args) {
    //     Snake snake = new Snake(2, 0);
    //     System.out.println(snake.getSnakeY());
    // }

}
