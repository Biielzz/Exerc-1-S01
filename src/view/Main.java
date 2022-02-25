package view;

import controller.RedesController; 

public class Main {
	 
	public static void main(String[] args) {

		RedesController reController = new RedesController();
		String os = reController.os();
		
		System.out.println(os);
	}
		
		
	}


