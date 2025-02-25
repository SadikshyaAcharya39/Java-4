enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class LoopThroughEnum {
    public static void main(String[] args) {
        for(Level lvl: Level.values()){
            System.out.println(lvl);
        }
    }
}
