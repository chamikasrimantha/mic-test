import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] A) {
        int treesPlanted = 0;
        int prefixSum = 0;

        for (int i = 0; i < A.length; i++) {
            prefixSum += A[i];
            int neighborhoodSum = Math.min(prefixSum, 0);
            if (neighborhoodSum < 0) {
                treesPlanted += -neighborhoodSum;
                prefixSum += -neighborhoodSum;
            }
        }

        return treesPlanted;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A1 = {1, -3, 2};
        int[] A2 = {-3, 2, 4, -5, 3};
        int[] A3 = {-2, 1, -3, 1};

        System.out.println(solution.solution(A1));
        System.out.println(solution.solution(A2));
        System.out.println(solution.solution(A3)); 
    }
}
