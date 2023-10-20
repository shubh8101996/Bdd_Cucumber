package runnwe;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	@Test
	public void test() throws MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/");

		List<WebElement> list = driver.findElements(By.xpath("//a"));

		for (WebElement webElement : list) {

			String url = webElement.getAttribute("href");

			HttpURLConnection htp = (HttpURLConnection) new URL(url).openConnection();

			htp.connect();

			if (htp.getResponseCode() >= 400) {

				System.out.println(url + "Link is Broken: ");

			}

		}

	}

	@Test
	public void comp() {

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2); // false, as they are different objects in memory
		System.out.println(str1.equals(str2));

	}

	@Test
	public void revString() {

		String s1="a";
		String s2=new String("a");
		String s3="a";
		String s4=new String("a");
		
		System.out.println(s1.hashCode()+  "  "  +s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s4);
	}

}
