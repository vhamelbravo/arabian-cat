package classes;

import java.awt.*;
import javax.swing.*;

public class Cat {
    public static Image catImg = new ImageIcon("src/assets/img/cat.png").getImage();
    public static Image catDeadImg = new ImageIcon("src/assets/img/cat_dead.png").getImage();
    public static int catWidth = 88;
    public static int catHeight = 94;
    public static int catX = 50;
    public static int catY = Screen.screenHeight - catHeight;
}
