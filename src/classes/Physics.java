package classes;

public class Physics {
    public static int velocityY = 0;
    public static int velocityX = -12;
    public static int gravity = 1;

    public static boolean collision(Tree tree) {
        return Cat.catX < tree.treeX + tree.treeWidth &&
                Cat.catX + Cat.catWidth > tree.treeX &&
                Cat.catY < tree.treeY + tree.treeHeight &&
                Cat.catY + Cat.catHeight > tree.treeY;
    }
}
