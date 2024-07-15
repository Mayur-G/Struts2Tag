import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

//localhost:8080/registerAction
public class RegisterAction extends ActionSupport{
	
	String message;
	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	String address;
	String selectedColor;
	List<String> colors;
	List<Product> products;
	
	public void initializeProducts()
	{
		products = new ArrayList<>();
		products.add(new Product(111, "mobile", 10000));
		products.add(new Product(222, "camera", 70000));
		products.add(new Product(333, "tv", 20000));
		products.add(new Product(444, "laptop", 30000));
		
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public String execute()
	{
		System.out.println("execute() method called");
		return "success";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String initializeFormFields()
	{
		initializeColors();
		initializeProducts();
		return "input";
	}
	
	public void initializeColors()
	{
		colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
	}
	
//	public void validate()
//	{
//		if(firstName.equals(""))
//		{
//			addFieldError("firstName", "First name is required ");
//		}
//		if(lastName.equals(""))
//		{
//			addFieldError("lastName", "Last name is required ");
//		}
//		if(gender==null)
//		{
//			addFieldError("gender", "Gender is required ");
//		}
//		if(age==null)
//		{
//			addFieldError("age", "Age is required ");
//		}
//		else if(age <=18)
//		{
//			addFieldError("age", "Age should be above 18 ");
//		}
//		if(email.equals(""))
//		{
//			addFieldError("email", "Email is required ");
//		}
//		
//	}
	
	
}
