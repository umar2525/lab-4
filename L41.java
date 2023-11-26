import java.util.Scanner;
public class L41{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
			System.out.println("Enter Starting year ");
		int sy = s.nextInt();
		System.out.println("Enter ending year ");
		int ey = s.nextInt();
		  if(sy <= 1000){
			  System.out.println("Starting year must be greater then 1000 ");
		  }else if(sy > ey){
			  System.out.println("Ending year must be greater then Starting year");
		  }else{
			  for (int i = sy ; sy <= ey ; i++){
				  if (i%4==0){
					  System.out.println("LEAP YEAR : " + i);
				  }
			  }
			  
		  }
		
	}
	
}
