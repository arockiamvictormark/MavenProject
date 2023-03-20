package test.adactin.data.driven;

import base.adactin.data.driven.Data_Driven_Base;

public class Data_Driven_Run extends Data_Driven_Base {
	
	public static void main(String[] args) throws Throwable {
		
		String login_data = login_data(1, 1);
		System.out.println("Login Data :"+login_data);
		
	}

}
