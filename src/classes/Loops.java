package classes;

import java.util.*;
import javax.swing.*;

public class Loops implements Runnable {
    static boolean drawTree = false;
    Thread gameThread;
    Screen screen;
    static ArrayList<Tree> trees = new ArrayList<>();

    public Loops(Screen screen) {
        this.screen = screen;
    }

    public void startGame() {
        trees.clear();
        Cat.catX = 50;
        Cat.catY = Screen.screenHeight - Cat.catHeight;
        Cat.catImg = new ImageIcon("src/assets/img/cat.png").getImage();
        Physics.velocityY = 0;

        gameThread = new Thread(this);
        gameThread.start();
    }

    public void endGame() {
        gameThread = null;
    }

    public void restart() {
        trees.clear();
        Cat.catX = 50;
        Cat.catY = Screen.screenHeight - Cat.catHeight;
        Cat.catImg = new ImageIcon("src/assets/img/cat.png").getImage();
        Physics.velocityY = 0;

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (gameThread != null) {
            if (Input.spacePressed) {
                Physics.velocityY = -17;
            }
            Physics.velocityY += Physics.gravity;
            Cat.catY += Physics.velocityY;

            if (Cat.catY + Cat.catHeight > Screen.screenHeight) {
                Cat.catY = Screen.screenHeight - Cat.catHeight;
                Physics.velocityY = 0;
            } else if (Cat.catY < 0) {
                Cat.catY = 0;
                Physics.velocityY = 0;
            }
            double treeChance = Math.random();
            if (treeChance > .99) {
                int treeHeight = 70;
                int treeWidth = 34;
                int treeX = 700;
                int treeY = Screen.screenHeight - treeHeight;
                trees.add(new Tree(treeX, treeY, treeWidth, treeHeight));
                if (trees.size() > 10) {
                    trees.remove(0);
                }
            }
            for (int i = 0; i < trees.size(); i++) {
                Tree tree = trees.get(i);
                tree.treeX += Physics.velocityX;
                if (Physics.collision(tree)) {
                    endGame();
                    Cat.catImg = Cat.catDeadImg;

                    if (Input.spacePressed) {
                        restart();
                    }
                }
            }

            screen.repaint();

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
