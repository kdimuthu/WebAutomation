package tests;

import org.testng.annotations.Test;
import pages.SamplePage;
import utility.ExcelReader;
import utility.SeleniumTestBase;

public class Sample_Tests extends SeleniumTestBase {

   SamplePage SamplePage_;

    // Verify the SelfCare login page UI
    @Test(priority = 1, enabled = true)
    public void tc_VerifySelfCareLoginUI() {
        SamplePage_ = new SamplePage(driver);
        //Open the Self Care portal
        SamplePage_.bf_OpenApplication();
        //Login
        SamplePage_.bf_Login(ExcelReader.getData(0,1,0));
    }
}