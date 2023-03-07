public class Counter {
    private static int id;

    public Counter(int id) {
        this.id = id;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Counter.id = id;
    }
}
