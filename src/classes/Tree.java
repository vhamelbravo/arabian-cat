package classes;

import java.awt.*;
import javax.swing.*;

public class Tree {
    public Image treeImg = new ImageIcon("src/assets/img/tree.png").getImage();
    public int treeHeight = 70;
    public int treeWidth = 34;
    public int treeX = 700;
    public int treeY = Screen.screenHeight - treeHeight;

    public Tree(int x, int y, int width, int height) {
        this.treeX = x;
        this.treeY = y;
        this.treeWidth = width;
        this.treeHeight = height;
    }
}
