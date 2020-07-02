public class UC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int IS_PRESENT=1;
		

		for(int i=0;i<=5;i++){									
			int randomCheck=(int) Math.floor((Math.random()*10)%2);		
			System.out.println(randomCheck);
			
			if(IS_PRESENT==randomCheck){
				System.out.println("Employee Is Present");
			}else{
				System.out.println("Employee Is Absent");
			}
		}		
	}

}
