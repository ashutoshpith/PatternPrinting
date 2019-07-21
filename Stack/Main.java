import java.util.Stack;

class Main{
    public static void main(String[] args) {
        String s= "({[]})";
    
        Check(s);
    }
    static void Check(String str){
        Stack<Character> st = new Stack<>();
         
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (c =='{' || c=='[' || c=='(') {
                st.push(c);
                
            } else if(!st.empty() && 
            (
            (c == ']' && st.peek() == '[') 
            || (c == '}' && st.peek() == '{')
            || (c == ')' && st.peek() == '(') 
             )
            ){
                st.pop();
            }
            else{
                st.push(c);
            }
            
        }
 
         if(st.empty()) {
              System.out.println("Balanced");
         } else {
              System.out.println("Not balanced");
         }

    }
    
    
   
}
    