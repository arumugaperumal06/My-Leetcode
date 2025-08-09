class Solution {
    public boolean isValid(String s) {
        Stack<Character> paran = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '{' || c== '[')
                paran.push(c);
            else
            {
                if(paran.isEmpty()) return false;
                char top = paran.pop();
                if((c ==')' && top != '(')||(c ==']' && top != '[')||(c =='}' && top != '{'))
                    return false;
                
            }
        }
        return paran.isEmpty();
    } 
    
}
