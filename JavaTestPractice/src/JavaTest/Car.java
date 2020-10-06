package JavaTest;

public class Car {
	
	
	
	public Car() {
		
		System.out.println("This is the Constructor without arguments");
	}
	
	public Car(String color , String model) {
		System.out.println("This is the Constructor with arguments");
		this.color=color;
		this.model=model;
		System.out.println("Printing color and model" + "Color :"+this.color+ " and Model :"+this.model);
	}
	

	private String color;

	public int year;
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		
		if (year>1860)
		{
		this.year = year;
		}
		else {
			System.out.println("Dont Play with Years Settings: Put Greater that 1860");
		}
	}

	public void setColor(String color) {

		this.color = color;
	}

	public String getColor() {
		return color;

	}
	

	public static void increaseSpeed() {

		System.out.println("This method is define to learn class concept");
	}


	
}
