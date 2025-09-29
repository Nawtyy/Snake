import java.awt.Point;
import java.util.LinkedList;
public class Board {
    private String[][] grid;
    private int width;
    private int height;
    public Board(int height, int width) {
        this.width = width;
        this.height = height;
        this.grid = new String[height][width];
        fillGrid(grid);
    }

    //setter and getter  
    public String[][] getGrid() {
        return grid;
    }
    public void setGrid(String[][] grid) {
        this.grid = grid;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }


    
    private void fillGrid(String[][] grid) {
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                grid[i][j] = ". ";
            }
        }
    }
    public void printBoard(){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        fillGrid(grid);
    }

    public void setCell(int row, int col, String value) {
        if (row >= 0 && row < height && col >= 0 && col < width) {
            grid[col][row] = value;
        }
    }

    public boolean isSnakeHeadInBoard(LinkedList <Point> snakeBody){

        Point p = snakeBody.getFirst();
        return p.getX() < width && p.getY() < height && p.getY() >= 0 && p.getX() >= 0;
    }

    public void printSnake(LinkedList <Point> snakeBody){
        for(int i = 0; i < snakeBody.size(); i++){
            Point p = snakeBody.get(i);
            if(i == 0) setCell(p.x, p.y, "@ ");
            else setCell(p.x, p.y, "0 ");
        }
    }
    public void printFood(Food food){
        setCell(food.getFood_x(), food.getFood_y(), "F ");
    }
    
    
    

    
}
