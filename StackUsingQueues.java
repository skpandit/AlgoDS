/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/implement-stack-using-queues/
 */

class MyStack {
    // Push element x onto stack.
    Queue queue1 = new LinkedList <Integer>();
    Queue queue2 = new LinkedList <Integer>();
    public void push(int x) {
        queue1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(queue1.isEmpty())
            return;
        while(queue1.size()!=1){
            queue2.add(queue1.remove());
        }
        queue1.remove();
        queue1=queue2;
        queue2=new LinkedList <Integer>();
    }

    // Get the top element.
    public int top() {
        if(queue1.isEmpty())
            return -1;
        int temp=0;
        while(!queue1.isEmpty()){
            temp=(int)queue1.remove();
            queue2.add(temp);
        }
        queue1=queue2;
        queue2=new LinkedList <Integer>();
        return temp;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue1.isEmpty();
    }
}