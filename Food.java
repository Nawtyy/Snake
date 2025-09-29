import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;

public class Food {
    private Point position;
    private int food_x;
    private int food_y;
    private Random rand;

    public Food(int food_x, int food_y ){
        this.food_x = food_x;
        this.food_y = food_y;
        this.rand = new Random();
    }
    public int getFood_x()
    {
        return food_x;
    }
    public int getFood_y()
    {
        return food_y;
    }
    public void setFood_x(int food_x)
    {
        this.food_x = food_x;
    }
    public void setFood_y(int food_y)
    {
        this.food_y = food_y;
    }
    public Point getPosition(){
        return position;
    }
    public boolean isEaten(int snake_x, int snake_y){
        return getFood_x() == snake_x && getFood_y() == snake_y;
    }
    public void spawn(LinkedList<Point> snakeBody) {
        while (true) {
            int x = rand.nextInt(food_x); // row
            int y = rand.nextInt(food_y);  // column
            Point newPos = new Point(x, y);

            if (!snakeBody.contains(newPos)) { 
                position = newPos;
                break;
            }
        }
    }
    //kjsndvjknsdjvnsjkdv
    // public static void main(String[] args) {
    //     Food food = new Food(1, 2);
    //     Snake snake = new Snake(1, 4);
    //     if(food.isEaten(snake.getSnakeX(), snake.getSnakeY())){
    //         System.out.println("oc buoi");
    //     }
    //     else System.out.println("ngu");
    // }
    
}
