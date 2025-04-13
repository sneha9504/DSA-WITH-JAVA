public class ReverseStar {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
