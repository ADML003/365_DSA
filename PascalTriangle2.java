
class Solution {
    // Function to return the rth row of Pascal's triangle
    public int[] pascalTriangleII(int r) {
        int[] ans = new int[r]; // to store the answer
        
        // Set the first element of the row as 1
        ans[0] = 1; 
        
        // Compute each element in the rth row
        for(int i = 1; i < r; i++) {
            ans[i] = (ans[i-1] * (r - i)) / i;
        }
        
        return ans; // return the result
    }
}

class PascalTriangle2 {
    public static void main(String[] args) {
        // row number
        int r = 5; 

        // Create an instance of the Solution class
        Solution sol = new Solution(); 
        
        // Function call to return the rth row of Pascal's triangle
        int[] ans = sol.pascalTriangleII(r);

        // Output
        System.out.print("Row " + r + ": ");
        for(int x : ans) System.out.print(x + " ");
    }
}