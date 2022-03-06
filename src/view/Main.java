package view;

import javax.swing.JOptionPane;

import controller.RedesController; 

public class Main {
	 
	public static void main(String[] args) {

		RedesController reController = new RedesController();
		
		String os = reController.os();	
		System.out.println(os);
		
		 int option = 0 ;
		 do {
			 option = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Mostrar Adaptadores de rede com IPv4\n" +
		                                                                 "2 - Mostrar média de ping\n " +
					                                                     "3 - Sair"));
 switch(option) {
 case 1:
	    String IP = "ipconfig";
        reController.readProcess(IP);
        break;
        
 case 2 :	 
	 String Ping = "PING -4 -n 10 www.google.com.br";
      reController.readTraceRoute(Ping);
	  break;
	  
 case 3 :
	 System.out.println("\n Encerado"); 
	 
 break;
 
 }
 
} while (option != 3);
	}
		}