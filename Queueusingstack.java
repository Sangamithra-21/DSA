//---------------------------------------IMPLEMENTATION OF QUEUE USING TWO STACKS------------------------------------------------

import java.util.Stack;

// solution 1:

class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();    
    }
    
    public void push(int x) {
        if(s1.isEmpty())
        {
            s1.push(x);
        }
        else
        {
        while(!s1.isEmpty())
        {
             int a=s1.pop();
             s2.push(a);
        }
        s1.push(x);
        }
        while(!s2.isEmpty())
        {
            int b=s2.pop();
            s1.push(b);
        }
    }
    
    public int pop() {
       if(s1.isEmpty())
       {
           return 0;
       }
       int c=s1.pop();
       return c;
        
    }
    
    public int peek() {
       int d=s1.peek();
       return d;
    }
    
    public boolean empty() {
        return s1.isEmpty();
       
}
}

/* Time Complexity: 
 * Push : O(N)
 * pop  : O(1)
 * Top  : O(1)
 * Empty: O(1)
 * 
 * Space Complexity:
 * O(N)
 */
 // -----------------------------------------------------------------------------------------------------------------------------------------------

 //Solution 2:

 class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();    
    }
    
    public void push(int x) {
       s1.push(x);
    }
    public int pop() {
       if(s1.isEmpty())
       {
           return 0;
       }
       int a=s1.size();
       while(a>1)
       {
           int b=s1.pop();
           s2.push(b);
           a--;
       }
       int c=s1.pop();
       while(!s2.isEmpty())
       {
           int d=s2.pop();
           s1.push(d);
       }
       return c;
        
    }
    
    public int peek() {
       int a=s1.size();
       while(a>1)
       {
           int b=s1.pop();
           s2.push(b);
           a--;
       }
       int c=s1.pop();
       s2.push(c);
       while(!s2.isEmpty())
       {
           int d=s2.pop();
           s1.push(d);
       }
       return c;
       
    }
    
    public boolean empty() {
        return s1.isEmpty();
       
}
}
/* 
* Time Complexity: 
 * Push : O(1)
 * pop  : O(N)
 * Top  : O(N)
 * Empty: O(1)
 * 
 * Space Complexity:
 * O(N)
 */
//-----------------------------------------------------------------------------------------------------------------------------------------

//Solution 3:

class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();    
    }
    
    public void push(int x) {
        s1.push(x);
    }
    public int pop() {
      while(!s1.isEmpty())
      {
          int a=s1.pop();
          s2.push(a);
      }
      int e=s2.pop();
      while(!s2.isEmpty())
      {
          int b=s2.pop();
          s1.push(b);
      }
      return e;
    }
    
    public int peek() {
        while(!s1.isEmpty())
      {
          int b=s1.pop();
          s2.push(b);
      }
      int e=s2.peek();
      while(!s2.isEmpty())
      {
          int b=s2.pop();
          s1.push(b);
      }
      return e;
         
    }

    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
}
}

/* 
* Time Complexity: 
 * Push : O(1)
 * pop  : O(N)
 * Top  : O(N)
 * Empty: O(1)
 * 
 * Space Complexity:
 * O(1)
 */



      
      
   

