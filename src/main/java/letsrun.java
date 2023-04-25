import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class letsrun {

    @Test

    public void just(){

        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
        Page page = browser.newPage();
        page.navigate("https://demoqa.com/frames");

        //https://www.youtube.com/watch?v=WZbAGjFwN-o&list=PLFGoYjJG_fqrjcgRUcc2ubbZGtbRcC6W8&index=11
        //used xpath and css selector to go into frames
        String hg =  page.frameLocator("//*[@id=\"frame2\"]").locator("h1").textContent();
        System.out.println(hg);
        String hgx =  page.frameLocator("//*[@id=\"frame1\"]").locator("h1").textContent();
        System.out.println(hgx);

        browser.close();
        playwright.close();

    }
}
