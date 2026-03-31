public class Loop_pyramid_4 {
    public static void main(String[] args) {
        int rows = 5;
        int row;
        int col;
        int space;

        for(row=1;row<=rows;row++){
            for(space=1;space<=row -1;space++){
                System.out.print(" ");
            }

        for(col=1;col<=2*(rows-row)-1;col++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}