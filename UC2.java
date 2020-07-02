public class UC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_PRESENT=1;
		int empRatePerHour=0;
		int empHours=0;
		int empSalary = 0;
		
		for(int i=0;i<=5;i++){
	
			int empStatus=(int)Math.floor((Math.random()*10)%2);
			
			if(IS_PRESENT==empStatus){
				empHours=20;
				empRatePerHour=8;
				empSalary=empHours*empRatePerHour;
				System.out.println("empStatus "+empStatus+"empSalary "+empSalary+"i "+i);
			}else{
				empSalary=0;
				System.out.println("empStatus "+empStatus+"empSalary "+empSalary+"i "+i);
			}
				
			
			
		}
		
	}

}
