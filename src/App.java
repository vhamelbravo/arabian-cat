import javax.swing.JFrame;
import classes.*;

public class App {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("Arabian Cat");
        frame.setSize(750, 250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Add Screen to frame
        Screen screen = new Screen();
        frame.add(screen);
        frame.pack();
        // Set up Input on Screen
        Input input = new Input();
        screen.addKeyListener(input);
        // Set up loops and start game
        Loops loops = new Loops(screen);
        Sound sound = new Sound();
        sound.playMusic("src/assets/sound/music.wav");
        loops.startGame();
        // Open frame
        frame.requestFocus();
        frame.setVisible(true);
    }
}