package base;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static utilities.Storage.getScenario;

@Slf4j
public class BasePage extends PageObject {
    private EnvironmentVariables env;

    public Boolean isElementDisplay(By by) {
        return getElement(by).isPresent();
    }

    public void click(By by) {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public List<WebElementFacade> getElements(By by) {
        try {
            return findAll(by);
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
        return null;
    }

    public WebElementFacade getElement(By by) {
        try {
            return find(by);
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
        return null;
    }

    public void type(By by, String value) {
        getScenario().log("Type : " + value + " : " + by);
        waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);
    }

    public void waitBySeconds(int seconds) {
        try {
            log.info(seconds + " saniye bekliyor");
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getText(By by) {
        getScenario().log("Get By text : " + by);
        return waitForCondition().until(ExpectedConditions.presenceOfElementLocated(by)).getText();
    }

    public void assertTextEquals(String actualText, String expectedText) {
        getScenario().log("Assert Text are equals : " + expectedText + " actual " + actualText);
        Assert.assertEquals(actualText + " and " + expectedText + " texts are equal!",
                actualText, expectedText);
    }

    public void controlUrl(String urlContains, String expectedUrl) throws Exception {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(Serenity.getDriver(), Duration.ofSeconds(2));
        wait.until(ExpectedConditions.urlContains(urlContains));
        String url = Serenity.getDriver().getCurrentUrl();
        String expected = EnvironmentSpecificConfiguration.from(env).getProperty(expectedUrl);
        assertTextEquals(url, expected);
    }

    public String typeRandomValueFromDataLists(By dataTableValuesLocator, By inputValueLocator){
        List<WebElementFacade> dataTableLists = getElements(dataTableValuesLocator);
        Random rnd = new Random();
        int rndCount = rnd.nextInt(dataTableLists.size());
        String dataTableValue = dataTableLists.get(rndCount).getText();
        type(inputValueLocator, dataTableValue);
        return dataTableValue;
    }

    public void assertTrue(boolean expected, String message) {
        Assert.assertTrue(message, expected);
    }

    public void checkDateTime(By DateTimeList, String dateTime) {
        boolean validation = false;
        List<WebElementFacade> dateTimeList = getElements(DateTimeList);

        for(WebElement dateTimeOnTable : dateTimeList){
            String dateTimeValue = dateTimeOnTable.getText();
            boolean isExist = dateTimeValue.startsWith(dateTime);
            if(isExist){
                validation = true;
                break;
            }
        }
        assertTrue(validation, "Date time should be on table");
    }

    public void informationTextOnPage(String info) {
        String informationBoxText = getText(By.xpath("//*[contains(text(), '" + info + "')]"));
        assertTextEquals(informationBoxText, info);
    }

    public void checkNumericValue(By NumericValueList, String numValue) {
        boolean validation = false;
        List<WebElementFacade> numericValueList = getElements(NumericValueList);

        for(WebElement numericValueOnTable : numericValueList){
            String numericValue = numericValueOnTable.getText();
            boolean isExist = numericValue.startsWith(numValue);
            if(isExist){
                validation = true;
                break;
            }
        }
        assertTrue(validation, "Numeric Value should be on table");
    }

    public void checkStringValue(By StringValueList, String strValue) {
        boolean validation = false;
        List<WebElementFacade> stringValueList = getElements(StringValueList);

        for(WebElement stringValueOnTable : stringValueList){
            String stringValue = stringValueOnTable.getText();
            boolean isExist = stringValue.startsWith(strValue);
            if(isExist){
                validation = true;
                break;
            }
        }
        assertTrue(validation, "String Value should be on table");
    }

    protected void jsClicker (By by) {
        evaluateJavascript("var evt = document.createEvent('MouseEvents');"
                + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
                + "arguments[0].dispatchEvent(evt);", find(by));
    }
}
