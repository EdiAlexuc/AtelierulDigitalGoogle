package Collections.CodeChallenge6;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        String direction = "right";

        while(top <= bottom && left <= right){
            if(direction.equals("right")){
                for(int i = left; i <=  right; i++){
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
            } else if (direction.equals("down")) {
                for(int i = top; i <= bottom; i++){
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            } else if (direction.equals("left")) {
                for(int i = right; i>=left;i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            } else if (direction.equals("up")) {
                for (int i = bottom; i >= top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
            direction = (direction.equals("right")) ? "down" :
                    (direction.equals("down")) ? "left" :
                            (direction.equals("left")) ? "up" : "right";
        }
    }
}
