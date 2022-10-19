package LabSheet10.exercise1;

//TestInterface.java
/*A driver program that tests the functionality of the Student, UnderGraduate and
PostGraduate classes as well as the Person interface*/

import java.util.*;

public class TestInterface {
     public static void main(String args[]) {

		 UnderGraduate u1 = new UnderGraduate();
		 UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);

		 PostGraduate p1 = new PostGraduate();
		 PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");


		 PermanentLecturer pL1 = new PermanentLecturer("Thomas Aquinas","Dublin",
				new GregorianCalendar(1984,12,31),"52673",
				new String[]{"Economics 101", "Media Presentation", "Political Debate"},
				new GregorianCalendar(2003,6,23),
				"Lots and lots of Pension Entitlements :-)","Full-time Professorship");

		 PermanentLecturer pL2 = new PermanentLecturer("Uncle Bob Martin","Philadelpia, USA",
			 new GregorianCalendar(1952,4,19),"t0044356",
			 new String[]{"Agile Methods", "OO Analysis & Design", "Design Patterns"},
			 new GregorianCalendar(1986,3,18),
			 "Oodles of Pension Entitlements :-)","Part-time Senior Research Fellow");

		 TemporaryLecturer tL1 = new TemporaryLecturer("Richard O' Neill","Tallaght, Dublin",
				 new GregorianCalendar(1985,3,4),"3536278b",
				 new String[]{"Applied Biology", "Microbiology"},new GregorianCalendar(2018,4,15),
				 762);

		 TemporaryLecturer tL2 = new TemporaryLecturer("Mary McKenzie","Bundoran, Donegal",
				 new GregorianCalendar(1971,6,13),"647382",
				 new String[]{"Fractal Geometry", "Tensors"},new GregorianCalendar(2016,3,8),
				 1342);

		 Person[] people = new Person[]{u1,u2,p1,p2,pL1,pL2,tL1,tL2};


		 System.out.println("""
			Testing the functionality of PermanentLecturer and TemporaryLecturer, as well as UnderGraduate and
			PostGraduate, by displaying object state of all four concrete classes polymorphically, using
			a loop and the interface Person as a reference
			""");

		 for (Person person : people) {
			 System.out.println(person + "\n");
		 }



	 	}
}