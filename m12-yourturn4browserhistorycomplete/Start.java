package yourturn4browserhistorycomplete;

public class Start {
    public static void main(String[] args) {
        Browser browser = new Browser();
        System.out.println ("Going to some sites:");
        System.out.println(browser.gotoURL("cookiesandicecream.com"));
        System.out.println(browser.gotoURL("happynews.com"));
        System.out.println(browser.gotoURL("studyhard.com"));
        System.out.println(browser.gotoURL("clouds.com"));
        System.out.println(browser.gotoURL("sailing.com"));

        System.out.println ("\ngoing back three times");
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());

        System.out.println ("\ngoing forward four times");
        System.out.println(browser.goForward());
        System.out.println(browser.goForward());
        System.out.println(browser.goForward());
        System.out.println(browser.goForward());

        System.out.println ("\ngoing back six times");
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());

        System.out.println ("\ngoing to ZOP");
        System.out.println(browser.gotoURL("zenofprogramming.com"));
        System.out.println ("\ngoing forward");
        System.out.println (browser.goForward());
    }
}
