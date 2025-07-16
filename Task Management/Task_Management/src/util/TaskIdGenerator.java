package util;

public class TaskIdGenerator {
    private static int counter = 1;

    public static int generateId() {
        return counter++;
    }
}
