class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> bracketStack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentBracket = s.charAt(i);
            
            if (currentBracket == '(' || currentBracket == '[' || currentBracket == '{') {
                bracketStack.push(currentBracket);
            } 
            else {
                if (bracketStack.isEmpty()) { 
                    return false;
                }

                char lastOpenedBracket = bracketStack.peek();
                
                if ((currentBracket == ')' && lastOpenedBracket == '(') || 
                    (currentBracket == ']' && lastOpenedBracket == '[') || 
                    (currentBracket == '}' && lastOpenedBracket == '{')) {
                    bracketStack.pop();
                } 
                else {
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }
}
