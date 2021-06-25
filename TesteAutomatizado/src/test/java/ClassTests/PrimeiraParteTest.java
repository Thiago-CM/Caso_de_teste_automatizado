package ClassTests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraParteTest {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {

		driver.close();

	}

	@Test
	public void test() {
		// @Given("que navego para a página de busca do banco de questões")
		driver.get("https://opentdb.com/");
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/section/div/div/div/a[1]")).click();
		assertTrue("verificar o aceso a pagina", driver.getTitle()
				.contentEquals("Open Trivia DB: Free to use, user-contributed trivia question database."));

		// @And("digito 'Science: Computers' no campo de busca")
		WebElement textBox = driver.findElement(By.id("query"));
		textBox.sendKeys("Science: Computers");

		// @When("clico no botão de buscar")
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button")).click();

		// @Then("visualizo uma mensagem de erro com o texto 'No questions found.'")
		WebElement result = driver.findElement(By.className("alert-danger"));
		assertTrue("Retorno da pesquisa", result.getText().contentEquals("No questions found."));

	}

}
