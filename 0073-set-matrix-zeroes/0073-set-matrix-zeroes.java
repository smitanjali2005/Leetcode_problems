class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        //flag to check whether first row needs to be zeroed
        boolean firstrowzero=false;
        //flag to check whether first column needs to be zeroed
        boolean firstcolzero=false;
        //check if 0 is present in first row
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstrowzero=true;
                break;
            }
        }
        //check if 0 is present in first col
        for(int j=0;j<m;j++){
            if(matrix[j][0]==0){
                firstcolzero=true;
                break;
            }
        }
        //set the first row and col elements as markers
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //convert the other cells to 0
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //zero the first row if needed
        if(firstrowzero){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        //zero the first col if needed
        if(firstcolzero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}