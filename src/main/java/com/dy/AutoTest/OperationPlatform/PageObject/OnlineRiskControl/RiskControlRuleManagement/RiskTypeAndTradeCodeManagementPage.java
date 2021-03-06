package com.dy.AutoTest.OperationPlatform.PageObject.OnlineRiskControl.RiskControlRuleManagement;

import org.openqa.selenium.WebDriver;

import com.dy.AutoTest.web.api.IQuery;
import com.dy.AutoTest.web.api.SuperPage;
import com.dy.AutoTest.web.actions.DoPlus;

public class RiskTypeAndTradeCodeManagementPage extends SuperPage implements IQuery{
	public RiskTypeAndTradeCodeManagementPage(WebDriver driver) {
		super(driver);
		du.loadLocator("POP_Loc_RiskControlRuleManagement_RiskTypeAndTradeCodeManagement");
	}
	public void setWaitTime(long waitTime) {
		du=new DoPlus(driver);
		du.waitTime=waitTime;
		du.loadLocator("POP_Loc_RiskControlRuleManagement_RiskTypeAndTradeCodeManagement");
	}

/***************************Manual Coding**********************************/


/****************************Auto Generate******************************/

	//交易码
	public void setTradeCode(String value) {
		du.what("TradeCode").clear();
		du.what("TradeCode").sendKeys(value);
	}
	public String getTradeCode() {
		return du.what("TradeCode").getAttribute("value");
	}
	//风控类型
	/**
	 * @param value
	 * 
	 * 	value="CAP01" : CAP01-代收自银行卡
		value="PWM01" : PWM01-标准主账户充值限额检查
		value="PWM50" : PWM50-提现限额检查（通过身份证控制）
		value="RPM01" : RPM01-限额检查
		value="RPM02" : RPM02-收款方单笔限额控制
		value="RPM03" : RPM03-远程消费支付检查
		value="RPM04" : RPM04-商户退款日累计限额风险控制
		value="RPM10" : RPM10-限额检查
		value="RPM16" : RPM16-批量付款限额
		value="RPM98" : RPM98-UATTEST98
		value="RRC01" : RRC01-合规客户付款限额
		value="TAM01" : TAM01-付款方限额检查
		value="TAM02" : TAM02-收款方限额频次检查
		value="TAM03" : TAM03-收款方限额频次检查
		value="TAM10" : TAM10-商户代收限额检查
		value="TAM11" : TAM11-商户代付限额检查
	 * 
	 */
	public void selectRiskControlType(String value) {
		du.whatSelect("RiskControlType").selectByValue(value);
	}
	//模块名
	/**
	 * @param value
	 * 
	 * 	value='CGW' : CGW-网关模块
		value='PWM' : PWM-充提模块
		value='RPM' : RPM-远程
		value='CAP' : CAP-代收付
		value='TAM' : TAM-收付款
	 * 
	 */
	public void selectModuleName(String value) {
		du.whatSelect("ModuleName").selectByValue(value);
	}
	//查询
	public void clickQuery() {
		du.what("Query").click();
	}
	//重置
	public void clickReset() {
		du.what("Reset").click();
	}
	//添加
	public void clickAdd() {
		du.what("Add").click();
	}
	//修改
	public void clickUpdate() {
		du.what("Update").click();
	}
	//查看
	public void clickCheck() {
		du.what("Check").click();
	}
	//删除
	public void clickDelete() {
		du.what("Delete").click();
	}
	//交易码列表单选按钮
	public void clickRadio(String radio) {
		du.what("Radio",radio).click();
	}
	public boolean isRadioExist(String radio) {
		du.waitFor(500);
		return du.isElementExist("Radio",radio);
	}
	public boolean isRadioDisplayed(String radio) {
		du.waitFor(500);
		return du.what("Radio",radio).isDisplayed();
	}
	//添加_交易码
	public void setAdd_TradeCode(String value) {
		du.what("Add_TradeCode").clear();
		du.what("Add_TradeCode").sendKeys(value);
	}
	public String getAdd_TradeCode() {
		return du.what("Add_TradeCode").getAttribute("value");
	}
	//添加_交易名
	public void setAdd_TradeName(String value) {
		du.what("Add_TradeName").clear();
		du.what("Add_TradeName").sendKeys(value);
	}
	public String getAdd_TradeName() {
		return du.what("Add_TradeName").getAttribute("value");
	}
	//添加_风控交易子码
	public void setAdd_RiskControlTradeSubcode(String value) {
		du.what("Add_RiskControlTradeSubcode").clear();
		du.what("Add_RiskControlTradeSubcode").sendKeys(value);
	}
	public String getAdd_RiskControlTradeSubcode() {
		return du.what("Add_RiskControlTradeSubcode").getAttribute("value");
	}
	//添加_风控类型
	public void selectAdd_RiskControlType(String value) {
		du.whatSelect("Add_RiskControlType").selectByValue(value);
	}
	//添加_提交
	public void clickAdd_Submit() {
		du.what("Add_Submit").click();
	}
	//添加_关闭
	public void clickAdd_Close() {
		du.what("Add_Close").click();
	}
	//修改_交易名
	public void setUpdate_TradeName(String value) {
		du.what("Update_TradeName").clear();
		du.what("Update_TradeName").sendKeys(value);
	}
	public String getUpdate_TradeName() {
		return du.what("Update_TradeName").getAttribute("value");
	}
	//修改_提交
	public void clickUpdate_Submit() {
		du.what("Update_Submit").click();
	}
	//修改_关闭
	public void clickUpdate_Close() {
		du.what("Update_Close").click();
	}
	//查看_关闭
	public void clickCheck_Close() {
		du.what("Check_Close").click();
	}
	//删除_确认
	public void clickDelete_Confirm() {
		du.what("Delete_Confirm").click();
	}
	//删除_关闭
	public void clickDelete_Close() {
		du.what("Delete_Close").click();
	}
	//修改_风控类型
	public void selectUpdate_RiskControlType(String value) {
		du.whatSelect("Update_RiskControlType").selectByValue(value);
	}

}