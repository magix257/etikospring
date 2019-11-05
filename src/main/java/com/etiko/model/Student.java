package com.etiko.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	


	
		@Id
		private int rollno;
	
		
		
		public int getRollno() {
			return rollno;
		}

		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private int marks;
		private String name;
		
		public Student() {}
		
		public Student(int rollno, int marks, String name) {
			super();
			this.rollno = rollno;
			this.marks = marks;
			this.name = name;
		}
	
	
}
