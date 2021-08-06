class Solution {
  
    public void call(int index,int[] arr,int target,List<List<Integer>>list,List<Integer>ans)
    {
        if(index==arr.length)
        {
            if(target==0)
            list.add(new ArrayList<>(ans));
            return;
        }
        
            if(arr[index]<=target)
            {
                ans.add(arr[index]);
                call(index,arr,target-arr[index],list,ans);
                ans.remove(ans.size()-1);
            }
           call(index+1,arr,target,list,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        call(0,candidates,target,list,ans);
        return list;
    }
}
