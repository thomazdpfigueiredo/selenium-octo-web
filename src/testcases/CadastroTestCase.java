package testcases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import tasks.CadastroTask;

public class CadastroTestCase {
	
	private WebDriver driver;
	private CadastroTask cadastro;
	
	@Before
	public void inicio() {
		System.setProperty("webdriver.gecko.drive", "geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.get("https://www.havan.com.br/customer/account/create/");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);		
	}
	
	// São 4 testes, sendo os dois primeiros (testOne,testTwo) feitos pra ver se todos 
	// os campos estão funcionais. Os outros dois testes (testThree,testFour) para ver
	// quais erros ao colocar número/símbolos nos campos.
	
	//testOne e testThree são para os perfis de Pessoa Física;
	//testeTwo e testFour são para os perfis de Pessoa Jurídica;
	
	@Test
	public void testOne()throws InterruptedException {
		Thread.sleep(2000);
		this.cadastro.preencherNome("Teste");
		this.cadastro.preencherSobrenome("Testando");
		this.cadastro.preencherNewsletter();
		this.cadastro.preencherPessoaFisica();
		this.cadastro.preencherCpfCnpj("99999999999"); //11 Dígitos
		this.cadastro.preencherEmail("testOne@gmail.com");
		this.cadastro.preencherSenha("aA@123$%");
		this.cadastro.preencherConfSenha("aA@123$%");
		
//		this.cadastro.enviarFormulario();
				
		Thread.sleep(6000);
		this.driver.quit();
	}
	
	@Test
	public void testTwo()throws InterruptedException {
		Thread.sleep(2000);
		this.cadastro.preencherNome("Teste");
		this.cadastro.preencherSobrenome("Testando");
		this.cadastro.preencherNewsletter();
		this.cadastro.preencherPessoaJuridica();
		this.cadastro.preencherRazao("Teste123");
		this.cadastro.preencherComercial("Testando123");
		this.cadastro.preencherInscricao("9999999999"); //10 Dígitos
		this.cadastro.preencherCpfCnpj("99999999999999"); //13 Dígitos
		this.cadastro.preencherIsento();
		this.cadastro.preencherEmail("testOne@gmail.com");
		this.cadastro.preencherSenha("aA@123$%");
		this.cadastro.preencherConfSenha("aA@123$%");
		
//		this.cadastro.enviarFormulario();
				
		Thread.sleep(6000);
		this.driver.quit();
	}	
	
	@Test
	public void testThree()throws InterruptedException {
		Thread.sleep(2000);
		this.cadastro.preencherNome("12345");
		this.cadastro.preencherSobrenome("67890");
		this.cadastro.preencherNewsletter();
		this.cadastro.preencherPessoaFisica();
		this.cadastro.preencherCpfCnpj("12345"); //11 Dígitos
		this.cadastro.preencherEmail("@.com");
		this.cadastro.preencherSenha("aA@123$%");
		this.cadastro.preencherConfSenha("aA@123$%");
		
//		this.cadastro.enviarFormulario();
				
		Thread.sleep(6000);
		this.driver.quit();
	}
	
	@Test
	public void testFour()throws InterruptedException {
		Thread.sleep(2000);
		this.cadastro.preencherNome("12345");
		this.cadastro.preencherSobrenome("67890");
		this.cadastro.preencherNewsletter();
		this.cadastro.preencherPessoaJuridica();
		this.cadastro.preencherRazao("Teste123");
		this.cadastro.preencherComercial("Testando123");
		this.cadastro.preencherInscricao("12345"); //10 Dígitos
		this.cadastro.preencherCpfCnpj("123456"); //13 Dígitos
		this.cadastro.preencherIsento();
		this.cadastro.preencherEmail("@.com");
		this.cadastro.preencherSenha("aA@123$%");
		this.cadastro.preencherConfSenha("aA@123$%");
		
//		this.cadastro.enviarFormulario();
				
		Thread.sleep(6000);
		this.driver.quit();
	}

}