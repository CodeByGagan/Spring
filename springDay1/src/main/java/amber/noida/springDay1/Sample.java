package amber.noida.springDay1;

public class Sample {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
//	For example, to force Spring to produce a new bean instance each time one is needed, 
//	you should declare the bean's scope attribute to be prototype. 
//	Similarly, if you want Spring to return the same bean instance each time one is needed,
//	you should declare the bean's scope attribute to be singleton.
}
