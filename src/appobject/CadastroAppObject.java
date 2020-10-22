package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
	private WebDriver driver;
	
	public CadastroAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNomeTextField() {
		return this.driver.findElement(By.id("firstname"));
	}
	
	public WebElement getSobrenomeTextField() {
		return this.driver.findElement(By.id("lastname"));
	}
	
	public WebElement getNewsButton() {
		return this.driver.findElement(By.id("is_subscribed"));
	}
	
	public WebElement getPessoaComboBox() {
		return this.driver.findElement(By.id("person_type"));
	}
	
	public WebElement getRazaoTextField() {
		return this.driver.findElement(By.id("social_name"));
	}
	
	public WebElement getComercialTextField() {
		return this.driver.findElement(By.id("business_name"));
	}
	
	public WebElement getInscricaoTextField() {
		return this.driver.findElement(By.id("state_registration"));
	}
	
	public WebElement getIsentoButton() {
		return this.driver.findElement(By.id("state_registration_acquit"));
	}
		
	public WebElement getCpfCnpjTextField() {
		return this.driver.findElement(By.id("taxvat"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("email_address"));
	}	
	
	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.id("password"));
	}	
	
	public WebElement getConfSenhaTextField() {
		return this.driver.findElement(By.id("password-confirmation"));
	}
	
	public WebElement getCriarButton() {
		return this.driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div[1]/button"));
	}
	
	
	
	
}