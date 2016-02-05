import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*This is a Browser Class*/
public class browser {

	public static void main(String[] args)
	
	{
		
		WebDriver dr=new FirefoxDriver();
		dr.get("www.google.com");
		dr.manage().window().maximize();
		
	}

}
