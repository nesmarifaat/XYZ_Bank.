package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.Utility.generateRandomNumber;

public class P02_HomeII {


    WebDriver driver;

    //2-Define Constractor

    public P02_HomeII(WebDriver driver) {
        this.driver = driver;
    }



    //TODO: choose one dynamic name from menu
    private final By allnames=By.xpath("(//option[@value][3])");
    public P02_HomeII chooserandomname()
    {
        for (int i=2;i<=generateRandomNumber();i++){
            By.xpath("(//select//option[@value]["+i+"])").findElement(driver).click();

        }
        return this;
    }

    //TODO: click on login button

    private final By loginbutton=By.xpath("//button[@type=\"submit\"]");

    public P02_HomeII clickonlohinbutton(){
        driver.findElement(this.loginbutton).submit();
        return this;
    }

    private final By welcome=By.xpath("//strong[contains(text(),'Welcome')]|/span[@class='fontBig ng-binding']");

    public Boolean checkwelcomemsg()
    {
        System.out.println(driver.findElement(this.welcome).getText());
        return driver.findElement(this.welcome).getText().contains("Welcome");
    }
}
