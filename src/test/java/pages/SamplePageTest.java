package pages;

import browser.Browser;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 2/18/2018.
 */
public class SamplePageTest {

    @Test
    public void printAllFoodNameAndServingsTest(){
        Browser.openBrowser().printAllFoodNameAndServings();
    }

    @Test
    public void printThirdAndFifthFoodItemTest(){
        Browser.openBrowser().printThirdAndFifthFoodItem();
    }

}
