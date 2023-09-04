package myUtils;

public class Range {
    public static int[] range(int stop) {
        int[] arrayResult = new int[stop];
        for (int i = 0; i < stop; i++) {
            arrayResult[i] = i;
        }
        return arrayResult;
    }
}
