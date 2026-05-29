class Student{
	private int id;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
}
class Encpsulation{
	public static void main(String[] args){
		Student st = new Student();
		st.setId(30);
		System.out.print(st.getId());
	}
}