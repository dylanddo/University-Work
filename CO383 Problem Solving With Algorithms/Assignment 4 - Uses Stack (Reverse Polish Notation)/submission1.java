import java.util.Scanner; 

public class submission1
{   
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        String inputs = scan.nextLine();
        int found = 0; 
        String[] expressions = inputs.split("[ ]");        
        System.out.println(evaluatePrefix(expressions)); 
    }

    static Boolean isInteger(String token) 
    { 
        try
        {
            int x = Integer.parseInt(token);
        } 
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    } 

    static int evaluatePrefix(String[] expressions) 
    { 
        Stack Stack = new Stack(); 
        for (int i = 0; i < expressions.length;  i++) 
        //Change for loop
        //i < expressions.length - 1 doesn't work because you going to the second last index not the last index.
        //i < expressions.length or i <= expressions.length - 1 would work since they are essentially the same thing.
        { 
            if (isInteger(expressions[i])) 
                Stack.push(Integer.parseInt(expressions[i])); 

            else 
            { 
                int o1 = Stack.pop(); 
                int o2 = Stack.pop();  
                switch (expressions[i]) 
                //Reverse expression
                { 
                    case "+": 
                    //Instead of Stack.push(o1 + o2) you do...
                    Stack.push(o2 + o1); 
                    break; 
                    case "-": 
                    //Instead of Stack.push(o1 - o2) you do...
                    Stack.push(o2 - o1);                     
                    break; 
                    case "x": 
                    //Instead of Stack.push(o1 * o2) you do...
                    Stack.push(o2 * o1); 
                    break; 
                } 
            } 
        } 

        return Stack.pop(); 
    } 

    static class Stack
    {
        private Node top;

        /**
         * Constructor for objects of class Stack
         */
        public Stack()
        {
            top = null;
        }

        /**
         * Push a new value onto the stack.
         * @param value The value to be pushed.
         */
        public void push(int value)
        {
            top = new Node(value, top);
        }

        /**
         * Pop (and return) the value on the top of the stack.
         * @return the value on the top of the stack.
         * @throws IllegalStateException if the stack is empty.
         */
        public int pop()
        {
            if(top != null) {
                int value = top.getValue();
                top = top.getNext();
                return value;
            }
            else {
                throw new IllegalStateException("pop() called on an empty stack.");
            }
        }

        /**
         * Is the stack empty.
         * @return true if the stack is empty, false otherwise.
         */
        public boolean isEmpty()
        {
            return top == null;
        }

        /**
         * Linked Node class to store a single element of
         * the stack and a link to the item immediately below
         * it on the stack.
         */
        class Node
        {
            private int value;
            private Node next;

            /**
             * Create a new node on the top of the stack.
             * Link it to the node below it.
             * @param value The value pushed on the stack.
             * @param oldTop The previous top of stack.
             */
            public Node(int value, Node oldTop)
            {
                this.value = value;
                this.next = oldTop;
            }

            /**
             * Get the value in this node.
             * @return the value.
             */
            int getValue()
            {
                return value;
            }

            /**
             * Get the next item in the stack.
             * @return the next item.
             */
            Node getNext()
            {
                return next;
            }
        }
    }
} 
