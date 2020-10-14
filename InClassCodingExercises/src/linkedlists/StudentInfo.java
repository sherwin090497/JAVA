package linkedlists;

public class StudentInfo implements Comparable<StudentInfo>{

	private String name;
	private int REDID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getREDID() {
		return REDID;
	}
	public void setREDID(int rEDID) {
		REDID = rEDID;
	}
	
	@Override
	public int compareTo(StudentInfo s)
	{
		return this.REDID - s.REDID;
	}
	
	@Override
	public String toString(){
		
		StringBuilder str = new StringBuilder(); 
		str.append("\n{");
		str.append("Name: "+this.name+" REDID: "+this.REDID);
		str.append("}");
		return str.toString();
	}
	
}
