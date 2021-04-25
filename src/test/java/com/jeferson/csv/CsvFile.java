package com.jeferson.csv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsvFile {

    /**
     * Adiciona dependencia "junit-jupiter-params"
     * Adiciona pasta resources e criar arquivo "fulano.csv"
     * Mais inforamações acessar https://www.baeldung.com/parameterized-tests-junit-5
    **/

    @ParameterizedTest
    @CsvFileSource(resources = "/fulano.csv", numLinesToSkip = 1)
    public void entrarLogin(String usuario, String senha) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.juliodelima.com.br/taskit/");
        WebElement signIn = driver.findElement(By.cssSelector(".modal-trigger"));
        signIn.click();

        WebElement login = driver.findElement(By.cssSelector("#signinbox input[name='login']"));
        login.sendKeys(usuario);

        WebElement password = driver.findElement(By.cssSelector("#signinbox input[name='password']"));
        password.sendKeys(senha);

        WebElement entrar = driver.findElement(By.cssSelector("#signinbox a"));
        entrar.click();

        driver.quit();
    }

}
