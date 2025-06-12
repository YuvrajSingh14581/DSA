class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> person=new ArrayList<>();
        for(int i =1;i<=n;i++){person.add(i);}
        return solve(person,k,0);

    }
    public int solve(List<Integer>person,int k,int ind){
        if(person.size()==1){
            return person.get(0);
        }
        ind=(ind+(k-1)) % person.size();
        person.remove(ind);
        return solve(person,k,ind);
    }
}