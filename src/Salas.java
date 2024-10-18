
public class Salas {
    public static class emptyRoom implements Room{
        @Override
        public void enter(Player player) {
            System.out.println("Entraste a una sala vacía");
        }

    }
    public static class GemRoom implements Room {
        private gameObject gem;

        public GemRoom(gameObject gemas) {
            this.gem = gemas;
        }

        @Override
        public void enter(Player player) {
            System.out.println("Encontraste una gema: " + gem.getName());
            player.colleccion(gem);
        }
        public static class EnemyRoom implements Room{
            private String villano;
            private int damage;

            public EnemyRoom(String villano, int damage) {
                this.villano = villano;
                this.damage = damage;
            }

            @Override
            public void enter(Player player) {
                System.out.println("Encontraste a " + villano + ". Se enfrentan a un combate pero te hizo daño.");
                player.takeDamage(damage);
            }
        }
    }
}
