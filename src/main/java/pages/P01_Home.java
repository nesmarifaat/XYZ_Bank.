package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.Utility.generateRandomNumber;

public class P01_Home {

    //1- Define Webdriver
    WebDriver driver;

    //2-Define Constractor

    public P01_Home(WebDriver driver) {
        this.driver = driver;
    }

   //TODO: Click on cutomer login
    private final By Cutomerlogin=By.xpath("//button[normalize-space()='Customer Login']");

    public P01_Home clickoncusomerlogin(){
        driver.findElement(this.Cutomerlogin).click();
        return this;
    }


    private final By menuname=By.id("userSelect");

    public P01_Home openmenu(){

        driver.findElement(this.menuname).click();
        return this;
    }


}
