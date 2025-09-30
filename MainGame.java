
import java.util.Random;
import java.util.Scanner;



public class MainGame {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int bh = 10;//board height
        int bw = 10;//board width
        int sx = random.nextInt(10) + 0;//snake x
        int sy = random.nextInt(10) + 0;//snake y
        int fx = random.nextInt(10) + 0;//food x
        int fy = random.nextInt(10) + 0;//food y

        Board board = new Board(bh,bw);
        Snake snake = new Snake(sx,sy);
        Food food = new Food(fx,fy);
        
        boolean running = true;
        while(running){
            board.printSnake(snake.getSnakeBody());
            board.printFood(food);
            board.printBoard();
            char userInput = scanner.next().charAt(0);
            snake.move(userInput);
            // checking position if the snake reach the side of the BOARD or not
            if(!board.isSnakeHeadInBoard(snake.getSnakeBody())){
                System.out.println("Fail");
                break;
            }
            if(food.isEaten(snake.getSnakeRows(), snake.getSnakeCols())){
                food.spawn(snake.getSnakeBody(), board);
                snake.grow(userInput);
                
            }
        }
        
    }
}
