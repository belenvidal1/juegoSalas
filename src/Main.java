import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String name = sc.nextLine();

        Player player = new Player(name, 100);

        Room[] rooms = {
                new Salas.emptyRoom(),
                new Salas.GemRoom(new Gem("Gema del Espacio")),
                new Salas.GemRoom.EnemyRoom("RedSkull", 10),
                new Salas.GemRoom(new Gem("Gema de la Realidad")),
                new Salas.GemRoom.EnemyRoom("Loki", 20),
                new Salas.GemRoom(new Gem("Gema de la Mente")),
                new Salas.GemRoom.EnemyRoom("Ultron", 20),
                new Salas.GemRoom(new Gem("Gema del tiempo")),
                new Salas.GemRoom(new Gem("Gema del poder")),
                new Salas.GemRoom.EnemyRoom("Hela", 20),
                new Salas.GemRoom(new Gem("Gema del Alma")),
                new Salas.GemRoom.EnemyRoom("Thanos", 30)
        };
        int roomIndex = 0;
        while (player.vidas() && roomIndex < rooms.length) {
            player.showStatus();
            System.out.println("Elige una Sala: 1 o 2");

            int choice = sc.nextInt();
            if (choice == 1) {
                rooms[roomIndex].enter(player);
                roomIndex++;
            } else if (choice == 2 && roomIndex + 1 < rooms.length) {
                rooms[roomIndex + 1].enter(player); // Accede a la siguiente sala
                roomIndex += 2; // Avanza dos índices, ya que eligió la segunda sala
            } else {
                System.out.println("Opción no válida, elige nuevamente.");
            }
        }

        if(player.vidas()) {
            System.out.println("Recuperastes gemas y saliste con vidas, Felicidades");

        } else {
            System.out.println("Tus enemigos te vencieron, perdiste. ");
        }
        sc.close();
    }
}