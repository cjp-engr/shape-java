public class Triangle implements Shape{
	
/* 	s=(a+b+c)/2
	area = sqrt(s(s-a)(s-b)(s-c)) */
	
	private int sideA = TestShape.VAL_1;
	private int sideB = TestShape.VAL_2;
	private int sideC = TestShape.VAL_3;
	
	
	public double getPerimeter(){
		return (double)(sideA + sideB + sideC);
	}
	
	public double getArea(){
		
		return (double)(Math.sqrt(((sideA + sideB + sideC) / 2)*
						(((sideA + sideB + sideC) / 2) - sideA)*
						(((sideA + sideB + sideC) / 2) - sideB)*
						(((sideA + sideB + sideC) / 2) - sideC)));
	}
	
	public void getDetails(){
		System.out.printf("Type : Triangle\n"
				+"Sides: %d, %d, %d \n"
				+"Perimeter: %5.1f \n"
				+"Area:  %5.1f \n", this.sideA, this.sideB, this.sideC, getPerimeter(), getArea());
	}
	
}