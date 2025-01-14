import javax.swing.JFrame;
import classes.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Arabian Cat");
        frame.setSize(750, 250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Screen screen = new Screen();
        frame.add(screen);
        frame.pack();

        Input input = new Input();
        screen.addKeyListener(input);

        Loops loops = new Loops(screen);
        Sound sound = new Sound();
        sound.playMusic("src/assets/sound/music.wav");
        loops.startGame();

        frame.requestFocus();
        frame.setVisible(true);
    }
}