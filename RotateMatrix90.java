
class RotateMatrix90 {
    //Function to rotate the given matrix by 90 degrees clockwise
     
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Initialize new matrix to store rotated values
        int[][] rotated = new int[n][n];
        
        // Perform rotation logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        
        // Copy rotated elements tooriginal matrix
        for (int i = 0; i < n; i++) {
            System.arraycopy(rotated[i], 0, matrix[i], 0, n);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Create an instance of the Solution class
        RotateMatrix90 sol = new RotateMatrix90();
        
        // Rotate the matrix
        sol.rotate(arr);
        
        // Print the rotated matrix
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
