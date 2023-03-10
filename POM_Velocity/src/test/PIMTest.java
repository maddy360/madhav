package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest extends CommonTest {

	@Test(priority = 3, groups = { "smoke", "regression" })
	public void verifyPimPageTitle() {
		pimPage.clicknPimPageLink();
		String verifyTitleOfPim = pimPage.getPimPageTitle();
		Assert.assertEquals(verifyTitleOfPim, "PIM");
	}

	@Test(priority = 4, groups = { "smoke", "regression" })
	public void verifyEmpSearchEmpId() {
		pimPage.setPimPageEmpId("0066");
		pimPage.clickSearchBtn();
		String verifyEmpIdAppeared = pimPage.getEmpIdFromSearchedResults("0066");
		Assert.assertEquals(verifyEmpIdAppeared, "0066");
	}
	
	@Test(priority = 5, groups = { "smoke", "regression" })
	public void verify1() {
	//	pimPage.setPimPageEmpId("0066");
	//	pimPage.clickSearchBtn();
	//	String verifyEmpIdAppeared = pimPage.getEmpIdFromSearchedResults("0066");
		Assert.assertEquals(true, true);
	}
	
	@Test(priority = 5, groups = { "smoke", "regression" })
	public void TestingGIT() {
		Assert.assertEquals(true, true);
	}
}
