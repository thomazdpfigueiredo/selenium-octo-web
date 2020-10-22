package tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import appobject.CadastroAppObject;

public class CadastroTask {
	private CadastroAppObject cadastroappobject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroappobject = new CadastroAppObject(driver);
	}
	
	public void preencherNome(String nome) {		
		this.cadastroappobject.getNomeTextField().sendKeys(nome);		
	}
	
	public void preencherSobrenome(String sobrenome) {		
		this.cadastroappobject.getSobrenomeTextField().sendKeys(sobrenome);		
	}
	
	public void preencherNewsletter(){		
		this.cadastroappobject.getNewsButton().click();			
	}
	
	public void preencherPessoaFisica() {
		this.cadastroappobject.getPessoaComboBox().sendKeys(Keys.ENTER);
	}
	
	public void preencherPessoaJuridica() {
		this.cadastroappobject.getPessoaComboBox().sendKeys(Keys.ARROW_DOWN);
		this.cadastroappobject.getPessoaComboBox().sendKeys(Keys.ENTER);
	}
	
	public void preencherRazao(String razao) {
		this.cadastroappobject.getRazaoTextField().sendKeys(razao);
	}
	
	public void preencherComercial(String comercial) {
		this.cadastroappobject.getComercialTextField().sendKeys(comercial);
	}
	
	public void preencherInscricao(String inscricao) {
		this.cadastroappobject.getInscricaoTextField().sendKeys(inscricao);
	}
	
	public void preencherIsento() {
		this.cadastroappobject.getIsentoButton().click();
	}
	
	public void preencherCpfCnpj(String cpfcnpj) {
		this.cadastroappobject.getCpfCnpjTextField().sendKeys(cpfcnpj);
	}
	
	public void preencherEmail(String email) {
		this.cadastroappobject.getEmailTextField().sendKeys(email);
	}
	
	public void preencherSenha(String senha) {
		this.cadastroappobject.getSenhaTextField().sendKeys(senha);
	}
	
	public void preencherConfSenha(String confsenha) {
		this.cadastroappobject.getConfSenhaTextField().sendKeys(confsenha);
	}	
	
	public void enviarFormulario() {
		this.cadastroappobject.getCriarButton().click();
	}
		
	
}

