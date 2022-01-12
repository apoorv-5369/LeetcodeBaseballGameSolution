class Solution {
    public int calPoints(String[] ops) {
        int z=0;
        int arr[] = new int[ops.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<ops.length; i++){
            String a = ops[i];
            if(a.equals("C")) stack.pop();
            else if(a.equals("D")){
                stack.push(stack.peek()*2);               
            }
            else if(a.equals("+")){
                int p = stack.pop();
                int q = stack.pop();
                stack.push(q);
                stack.push(p);
                stack.push(p+q);
            }else{
                stack.push(Integer.parseInt(a));
            }
        }
        while(!stack.isEmpty()){
                    z+=stack.peek();
                    stack.pop();
                }
        return z;
    }
}
