package dev.nacho;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Planet earth = new Planet("Earth", 1, 5.972E24, 1.08321E12, 12742, 149600000, PlanetType.TERRESTRE, true, 1.0, 1.0);
        Planet jupiter = new Planet("Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778500000, PlanetType.GASEOSO, true, 11.86, 0.409722);

        System.out.println(earth);
        System.out.println();
        System.out.println(jupiter);

    }
}
