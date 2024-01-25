package project.Project;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("John");
        player.move(1, 1);
        System.out.println(player.getName() + " is at " + player.getXCoordinate() + ", " + player.getYCoordinate() + ".");
    }
}
