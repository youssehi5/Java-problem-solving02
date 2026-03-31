public class Loop_pyramids_3 {
    public static void main(String[] args) {
        int row;
        int rows = 5;
        int col;
        int space;
        for ( row = 1; row <= rows; row++) {
            for ( space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }
            for ( col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
