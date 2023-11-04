package test.api;

public class Response {
	
	int id;
	String name;
	
	public Response()
	{
//		Default
	}

	public Response(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
