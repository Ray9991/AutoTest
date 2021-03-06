package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlTotalQuery;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskControlTotalQueryPage extends SuperPage implements IQuery{
	public RiskControlTotalQueryPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlTotalQuery");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlTotalQuery");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//用户号
	public void setUserName(String value) {
		du.what("UserName").clear();
		du.what("UserName").sendKeys(value);
	}
	public String getUserName() {
		return du.what("UserName").getAttribute("value");
	}
	//累计方式
	public void selectAccumulateWay(String value) {
		du.whatSelect("AccumulateWay").selectByValue(value);
	}
	//查询日期
	public void setQueryDate(String value) {
		du.what("QueryDate").sendKeys(Keys.CONTROL + "a");
		du.waitFor(500);
		du.what("QueryDate").sendKeys(value);
	}
	public String getQueryDate() {
		return du.what("QueryDate").getAttribute("value");
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}

}