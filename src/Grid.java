import java.awt.Graphics;
public class Grid {
int cellSize = 35;
int x = 0;
int y = 0;
int cellInRow;
int cellInCol;

    public Grid() {
        cellInRow = 8;
        cellInCol = 8;
    }

    public Grid(int x, int y, int cellInRow, int cellInCol){
        this.x = x;
        this.y = y;
        this.cellInRow = cellInRow;
        this.cellInCol = cellInCol;
    }

    public void paint (Graphics g) {
        
    } 
}
