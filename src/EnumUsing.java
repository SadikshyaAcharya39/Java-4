enum Planets
{
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE
}

public class EnumUsing {
    public static void main(String[] args) {
        Planets planets = Planets.JUPITER;
        System.out.println(planets.name());
        System.out.println(planets.ordinal());
    }
}
