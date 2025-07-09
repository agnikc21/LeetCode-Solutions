class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String s:operations){
            if (s.equals("+")) {
                int num = stack.pop();
                int num2 = stack.peek();
                stack.push(num);
                stack.push(num+num2);
            }
            else if (s.equals("D")) stack.push(stack.peek()*2);
            else if (s.equals("C")) stack.pop();
            else{
                stack.push(Integer.parseInt(s));
            }

        }
        int sum=0;
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}