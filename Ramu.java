public class Ramu {

    /*
     * Ramu had a farm of 5 x 5, in that farm Ramu and planted tomato seeds on first
     * row, first column and last column and
     * remaining he planted potato plants. After planting, Ramu named each of the
     * plants 1-25 serial numbers
     * given a plant number return whether it is tomato or potato plant.
     */
    public static void main(String[] args) {
        int n = 5;
        int val = 1;

        int i = (val - 1) / n;
        int j = (val - 1) % n;

        if (i == 0 || j == 0 || j == n - 1) {
            System.out.println("Tomato");
        } else {
            System.out.println("Potato");
        }

    }
}
