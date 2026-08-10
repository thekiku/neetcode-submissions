class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                stack.push(Integer.parseInt(token));
            }
            else {

                int num2 = stack.pop();
                int num1 = stack.pop();
                
                if(token.equals("+")){
                    int res = num1 + num2;
                    stack.push(res);
                }
                else if(token.equals("-")){
                    int res = num1 - num2; 
                    stack.push(res);
                }
                else if(token.equals("*")){
                    int res = num1 * num2;
                    stack.push(res);
                }
                else {
                    int res = num1 / num2; 
                    stack.push(res);
                }
            }
        }
        return stack.pop();
    }
}