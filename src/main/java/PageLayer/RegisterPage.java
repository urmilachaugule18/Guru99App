package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{

	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="phone")
	private WebElement Phone ;
	
	@FindBy(name="userName")
	private WebElement email ;
	
	@FindBy(name="address1")
	private WebElement addr;
	
	@FindBy(name="city")
	private WebElement City ;
	
	@FindBy(name="state")
	private WebElement State;
	
	@FindBy(name="postalCode")
	private WebElement pincode;
	
	@FindBy(name="country")
	private WebElement Country;
	
	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(name="confirmPassword")
	private WebElement cpassword;
	
	@FindBy(name="submit")
	private WebElement SubmitBtn;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void contactInfoFunctionality(String Fname,String Lname,String phone,String Email)
	{
		sendKey(fname,Fname );
		sendKey(lname, Lname);
		sendKey(Phone, phone);
		sendKey(email, Email);
		
	}
	
	public void mailingFunctionality(String Addr,String Cty,String state,String Pin,String Cntry)
	{
		sendKey(addr,Addr);
		sendKey(City,Cty);
		sendKey(State,state);
		sendKey(pincode, Pin);
		selectByText(Country, Cntry);
	}
	
	public void userInfoFunctionality(String uname,String pass,String cpass)
	{
		sendKey(Email, uname);
		sendKey(Password, pass);
		sendKey(cpassword, cpass);
		click(SubmitBtn);
	}
}
