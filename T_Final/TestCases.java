package T_Final;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases extends PageSetup {
	
	@Test  
	public void Case1() throws InterruptedException {
	  //Login Test
		Utils.preconditionLoginUser();
		

	    WebElement conectare = driver.findElement(By.xpath("//*[@id=\"HeaderRow\"]/div[4]/div/ul/li[1]/a[1]/span"));
	    conectare.click();
	    Thread.sleep(2000);
	    WebElement conectare2 = driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/div[4]/div/ul/li[1]/div[2]/a[1]"));
	    conectare2.click();
	    Thread.sleep(2000);
	    WebElement mail = driver.findElement(By.id("ShopLoginForm_Login"));
	    mail.sendKeys(Constants.LOGIN_MAIL);
	    WebElement pass = driver.findElement(By.id("ShopLoginForm_Password"));
	    pass.sendKeys(Constants.LOGIN_PASSWORD);
	    WebElement creeaza = driver.findElement(By.xpath("/html/body/div[2]/div/div[9]/div[1]/div/div[1]/div/form/div[4]/div/button"));
	    creeaza.click();
	    
	   
   }
	
	@Test 
    public void Case2() throws InterruptedException {
       //Search Test
		WebElement lupa = driver.findElement(By.xpath("//*[@id=\"HeaderRow\"]/div[4]/div/div[1]/form/button/span"));
		WebElement searchBox = driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/div[4]/div/div[1]/form/input[1]"));
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
	    searchBox.sendKeys(Constants.Cautare1);
	    Thread.sleep(1000);
	    lupa.click();
	    js.executeScript("scrollBy(400,400)");
	    Thread.sleep(1500);
	    js.executeScript("scrollBy(-400,-400)");
	    Thread.sleep(3000);
	    WebElement search2 = driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/div[4]/div/div[1]/form/input[1]"));
	    search2.clear();
	    Thread.sleep(2500);
	     
	    search2.sendKeys(Constants.Cautare2);
	    Thread.sleep(1000);
	    WebElement lupa2 = driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/div[4]/div/div[1]/form/button"));
	    lupa2.click();
	    js.executeScript("scrollBy(400,400)");
	    Thread.sleep(1500);
	    js.executeScript("scrollBy(-400,-400)");
	    Thread.sleep(3000);
	    WebElement search3 = driver.findElement(By.xpath("//*[@id=\"HeaderRow\"]/div[4]/div/div[1]/form/input[1]"));
	    search3.clear();
	    Thread.sleep(2500); 
	    
	    search3.sendKeys(Constants.Cautare3);
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(400,400)");
	    Thread.sleep(1500);
	    js.executeScript("scrollBy(-400,-400)");
	    Thread.sleep(3000);
	    WebElement lupa3 = driver.findElement(By.xpath("//*[@id=\"HeaderRow\"]/div[4]/div/div[1]/form/button/span"));
	    lupa3.click();
	    WebElement search4 = driver.findElement(By.xpath("//*[@id=\"HeaderRow\"]/div[4]/div/div[1]/form/input[1]"));
	    search4.clear();
	    Thread.sleep(2500);
	     
	     
	    search4.sendKeys(Constants.Cautare4);
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(400,400)");
	    Thread.sleep(1500);
	    js.executeScript("scrollBy(-400,-400)");
	    Thread.sleep(3000);
	    WebElement lupa4 = driver.findElement(By.xpath("//*[@id=\"HeaderRow\"]/div[4]/div/div[1]/form/button/span"));
	    lupa4.click();
	     

   }
	
	@Test  
   public void Case3() throws InterruptedException {
	  //Filter Test
	    WebElement Carte_Straina = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/ul/ul/li[4]/a[1]"));
        Carte_Straina.click();	    
        Thread.sleep(2000);
        
        WebElement engleza = driver.findElement(By.xpath("//*[@id=\"CategoryUUIDLevelMulti_id\"]/li[1]/a"));
        engleza.click();
        Thread.sleep(2000);
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(500,500)");
	    Thread.sleep(3000);
	    
	    WebElement Selectare_Pret = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[1]/div/div/div[3]/ul/li[3]/a"));
        Selectare_Pret.click();
        Thread.sleep(3000);
        js.executeScript("scrollBy(400,400)");
   }
	
	@Test 
	public void Case4() throws InterruptedException {
		  //Sorting Test
		WebElement Electro_IT = driver.findElement(By.xpath("//*[@id=\"mobileCat-Electro\"]/a[1]"));
	    Electro_IT.click();	    
	    Thread.sleep(3500);
	        
	    WebElement sortare =  driver.findElement(By.xpath("//*[@id=\"SortingAttribute\"]"));
	    sortare.click();
	    Thread.sleep(2000);
	       
	    WebElement optiune = driver.findElement(By.xpath("//*[@id=\"SortingAttribute\"]/option[4]"));
        optiune.click();            
	        
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		 
		for(int i = 0; i<10; i++) {
		    js.executeScript("scrollBy(250,250)");
			Thread.sleep(400);
		    }  
	   }
	
	@Test  
	public void Case5() throws InterruptedException {
		  //Add to cart
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement parfumuri = driver.findElement(By.xpath("//*[@id=\"mobileCat-Parfumuri\"]/a[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(parfumuri).perform();
	    Thread.sleep(2000);
	        
	    WebElement parfumuripb = driver.findElement(By.xpath("//*[@id=\"mobileCat-Parfumuri\"]/li[5]/a[1]/strong"));
	    parfumuripb.click();
	    Thread.sleep(1500);
	    js.executeScript("scrollBy(300,300)");
	    Thread.sleep(1500);
	    WebElement parfumV = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div[1]/div[2]/div[5]/div[1]/div[4]/div/div/div[2]/a[3]/h2"));
	    parfumV.click();
	    Thread.sleep(1500);
	             
		js.executeScript("scrollBy(250,250)");
		Thread.sleep(500);
		WebElement adauga = driver.findElement(By.xpath("/html/body/div[2]/div/div[10]/div[1]/div[4]/div/div[3]/div[2]/form/div/div[3]/button"));
		adauga.click();
		Thread.sleep(9000);
		WebElement vizualizare = driver.findElement(By.xpath("//*[@id=\"miniCart\"]/div[3]/a"));
		vizualizare.click();
		Thread.sleep(1500);
	   }
}