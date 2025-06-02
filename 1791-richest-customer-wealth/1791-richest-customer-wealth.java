class Solution {
    public int maximumWealth(int[][] accounts) {
        int alt=0;
        for(int i=0;i<accounts.length;i++){
            int max=0;
            for(int j=0; j<accounts[i].length;j++){
                if(j<accounts[i].length){
                    max+=accounts[i][j];
                }
                alt=Math.max(alt,max);
            }   
        }
        return alt;
    }
}