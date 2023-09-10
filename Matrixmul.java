public class Matrixmul {
    public static void main(String[] args) {
        // Define the matrices
        int[][] matrixA = {
            {1, 2},
            {3, 4},
        };

 

        int[][] matrixB = {
            {5, 6},
            {7, 8},
        };

 

        // Check if the matrices can be multiplied (columns of A == rows of B)
        if (matrixA[0].length != matrixB.length) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

 

        // Initialize the result matrix
        int rowsA = matrixA.length;
        int columnsB = matrixB[0].length;
        int[][] resultMatrix = new int[rowsA][columnsB];

 

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                int sum = 0;
                for (int k = 0; k < matrixA[0].length; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

 

        // Display the result matrix
        System.out.println("Result Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}