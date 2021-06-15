package com.jeferson.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class Assertions {
    private final WebDriver driver;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }
    public void assertionsEquals() {
        WebElement element = driver.findElement(By.id("fulano"));
        String texto = "frase";
        System.out.println(">" + element.getText());
        org.junit.jupiter.api.Assertions.assertEquals(texto, element.getText());
    }

    /** Deve import hamcrest **/
    public void assertionsContainsString() {
        WebElement element = driver.findElement(By.id("fulano"));
        String texto = "frase";
        assertThat(element.getText(), containsString(texto));
    }
}
