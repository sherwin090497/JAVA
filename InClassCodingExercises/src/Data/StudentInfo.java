package Data;

public class StudentInfo{

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
	public StudentInfo(String name, int REDID){
		
	}
	
	
	@Override
	public String toString(){
		
		StringBuilder str = new StringBuilder(); 
		str.append("{");
		str.append("Name: "+this.name+" REDID: "+this.REDID);
		str.append("}");
		return str.toString();
	}
	
}
