public class FlourPacker {

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;

        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Test Cases:");

        System.out.println("canPack(1, 0, 4) → " + canPack(1, 0, 4));     // false
        System.out.println("canPack(1, 0, 5) → " + canPack(1, 0, 5));     // true
        System.out.println("canPack(0, 5, 4) → " + canPack(0, 5, 4));     // true
        System.out.println("canPack(2, 2, 11) → " + canPack(2, 2, 11));   // true
        System.out.println("canPack(-3, 2, 12) → " + canPack(-3, 2, 12)); // false
        System.out.println("canPack(2, 1, 5) → " + canPack(2, 1, 5));     // true
        System.out.println("canPack(2, 1, 10) → " + canPack(2, 1, 10));   // true
        System.out.println("canPack(2, 1, 12) → " + canPack(2, 1, 12));   // false
        System.out.println("canPack(2, 1, 7) → " + canPack(2, 1, 7));     // true
    }
}
