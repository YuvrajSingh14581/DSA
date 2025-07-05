class Solution {
    public static int getSumOfSquars(int n){
        int sum =0;
        while(n>0){
            int temp =n%10;
            sum+=temp*temp;
            n=n/10;
        }return sum;
    }
    public boolean isHappy(int n) {
       HashSet<Integer> seen=new HashSet<>();
       while(n!=1 && !seen.contains(n)){
        seen.add(n);
        n=getSumOfSquars(n);
       }
       return n==1;
    }
}