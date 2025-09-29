import java.awt.Point;
import java.util.LinkedList;


public class Board {

    
    private String[][] grid;
    private int cols;
    private int rows;


    public Board(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;
        this.grid = new String[rows][cols];
        fillGrid();
    }

    //setter and getter  
    public String[][] getGrid() {
        return grid;
    }
    public void setGrid(String[][] grid) {
        this.grid = grid;
    }
    public int getcols(){
        return cols;
    }
    public int getrows() {
        return rows;
    }
    public void setcols(int cols) {
        this.cols = cols;
    }
    public void setrows(int rows) {
        this.rows = rows;
    }


    
    private void fillGrid() {
        for(int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                grid[r][c] = ". ";
            }
        }
    }
    public void printBoard(){
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                System.out.print(grid[r][c]);
            }
            System.out.println();
        }
        fillGrid();
    }

    public void setCell( int row, int col, String value) {
        if (row >= 0 && row <= rows && col >= 0 && col <= cols) {
            grid[row][col] = value;
        }
    }

    public boolean isSnakeHeadInBoard(LinkedList <Point> snakeBody){
        Point head = snakeBody.getFirst();
        return head.y < rows && head.x < cols && head.x >= 0 && head.y >= 0;
    }

    public void printSnake(LinkedList <Point> snakeBody){
        for(int snakePart = 0; snakePart < snakeBody.size(); snakePart++){
            Point p = snakeBody.get(snakePart);
            if(snakePart == 0) setCell(p.y, p.x, "@ ");
            else setCell(p.y, p.x, "0 ");
        }
    }
    public void printFood(Food food){
        setCell(food.getfoodRows(), food.getfoodCols(), "F ");
    }
    
    
    

    
}
