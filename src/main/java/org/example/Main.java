package org.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Main {
    public static void main(String[] args) {
        try {
            Playwright py = Playwright.create();
            Browser browser= py.chromium().launch();
            Page page= browser.newPage();
            page.navigate("http://playwright.dev");

        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}