package com.xworkz.collage.runner;

import com.xworkz.collage.things.CollageDetails;
import com.xworkz.collage.things.CollageOperation;

	public class CollageDetailsRunner {

		public static void main(String[] args) {

			
			com.xworkz.collage.things.CollageDetails details=new CollageDetails();
			
			details.setRoomNumber(204);
			details.setNoOfStudents(100);
			details.setTeacherName("Ashwini");
			details.setTotalstudents(150);
			details.setName("AGMR");
			
			CollageOperation operation=new CollageOperation();
			String collageDetailsOpration = operation.collageDetailsOpration(details);
			System.out.println("collageDetailsOpration : "+collageDetailsOpration);
		}
}
