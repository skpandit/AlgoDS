/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/min-stack/
 */
 
public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> s ;
    Stack <Integer> minS ;
    public MinStack() {
        s=new Stack<Integer>();
        minS=new Stack<Integer>();
    }
    
    public void push(int x) {
        s.push(x);
        if(minS.isEmpty())
            minS.push(x);
        else{
            if(x<=minS.peek())
            {
                minS.push(x);
            }
        }
    }
    
    public void pop() {
        if(s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        
        if(temp==minS.peek()) 
            minS.pop();
    }
    
    public int top() {
        if(s.isEmpty()) 
            return 0;
        else
            return s.peek();
    }
    
    public int getMin() {
        if(s.isEmpty())
            return 0;
        else
            return minS.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
