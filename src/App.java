import javax.swing.JFrame; //to create a window

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;

        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("pacman");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);//frame to appear at the center of the window
        frame.setResizable(false);//use can't resize
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the window closes upon the x button being pressed

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);


    }
}