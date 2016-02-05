package RDspa.Suite_One;
import RDspa.Utility.*;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import com.stta.utility.Read_XLS;
//import com.stta.utility.SuiteUtility;

//SuiteOneCaseOne Class Inherits From SuiteOneBase Class.
//So, SuiteOneCaseOne Class Is Child Class Of SuiteOneBase Class And SuiteBase Class.
@Test
public class Suite_OneCaseOne extends Suite_OneBase{
	Read_XLS FilePath = null;	
	String TestCaseName = null;	
	
	@BeforeTest
	public void checkCaseToRun() throws IOException{
		//Called init() function from SuiteBase class to Initialize .xls Files
		init();	
		FilePath = TestCaseListExcelOne;
		System.out.println("FilePath Is : "+FilePath);
		TestCaseName = this.getClass().getSimpleName();	
		System.out.println("TestCaseName Is : "+TestCaseName);
	}
	
	//Accepts 4 column's String data In every Iteration.
	public void Suite_OneCaseOneTest(String DataCol1,String DataCol2,String DataCol3,String ExpectedResult){
		System.out.println("Value Of DataCol1 = "+DataCol1);
		System.out.println("Value Of DataCol2 = "+DataCol2);
		System.out.println("Value Of DataCol3 = "+DataCol3);
		System.out.println("Value Of ExpectedResult = "+ExpectedResult);		
	}	
	
	//This data provider method will return 4 column's data one by one In every Iteration.
	@DataProvider
	public Object[][] Suite_OneCaseOneData(){
		//To retrieve data from Data 1 Column,Data 2 Column,Data 3 Column and Expected Result column of SuiteOneCaseOne data Sheet.
		//Last two columns (DataToRun and Pass/Fail/Skip) are Ignored programatically when reading test data.
		return Suite_Utility.GetTestDataUtility(FilePath, TestCaseName);
	}
}
