import java.awt.*;
import javax.swing.*;

public class PacMan extends JPanel{
    private int rowCount = 21;                          // Number of rows
    private int columnCount = 19;                       // Number of columns
    private int tileSize = 32;                          // Size of each cell in pixels
    private int boardWidth = columnCount * tileSize;    // Total width
    private int boardHeight = rowCount * tileSize;      // Total height

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    PacMan(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);
    }
}


