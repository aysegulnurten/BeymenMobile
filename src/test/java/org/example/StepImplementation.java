package org.example;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.example.BaseTest.appiumDriver;

public class StepImplementation {

    @Step("<by>li id elemente tikla1");
    public void clickBtni1(String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<by>li id elemente tikla2");
    public void clickBtn2 (String by) throws InterruptedException {
        Thread.sleep(3000l);
        appiumDriver.findElement(By.id(by)).click();
    }

    @Step("<by> id'li elemente <text> text degerini yaz")
    public void sendKeysbyid (String id, String text) {
       appiumDriver.findElement(By.ById(id)). sendKeys(text);
       System.out.println(text + "Degeri yazildi");
       appiumDriver.findElement(By.id(id)).sendKeys (Keys.ENTER)
        }

        @Step("<by> id'li elemente tikla3")
        public void clickBtn3 (String by) throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElements(By.id(by)).click();
        }
        @Step("<xpath> xpath'li element tikla1")
        public void clickBtn4 (String by) throws InterruptedException {
        appiumDriver. findElements(By.xpath(xpath)).click();
        }
        @Step("<xpath> xpath'li elemnt tikla2")
        public void clickBtn5 (String by) throws InterruptedException {
            String xpath = new String();
            appiumDriver. findElements(By.xpath(xpath)).click();
        }
        @Step(">by> id'li elemente tikla4")
        public void clickBtn6 (String by) throws InterruptedException {
        appiumDriver.findElements(By.id(by)). click();
        }

}
