package com.posh.deployable;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PoshService {
	static PoshDao pd = new PoshDao();
	public static void main(String[] args) {
		selectService();
		System.out.println("IM running");
	}

	public static void updateService() {
     List<String> ls = new ArrayList<>();
     
     ls = pd.update();
     
	}

	public static void selectService() {

		List<String> ls = new ArrayList<String>();
	
		try {
			ls = pd.select();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String sg : ls) {
			System.out.println(sg);
		}

	}

}
