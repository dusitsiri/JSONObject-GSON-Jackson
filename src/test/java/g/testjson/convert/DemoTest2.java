package g.testjson.convert;

import static org.junit.Assert.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DemoTest2 {

	Demo demo = new Demo();

	// JSONArray and JSONObject
	@Test
	public void creatingJsonString_Test() {
		JSONArray jsonArray = new JSONArray();
		jsonArray.put("cat");
		jsonArray.put("dog");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "John Brown");
		jsonObject.put("age", 35);
		jsonObject.put("pets", jsonArray);
		demo.setJsonObject(jsonObject);
		assertEquals("{\"pets\":[\"cat\",\"dog\"],\"name\":\"John Brown\",\"age\":35}",
				demo.getJsonObject().toString());
	}

	// GSON getObject
	@Test
	public void gsonObjectFrom_Test() {
		String json = "{ \"name\": \"Baeldung\", \"java\": true }";
		demo.setGsonObject(new JsonParser().parse(json).getAsJsonObject());
		assertEquals("{\"name\":\"Baeldung\",\"java\":true}", demo.getGsonObject().toString());
	}

	// New JSONObject 
	@Test
	public void New_JSONObject_Test() {
		demo.setJsonObject(new JSONObject("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}"));
		assertEquals("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}", demo.getJsonObject().toString());
	}	
	
	// New JSONArray
	@Test
	public void New_JSONArray_Test() {
		demo.setJsonArray(new JSONArray("[true, \"lorem ipsum\", 215]"));
		assertEquals("[true, \"lorem ipsum\", 215]", demo.getJsonArray().toString());
	}

}
