import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*This is a Browser Class*/

test data
/** sudheere added this comment*/
public class browser {

	public static void main(String[] args)
	
	{
		
		WebDriver dr=new FirefoxDriver();
		dr.get("www.google.com");
		dr.manage().window().maximize();
		
	}

}
