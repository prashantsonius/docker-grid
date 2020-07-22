package com.helpers;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;

public class CommonActions {
    protected static WebDriver driver;

    public static String getUrlFromEnvFile(String url){
        Dotenv dotenv = Dotenv.load();
        return dotenv.get(url);
    }
}
