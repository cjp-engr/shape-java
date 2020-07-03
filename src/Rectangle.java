public class Rectangle implements Shape{
	
	private int length  = TestShape.VAL_1;
	private int width  = TestShape.VAL_2;
	
	public double getPerimeter(){
		return 2 * (double)(length + width);
	}
	
	public double getArea(){
			if(length > width){
				return (double)(length * width);
			}else{
				length = width + length;
				width = length - width;
				length = length - width;
				return (double)(length * width);
			}
	}
	
	public void getDetails(){
		System.out.printf("Type : Rectangle\n"
				+"Length: %d \n"
				+"Width: %d \n"
				+"Perimeter: %5.1f \n"
				+"Area:  %5.1f \n", this.length, this.width, getPerimeter(), getArea());
	}
}