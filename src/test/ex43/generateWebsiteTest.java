package ex43;

import junit.framework.TestCase;

public class generateWebsiteTest extends TestCase {

    public void testCreateWebsite() {
       generateWebsite web = new generateWebsite();
       web.path = "src/main/exercise43_input.txt";
       web.siteName = "KrazyKupcakes";
       web.author = "Noname";
       String expected = "src/main/exercise43_input.txt/KrazyKupcakes";
        }

    public void testCreateJSFolder() {

    }

    public void testCreateCSSFolder() {
    }

    public void testCreateHTMl() {
    }
}