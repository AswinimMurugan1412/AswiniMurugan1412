package test;

import java.util.ArrayList;
import test.api.Response;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		ArrayList<Response> arrResponse = new ArrayList<>();
		Response response = new Response();
		response.setName("Ranjith");
		response.setId(1);
		
		Response response1 = new Response(2, "Guru");
		
		arrResponse.add(response);
		arrResponse.add(response1);
		arrResponse.add(new Response(3, "somu"));
		arrResponse.add(1, new Response(5,"Aswini" ));
		
		arrResponse.forEach(res -> {
			System.out.println("id : "+res.getId()+"  name: "+res.getName());
		});
		
	}

}
