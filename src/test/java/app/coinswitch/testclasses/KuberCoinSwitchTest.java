package app.coinswitch.testclasses;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KuberCoinSwitchTest extends BaseTest {

	public KuberCoinSwitchTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * Test Element which are required to interact with App.
	 */

	@AndroidFindBy(accessibility = "Home Buy BTC Button")
	private AndroidElement BuyBtcBTN;

	@AndroidFindBy(accessibility = "Trade Input Value")
	private AndroidElement BTCScreen;

	@AndroidFindBy(accessibility = "Preview BUY Button")
	private AndroidElement PreviewBTN;

	@AndroidFindBy(accessibility = "Trade Preview Amount")
	private AndroidElement TradeAMT;

	@AndroidFindBy(accessibility = "buy now button")
	private AndroidElement BuyNowBTN;

	@AndroidFindBy(accessibility = "Unlock Wallet")
	private AndroidElement ContinueBTN;

	@AndroidFindBy(accessibility = "Key 1")
	private AndroidElement Key1;

	@AndroidFindBy(accessibility = "Key 0")
	private AndroidElement Key2;

	@AndroidFindBy(accessibility = "Key 0")
	private AndroidElement Key3;

	public AndroidElement waitforElementToClickable(AndroidElement ele) {
		return (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public AndroidElement waitforElementToVisible(AndroidElement ele) {
		return (AndroidElement) wait.until(ExpectedConditions.visibilityOf(ele));
	}

	/***
	 * TestMethod. Example of preview of buying BTC using Appium.
	 */

	@Test
	public void BuyBitCoinFlow() {
		waitforElementToClickable(BuyBtcBTN).click();
		waitforElementToVisible(BTCScreen);
		waitforElementToClickable(Key1).click();
		waitforElementToClickable(Key2).click();
		waitforElementToClickable(Key3).click();
		waitforElementToClickable(PreviewBTN).click();
		TradeAMT.isDisplayed();
		waitforElementToClickable(BuyNowBTN).click();
		waitforElementToClickable(ContinueBTN).click();
		System.out.println("Successfull");

	}

}
