class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
       for(char a:s.toCharArray()){
        if(a=='{'){
            st.push('}');
        }else if(a=='('){
             st.push(')');
        }else if(a=='['){
             st.push(']');
        }
        else if(st.size()==0 || st.pop()!=a){
            return false;
        }
       }
       if(st.size()>0){
            return false;
        }
       return true;
    
    }
}