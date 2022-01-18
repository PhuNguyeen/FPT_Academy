/**
* 
*	author: KEN
*	date   Jan 18, 2022
*	Lab/Assignment
*
*/
package fa.training.entities;

public abstract  class Teacher {
	private String designation;
	private String collegeName;

	public Teacher() {

	}

	public Teacher(String designation, String collegeName) {
		super();
		this.designation = designation;
		this.collegeName = collegeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public abstract void teach();

	public void teach(int duration) {
		System.out.println("Teaching in " + duration + " minutes");
	}
}
