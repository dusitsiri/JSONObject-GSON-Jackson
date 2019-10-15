package g.testjson.convert;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		// 1
//		JSONObject jo = new JSONObject();
//		jo.put("name", "jon doe");
//		jo.put("age", "22");
//		jo.put("city", "chicago");
//		System.out.println(jo);

		// 2
//		Map<String, String> map = new HashMap();
//		map.put("name", "jon doe");
//		map.put("age", "22");
//		map.put("city", "chicago");
//		JSONObject jo = new JSONObject(map);
//		System.out.println(jo);

		// 3
//		JSONArray ja = new JSONArray();
//		ja.put(Boolean.TRUE);
//		ja.put("lorem ipsum");
//		
//		JSONObject jo = new JSONObject();
//		jo.put("name", "jon doe");
//		jo.put("age", "22");
//		jo.put("city", "chicago");
//
//		ja.put(jo);

//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		JsonElement jsonElement =  new JsonParser().parse(jo.toString());
//		System.out.println(gson.toJson(jsonElement));

		// 4
//		JSONObject jo = new JSONObject("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}");
//		JSONArray ja = new JSONArray("[true, \"lorem ipsum\", 215]");

		// 5
////	net.sf.json
//		JSONObject jo = JSONObject.fromObject(json);	
//		
////	org.json
//		JSONObject jo = new JSONObject(json);	
//		
////	com.google.gson
//		JsonObject jo = new Gson().fromJson(json, JsonObject.class);
//		JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();	

		//6
//		JSONArray pets = new JSONArray();
//		pets.put("cat");
//		pets.put("dog");
//		
//		JSONObject person = new JSONObject();
//		person.put("name", "John Brown");
//		person.put("age", 35);
//		person.put("pets", pets);
//		
//		System.out.println(person);
//		JSONArray animals = person.getJSONArray("pets");
//		for (int i = 0; i < animals.length(); i++) {
//			String pet = pets.getString(i);
////			System.out.println(pet);
//		}
////		System.out.println(person.get("name"));
		
	}

}
