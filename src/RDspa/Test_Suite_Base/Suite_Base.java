package RDspa.Test_Suite_Base;
import RDspa.Utility.*;
import java.io.IOException;
//import com.stta.utility.Read_XLS;

public class Suite_Base 
{	
	public static Read_XLS TestSuiteListExcel=null;
	public static Read_XLS TestCaseListExcelOne=null;
	public static Read_XLS TestCaseListExcelTwo=null;
	
	public void init() throws IOException
	{
		//Please change file's path strings bellow If you have stored them at location other than bellow.
		//Initializing Test Suite List(TestSuiteList.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir")+"\\src\\RDspa\\Excel_Files\\TestSuiteList.xls");
		//TestSuiteListExcel = new Read_XLS(System.getProperty("user.dir")+"\\src\\RDspa\\Excel_Files\\TestSuiteList.xls");
		//Initializing Test Suite One(SuiteOne.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelOne = new Read_XLS(System.getProperty("user.dir")+"\\src\\RDspa\\Excel_Files\\Suite_One.xls");
		//Initializing Test Suite Two(SuiteTwo.xls) File Path Using Constructor Of Read_XLS Utility Class.
		TestCaseListExcelTwo = new Read_XLS(System.getProperty("user.dir")+"\\src\\RDspa\\Excel_Files\\Suite_Two.xls");																			
	}	
}
