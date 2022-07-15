package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CommonDriver {
    public int getPageLoadTimeout() {
        return pageLoadTimeout;
    }

    public void setPageLoadTimeout(int pageLoadTimeout) {
        this.pageLoadTimeout = pageLoadTimeout;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public int getElementDetectionTimeout() {
        return elementDetectionTimeout;
    }

    public void setElementDetectionTimeout(int elementDetectionTimeout) {
        this.elementDetectionTimeout = elementDetectionTimeout;
    }

    public String getCurrentWorkingDirectory() {
        return currentWorkingDirectory;
    }

    public void setCurrentWorkingDirectory(String currentWorkingDirectory) {
        this.currentWorkingDirectory = currentWorkingDirectory;
    }

    private WebDriver driver;
    private int pageLoadTimeout;
    private int elementDetectionTimeout;

    private String currentWorkingDirectory;

    public CommonDriver(String browserType) throws IllegalArgumentException
    {
        pageLoadTimeout=10;
        elementDetectionTimeout=10;

        currentWorkingDirectory=System.getProperty("user.dir");
        if(browserType.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", currentWorkingDirectory+"/src/main/resources/chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browserType.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", currentWorkingDirectory+"/src/main/resources/geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else
        {
            throw new IllegalArgumentException("Invalid browser type");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void navigateTo(String url)
    {
        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, java.util.concurrent.TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, java.util.concurrent.TimeUnit.SECONDS);
        driver.get(url);
    }

    public void closeAllBrowser()
    {
        driver.quit();
    }

    public String getTitleOfThePage()
    {
        return driver.getTitle();
    }
}
