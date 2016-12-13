/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/implement-queue-using-stacks/
 */

class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();
    public void push(int x) {
        st1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!st1.isEmpty())
        {
            st2.push(st1.pop());
        }
        st2.pop();
        while(!st2.isEmpty())
        {
            st1.push(st2.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while(!st1.isEmpty())
        {
            st2.push(st1.pop());
        }
        int num=0;
        num=st2.pop();
        st1.push(num);
        while(!st2.isEmpty())
        {
            st1.push(st2.pop());
        }
        return num;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(st1.isEmpty())
            return true;
        else
            return false;
    }
}