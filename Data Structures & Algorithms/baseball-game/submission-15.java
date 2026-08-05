//operations=['1','2','3','4']
//+ means add sum of top two records into the stack
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<operations.length;i++){
            if (operations[i].equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                int sum = a+b;
                stack.push(b);
                stack.push(a);
                stack.push(sum);
            }
            else if (operations[i].equals("C")){
                stack.pop();
            }
            else if (operations[i].equals("D")){
                int lastScore = stack.peek(); 
                stack.push(lastScore * 2);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int ans=0;
        for (int s : stack){
            ans = ans + s;
        }
        
        return ans;

    }
}