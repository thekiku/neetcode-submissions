class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<operations.length;i++){
            if (operations[i].equals("+")){
                int last=s.pop();
                int second_last=s.peek();
                int sum=last+second_last;
                s.push(last);
                s.push(sum);
            }
            else if (operations[i].equals("C")){
                s.pop();
            }
            else if (operations[i].equals("D")){
                int last=s.peek();
                s.push(2*last);
            }
            else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int ans=0;
        for (int i=0;i<s.size();i++){
            ans=ans+s.get(i);
        }
        return ans;
    }
}