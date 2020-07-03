public class Circle implements Shape{
	
	private final double PI = Math.PI;
	private int radius  = TestShape.VAL_1;
	
	public double getPerimeter(){
		return (double)(2 * PI * radius);
	}
	
	public double getArea(){
		return (double)(PI * radius * radius);
	}
	
	public void getDetails(){
				
		System.out.printf("Type : Circle\n"
				+"Radius: %d \n"
				+"Perimeter: %5.1f \n"
				+"Area:  %5.1f \n", this.radius, getPerimeter(), getArea());

	}
}