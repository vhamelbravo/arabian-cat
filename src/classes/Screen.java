package classes;

import java.awt.*;
import javax.swing.JPanel;

public class Screen extends JPanel {
    public static int screenHeight = 250;
    public static int screenWidth = 750;

    // Set up screen
    public Screen() {
        setPreferredSize(new Dimension(screenWidth, screenHeight));
        setBackground(Color.decode("#C2B280"));
        setFocusable(true);
        requestFocusInWindow();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Draw cat
        g.drawImage(Cat.catImg, Cat.catX, Cat.catY, Cat.catWidth, Cat.catHeight, null);
        // Draw trees
        for (int i = 0; i < Loops.trees.size(); i++) {
            Tree tree = Loops.trees.get(i);
            g.drawImage(tree.treeImg, tree.treeX, tree.treeY, tree.treeWidth, tree.treeHeight, null);
        }
    }
}
