import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Grades_Calc extends MainXpaths {


    public void take_grades() throws Exception
    {

        System.setProperty("key", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get(StartPageURL);
        WebElement FamNameField = driver.findElement(By.xpath(Family_name_Field));
        FamNameField.sendKeys(Family_name);
        WebElement GivenNameField=driver.findElement(By.xpath(First_name_Field));
        GivenNameField.sendKeys(First_name);
        Select Dropdown = new Select(driver.findElement(By.xpath(Dropdown1)));
        Dropdown.selectByVisibleText(Country);
        WebElement Email=driver.findElement(By.xpath(EmailField));
        Email.sendKeys(Email1);
        WebElement ReEmail=driver.findElement(By.xpath(ReenterField));
        ReEmail.sendKeys(Email1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        TimeUnit.SECONDS.sleep(5);
        WebElement NoUpdateField= driver.findElement(By.xpath(NoUpdate));
        NoUpdateField.click();
        TimeUnit.SECONDS.sleep(5);
        WebElement ContinueButton = driver.findElement(By.xpath(Continue));
        ContinueButton.click();
        TimeUnit.SECONDS.sleep(5);
        js.executeScript("window.scrollBy(0,1000)");
        Select COE = new Select(driver.findElement(By.xpath(CountryofEducationDrop)));
        COE.selectByVisibleText(Country);
        TimeUnit.SECONDS.sleep(5);
        WebElement InstituteF=driver.findElement(By.xpath(InstituteNameField));
        InstituteF.sendKeys(InstituteName);
        TimeUnit.SECONDS.sleep(5);
        WebElement DegreenameF=driver.findElement(By.xpath(DegreeNameField));
        DegreenameF.sendKeys(DegreeName);
        TimeUnit.SECONDS.sleep(5);
        Select NOY= new Select(driver.findElement(By.xpath(NumberofYearsDrop)));
        NOY.selectByVisibleText(NumberofYears);
        TimeUnit.SECONDS.sleep(5);
        WebElement AgreetermsRadio=driver.findElement(By.xpath(AgreeTerms));
        AgreetermsRadio.click();
        TimeUnit.SECONDS.sleep(5);
        WebElement ContinueNo2=driver.findElement(By.xpath(Continue2));
        ContinueNo2.click();

//This takes you upto step 3

        int n = getnum();
        System.out.println("You have entered"+ " "+ n +" "+"courses");
        while (n>0)
        {
            n=n-1;

        }






    }
    public int getnum(){
        System.out.println("Please enter the number of courses with As");
        Scanner number_of_courses = new Scanner(System.in);
        int As = number_of_courses.nextInt();
        return As;


    }


    public static void main(String args[]) throws Exception
    {

        Grades_Calc calc = new Grades_Calc();
        calc.take_grades();

    }


}
