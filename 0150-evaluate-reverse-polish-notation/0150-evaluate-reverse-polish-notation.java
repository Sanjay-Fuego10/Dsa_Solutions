class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();
         for(String ch:tokens){
            if(ch.equals("+")){
                int first = stack.pop();
                int second = stack.pop();
                int sum = second + first;
                stack.push(sum);
            }else if (ch.equals("-")){
                int first = stack.pop();
                int second = stack.pop();
                int sub = second - first; 
                stack.push(sub);
            }else if (ch.equals("*")){
                int first = stack.pop();
                int second = stack.pop();
                int mul = second * first;
                stack.push(mul);
            }else if(ch.equals("/")){
                int first = stack.pop();
                int second = stack.pop();
                int div = second / first;
                stack.push(div);
            }else{
                int num = Integer.parseInt(ch);
                stack.push(num);
            }
         }
         return stack.pop();   
    }
}