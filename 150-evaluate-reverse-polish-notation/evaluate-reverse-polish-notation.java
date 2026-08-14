class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();

        for(String C:tokens){
            if(C.equals("+")){
                st.push(st.pop()+st.pop());
            }else if(C.equals("-")){
                int second=st.pop();
                int first=st.pop();
                st.push(first-second);
            }else if(C.equals("*")){
                 st.push(st.pop()*st.pop());
            }else if(C.equals("/")){
                int second=st.pop();
                int first=st.pop();
                st.push(first/second);
            }else{
                st.push(Integer.parseInt(C));
            }
        }
        return st.peek();
    }
}