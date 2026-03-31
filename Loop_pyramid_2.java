public class Loop_pyramid_2 {
    public static void main(String[] args) {
        int row;
        int col;
        int rows=5;
        for (row=1;row<=rows;row++){
            for(col=1;col<=rows-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
