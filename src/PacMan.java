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

        //Load the Imgaes
        wallImage = new ImageIcon(getClass().getResource("./wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("./orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("./pinkGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("./redGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("./pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("./pacmanDown.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("./pacmanLeft.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("./pacmanRight.png")).getImage();
    }

}


