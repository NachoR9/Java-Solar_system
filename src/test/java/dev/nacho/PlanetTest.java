package dev.nacho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlanetTest {
    @Test
    void testCalculateDensity() {
        Planet planet = new Planet("Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778500000, PlanetType.GASEOSO, true, 11.86, 0.409722);
        assertEquals(1.32608574E12, planet.calculateDensity(), 1E15);
    }

    @Test
    void testIsExterior() {
        Planet planet = new Planet("Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778500000, PlanetType.GASEOSO, true, 11.86, 0.409722);
        assertTrue(planet.isExterior());
    }

    @Test
    void testIsNotExterior() {
        Planet planet = new Planet("Earth", 1, 5.972E24, 1.08321E12, 12742, 149600000, PlanetType.TERRESTRE, true, 1.0, 1.0);
        assertFalse(planet.isExterior());
    }
    @Test
    void testToString() {
        Planet planet = new Planet("Jupiter", 79, 1.898E27, 1.43128E15, 139820, 778500000, PlanetType.GASEOSO, true, 11.86, 0.409722);
        assertEquals(
            "Planet [name=Jupiter, satellites=79, mass=1.898E27, volume=1.43128E15, diameter=139820, sunDistance=778500000, planetType=GASEOSO, observable=true, orbitalPeriod=11.86, rotationPeriod=0.409722]",
            planet.toString());
    }
}
