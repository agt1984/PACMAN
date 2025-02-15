
import javax.swing.JFrame; 

public class App {
    public static void main(String[] args) throws Exception {
                      // Define the dimensions of the game board
        int rowCount = 21;                          // Number of rows
        int columnCount = 19;                       // Number of columns
        int tileSize = 32;                          // Size of each cell in pixels

                      // Calculate the total size of the board
        int boardWidth = columnCount * tileSize;    // Total width
        int boardHeight = rowCount * tileSize;      // Total height

                      // Create and configure the game window
        JFrame frame = new JFrame("Pac-Man");
        frame.setVisible(true);                    // Make the window visible
        frame.setLocationRelativeTo(null);         // Center the window on the screen
        frame.setResizable(false);         // Prevent the window from being resized
    }
}







