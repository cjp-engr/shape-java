public class Square implements Shape{
	
	public int side = TestShape.VAL_1;
	
	public double getPerimeter(){
		return (double)(2 * side);
	}
	
	public double getArea(){
		return (double)(side * side);
	}
	
	public void getDetails(){
		System.out.printf("Type : Square\n"
				+"Side: %d \n"
				+"Perimeter: %5.1f \n"
				+"Area:  %5.1f \n", this.side, getPerimeter(), getArea());
	}
}