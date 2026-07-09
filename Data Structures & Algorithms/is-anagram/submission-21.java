class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String[] s_unique = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            s_unique[i] = String.valueOf(s.charAt(i));
        }
        String[] t_unique = new String[s.length()];
        for(int i = 0; i < t.length(); i++){
            t_unique[i] = String.valueOf(t.charAt(i));
        }        
        Arrays.sort(s_unique);
        Arrays.sort(t_unique);
        
        return Arrays.equals(s_unique, t_unique);
    }
}
