package view;

import controller.RedesController; 

public class Main {
	 
	public static void main(String[] args) {

		RedesController reController = new RedesController();
		
		String os = reController.os();	
		System.out.println(os);
		
	
	     String process = "PING -4 -n 10 www.google.com.br";
		 reController.readProcess(process);
	

		// String process = "tracert www.fateczl.edu.br";
//			pCont.readTraceRoute(process);

}
}
int i = 0;
