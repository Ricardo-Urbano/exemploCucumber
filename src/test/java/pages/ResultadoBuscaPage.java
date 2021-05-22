package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage {

	WebDriver driver;
	final String PRODUTO_BUSCA = "//span[contains(text(),'Novo Apple iPhone 12 Pro Max (256 GB, Dourado)')]";
	final String PRECO_PRODUTO = "//span[@id='price_inside_buybox']";

	public ResultadoBuscaPage(WebDriver driver) {
			this.driver = driver;
		}

	public void clicarProduto() {
		driver.findElement(By.xpath(PRODUTO_BUSCA)).click();
	}
	
	
	public String retornaValorProduto() {
		return driver.findElement(By.xpath(PRECO_PRODUTO)).getText();
	}
}
