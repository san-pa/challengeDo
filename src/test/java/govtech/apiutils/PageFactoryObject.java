package govtech.apiutils;

import org.openqa.selenium.WebDriver;

public class PageFactoryObject {


    HomePage myacc;


    /*** Getters ***/

    public HomePage getHomePage() {
        return myacc;
    }


    public PageFactoryObject(WebDriver driver){

        myacc = new HomePage(driver);
    }





}
