package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Shuvashish on 2/17/2018.
 */
public class SamplePage {

    @FindBy(how = How.XPATH, using = "//span[@class='title ng-binding']")
            private List<WebElement> foodNames;
    @FindBy(how = How.XPATH, using = "//span[@class='description ng-binding']")
            private List<WebElement> servings;

    public void printThirdAndFifthFoodItem(){
        System.out.println(foodNames.get(2).getText());
        System.out.println(foodNames.get(4).getText());
    }

    public void printAllFoodNameAndServings(){
        Map<String, String> foodNameAndServings = new HashMap<>();

        for(int i = 0; i<foodNames.size(); i++){
            foodNameAndServings.put(
                    foodNames.get(i).getText(), servings.get(i).getText()
            );
        }

        for(Map.Entry map : foodNameAndServings.entrySet()){
            System.out.println("Food name: "+map.getKey()+", Food serving: "+map.getValue());
        }

    }
}
