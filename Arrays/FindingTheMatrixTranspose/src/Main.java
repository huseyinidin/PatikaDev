public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[2][3];

        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number++;
            }
        }
        // Second
        System.out.println("Matrix");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("\nTranspose");
        for (int i = 0; i <= matrix.length; i++) {
            for (int[] j : matrix) {
                System.out.print(j[i] + " ");
            }
            System.out.println();
        }
        /*
            first coding, another way

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose");
        for (int i = 0; i <= matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }*/
    }
}
