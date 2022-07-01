//Time complexity: O(2^N)
//Space Complexity: O(n)
class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res= new ArrayList<>();
        if(candidates == null || candidates.length==0) return res;
        helper(candidates, target,0,new ArrayList<>());
        return res;
    }
    
    private void helper(int[] candidates, int target, int i, List<Integer> path){
        // base case
        if(target==0){
            res.add(path);
            return;
        }
        
        if(i== candidates.length || target <0) return;
             // no choose
        helper(candidates, target,i+1,new ArrayList<>(path));
        path.add(candidates[i]);
        // choose 
        helper(candidates, target-candidates[i],i,new ArrayList<>(path));
   
    }
}
