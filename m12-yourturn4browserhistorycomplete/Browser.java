package yourturn4browserhistorycomplete;


import java.util.Stack;


public class Browser implements Browsable {
    
    private String currentURL="home page";
    private Stack<String> backHistory = new Stack<String>();
    private Stack<String> forwardHistory = new Stack<String>();

    @Override
    public String gotoURL (String url)
    {
        forwardHistory.clear();
        backHistory.add(currentURL);
        this.currentURL = url;
        return "current site:  " + currentURL;
    }

    @Override
    public String goBack ()
    {
        if (!backHistory.empty()) {
            this.forwardHistory.push(currentURL);
            currentURL = backHistory.pop();
        }
        return "current site:  " + currentURL;
    }
    
    @Override
    public String goForward ()
    {
        if (!this.forwardHistory.empty()) {
            this.backHistory.push(currentURL);
            currentURL = forwardHistory.pop();
        }
        return "current site:  " +currentURL;
    }
}



