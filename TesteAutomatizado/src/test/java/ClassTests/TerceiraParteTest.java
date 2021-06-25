package ClassTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TerceiraParteTest {

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
	// Given navego para a pagina inicial
		driver.get("https://opentdb.com/");
		assertTrue("verificar o aceso a pagina", driver.getTitle()
				.contentEquals("Open Trivia DB: Free to use, user-contributed trivia question database."));
		
		//When clico no botão add new questions
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/section/div/div/div/a[2]")).click();
		
		//Then visualizo a mensagem de erro 'ERROR! You must be logged in to submit a trivia question.'
		WebElement result = driver.findElement(By.className("alert-danger"));
		assertTrue("Retorno da pesquisa", result.getText().contentEquals("ERROR! You must be logged in to submit a trivia question."));

	}

}
