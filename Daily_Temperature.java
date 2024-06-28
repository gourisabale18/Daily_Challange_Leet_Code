class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //this problem is similar to find next greater element

        Stack<Integer> stk=new Stack<>();
        int len=temperatures.length;

//here i refers to the current index of element in array
        int[] ans=new int[len];
        for(int i=0;i<len;i++)
        {
            //we got the next earm temp
            while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()])
            {
                int prevIndex=stk.pop();
                ans[prevIndex]=i-prevIndex;
            }
            //we didnt get the next warm temp
            stk.push(i);//push current element to stack
        }
        return ans;
    }   
        
    }