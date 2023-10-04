import java.util.LinkedList;
import java.util.Queue;

// --------------------------------- IMPLEMENTATION OF STACK USING TWO QUEUES------------------------------------------ 

//Solution 1:

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();   
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        int n = q1.size();
        while (n > 1) {
            int a = q1.poll();
            q2.offer(a);
            n--;
        }
        int b = q1.poll();
        while (!q2.isEmpty()) {
            int c = q2.poll();
            q1.offer(c);
        }
        return b;
    }
    
    public int top() {
        int n = q1.size();
        while (n > 1) {
            int a = q1.poll();
            q2.offer(a);
            n--;
        }
        int b = q1.poll();
        q2.offer(b);
        while (!q2.isEmpty()) {
            int c = q2.poll();
            q1.offer(c);
        }
        return b;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/* Time Complexity: 
 * Push : O(1)
 * pop  : O(N)
 * Top  : O(N)
 * Empty: O(1)
 * 
 * Space Complexity:
 * O(N) - Queue 1 and Queue 2
 */
//----------------------------------------------------------------------------------------------------------------------------------------------
 //Solution 2

 class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();   
    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty())
        {
            int a=q1.poll();
            q2.offer(a);
        }
            Queue<Integer> temp=q1;
            q1=q2;
            q2=temp;
        }
    
    public int pop() {
        if(q1.isEmpty())
        {
            return 0;
        }
        int c=q1.poll();
        return c;
    }
    
    public int top() {
         return q1.peek();
    }
    
    public boolean empty() {
        int n=q1.size();
        if(n==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/* Time Complexity: 
 * Push : O(N)
 * pop  : O(1)
 * Top  : O(1)
 * Empty: O(1)
 * 
 * Space Complexity:
 * O(N) - Queue 1 and Queue 2
 */

 //--------------------------------------------------------------------------------------------------------------------------------------------

 //Solution 3

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();   
    }
    
    public void push(int x) {
        if(q1.isEmpty())
        {
            q1.offer(x);
        }
        else
        {
            while(!q1.isEmpty())
            {
                int d=q1.poll();
                q2.offer(d);
            }
            q1.offer(x);
            while(!q2.isEmpty())
            {
                int e=q2.poll();
                q1.offer(e);
            }

        }
    }
    public int pop() {
        if(q1.isEmpty())
        {
            return 0;
        }
        int c=q1.poll();
        return c;
    }
    
    public int top() {
         return q1.peek();
    }
    
    public boolean empty() {
        int n=q1.size();
        if(n==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/* Time Complexity: 
 * Push : O(N)
 * pop  : O(1)
 * Top  : O(1)
 * Empty: O(1)
 * 
 * Space Complexity:
 * O(N) - Queue 1 and Queue 2
 */


 //-----------------------------IMPLEMENTATION OF STACK USING SINGLE QUEUE--------------------------------------------------

 //Solution 1:

 class MyStack {

    Queue<Integer> q1;
    
    public MyStack() {
        q1 = new LinkedList<>();  
    }
    
    public void push(int x) {
        q1.offer(x);
        int n=q1.size();
        while(n>1)
        {
            int b=q1.poll();
            q1.offer(b);
        }
    }
    public int pop() {
        if(q1.isEmpty())
        {
            return 0;
        }
        int c=q1.poll();
        return c;
    }
    
    public int top() {
         return q1.peek();
    }
    
    public boolean empty() {
        int n=q1.size();
        if(n==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/* Time Complexity: 
 * Push : O(N)
 * pop  : O(1)
 * Top  : O(1)
 * Empty: O(1)
 * 
 * Space Complexity:
 * O(n)
 */
