class Solution {
    public boolean checkPerfectNumber(int num) {
        int max=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                max+=i;
            }
        }
        if(max==num){
            return true;
        }
        return false;
    }
}