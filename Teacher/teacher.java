package Teacher;

import CarCollection.Car;

public class teacher implements Comparable<teacher>{
	private String name;
	private int teacherID;
	private boolean sex;//true if male, false for female
	teacher(String name,int teacherID,boolean sex){
		this.name=name;
		this.teacherID=teacherID;
		this.sex=sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID=teacherID;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex=sex;
	}
	
/*
 * public int compareTo(Car that ) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id,that.id );
	}
 */
	@Override
	public int compareTo(teacher that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.teacherID, that.teacherID);
	}
	
}
