abstract class Shape{
	final int b = 20;
	public void display(){
		System.out.println("This is display method originally in Shape class");
	}
	abstract public void calculateArea();
}