package J20_JSON;

import com.google.gson.Gson;

public class Json3 {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		gson.toJson(null);	//object -> Json
		gson.fromJson("", Object.class);	//Json -> object
	}

}
