public class TestShape{
	
	public static int VAL_1;
	public static int VAL_2;
	public static int VAL_3;
	private static int flag = 0;
	public static int[] copyArr;
	
	public static void main(String[] args){
		
			try{
			if(args.length <= 0){
				throw (new IllegalArgumentException("Invalid input"));
				}
			}catch(IllegalArgumentException iae){
				System.out.println(iae.getMessage());
				flag = 1;
			}
		
		copyArr = new int[args.length];
		
		for(int i = 0; i < args.length; i++){
			
			try{
				copyArr[i] = Integer.parseInt(args[i]);
				
				if(copyArr[i] < 0 || args.length > 3 || args.length <= 0 || args[0].equals(null)){
					throw (new IllegalArgumentException("Invalid input"));
				}
				}catch(NumberFormatException e){
					System.out.println("Invalid input");
					flag = 1;
					break;
				}catch(IllegalArgumentException iae){
					System.out.println(iae.getMessage());
					flag = 1;
					break;
				}
			
	}
		
		if(flag == 0){
			if(copyArr.length == 1 && args.length > 0){
				//circle
			VAL_1 = copyArr[0];
			Circle ci = new Circle();
			ci.getDetails();
				
			}else if(args.length == 2 && !(args[0].equals(args[1]))){
				//rectangle
				if(VAL_1 > VAL_2){
						VAL_1 = copyArr[0];
						VAL_2 = copyArr[1];
					}else{
						VAL_2 = copyArr[0];
						VAL_1 = copyArr[1];
					}
					Rectangle re = new Rectangle();
					re.getDetails();
					
			}else if(args.length == 2 && args[0].equals(args[1])){
				//square
				VAL_1 = copyArr[0];
				Square sq = new Square();
				sq.getDetails();
		
			}else{
				//triangle
				VAL_1 = copyArr[0];
				VAL_2 = copyArr[1];
				VAL_3 = copyArr[2];
				Triangle tr = new Triangle();
				tr.getDetails();

			}
			
		}

	}
}