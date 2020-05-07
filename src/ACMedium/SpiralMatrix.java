package ACMedium;

/*
Given a matrix of m x n elements (m rows, n columns),
return all elements of the matrix in spiral order.

Example 1:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        return list;

    }



    public static void main(String[] args) {
      int[][] matrix =  {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}

        };

        System.out.println("Input:");
        for(int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));


    }
}
