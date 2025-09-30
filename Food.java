import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;

public class Food {
    private Point position;
    private int foodCols;
    private int foodRows;
    private final Random rand;

    public Food(int foodRows, int foodCols){
        this.foodCols = foodCols;
        this.foodRows = foodRows;
        this.rand = new Random();
    }

    public int getfoodCols()
    {
        return foodCols;
    }
    public int getfoodRows()
    {
        return foodRows;
    }
    public void setfoodCols(int foodCols)
    {
        this.foodCols = foodCols;
    }
    public void setfoodRows(int foodRows)
    {
        this.foodRows = foodRows;
    }
    public Point getPosition(){
        return position;
    }

    public boolean isEaten(int snakeRows, int snakeCols){
        return getfoodCols() == snakeCols && getfoodRows() == snakeRows;
    }

    public void spawn(LinkedList<Point> snakeBody, Board board) {
        while (true) {
            int newCols = rand.nextInt(board.getcols()) + 0; // cols
            int newRows = rand.nextInt(board.getrows()) + 0;  // rows
            foodCols = newCols;
            foodRows = newRows;
            Point newPositionFood = new Point(newRows, newCols);

            if (!snakeBody.contains(newPositionFood)) { 
                position = newPositionFood;
                break;
            }
        }
    }
    
}
