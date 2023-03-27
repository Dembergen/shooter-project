import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием," + " введите номер, чтобы высрелить,"
                + " -1 чтобы выйти%n", player.getSlotsCount());


        Scanner scan = new Scanner(System.in);
        int slot;
        while (true){
            slot = scan.nextInt();
            if (slot == -1) {
                System.out.println("Game over");
                break;
            }
            player.shotWithWeapon(slot);
        }

    }
}
