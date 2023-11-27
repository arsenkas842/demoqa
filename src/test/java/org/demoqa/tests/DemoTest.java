package org.demoqa.tests;

import org.aeonbits.owner.ConfigCache;
import org.demoqa.config.ConfigFactory;
import org.demoqa.config.FrameworkConfig;
import org.testng.annotations.Test;

public class DemoTest {

    // local, remote(selenium, selenide) : chrome, firefox
    @Test
    public void testLogin(){

        System.out.println(ConfigFactory.getConfig().browser());

       /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in");
        driver.quit();*/


    }
}
