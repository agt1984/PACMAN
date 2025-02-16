import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel{
    private int rowCount = 21;                          // Number of rows
    private int columnCount = 19;                       // Number of columns
    private int tileSize = 32;                          // Size of each cell in pixels
    private int boardWidth = columnCount * tileSize;    // Total width
    private int boardHeight = rowCount * tileSize;      // Total height

    PacMan(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);
    }
}


