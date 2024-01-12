package facadepattern;

import java.util.Stack;

public class StackFacade {
    Stack<String> insideStack = new Stack<>();
    

    public boolean empty ()
    {
        return insideStack.empty();
    }

    public String push (String value)
    {
        return insideStack.push(value);
    }
}
