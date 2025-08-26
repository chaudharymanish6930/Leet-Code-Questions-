package A_Easy;

public class i_AreaOfMaximumDiagonal {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;

        int maxDiag =0;
        int maxArea = 0;

        for(int i=0; i<n; i++){
            int length = dimensions[i][0];
            int width = dimensions[i][1];

            int curdiag = length*length + width*width;
            int area = length * width;

            if(curdiag > maxDiag){
                maxDiag = curdiag;
                maxArea = area;
            }
            else if(curdiag == maxDiag ){
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[][]  arr = {
                {4,7},
                {9,7}
        };
        i_AreaOfMaximumDiagonal obj = new i_AreaOfMaximumDiagonal();
        System.out.println(obj.areaOfMaxDiagonal(arr));
    }
}
