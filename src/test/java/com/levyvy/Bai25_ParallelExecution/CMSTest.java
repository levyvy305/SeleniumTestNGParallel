package com.levyvy.Bai25_ParallelExecution;

import com.levyvy.common.BaseTest;
import com.levyvy.drivers.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CMSTest extends BaseTest {
    @Test
    public void loginCMS() {
        DriverManager.getDriver().get("https://cms.anhtester.com/login");
        DriverManager.getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        DriverManager.getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        DriverManager.getDriver().findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
}
