package g.testjson.convert;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class OrgJSONTest extends TestCase {

	OrgJSON orgJSON;
	@BeforeEach
	public void setup() {
		orgJSON = new OrgJSON();
	}

	@Test
	public void Test_Input_JsonObject() {
		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");
		orgJSON.setJsonObject(jo);
		
		assertEquals(jo, orgJSON.getJsonObject());
	}
	
	@Test
	public void Test_Map_JsonObject() {
		Map<String, String> map = new HashMap();
		map.put("name", "jon doe");
		map.put("age", "22");
		map.put("city", "chicago");
		JSONObject jo = new JSONObject(map);
		orgJSON.setJsonObject(jo);
		
		assertEquals(jo, orgJSON.getJsonObject());
	}
	
	@Test
	public void creatingJsonString_Test() {
		JSONArray jsonArray = new JSONArray();
		jsonArray.put("cat");
		jsonArray.put("dog");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "John Brown");
		jsonObject.put("age", 35);
		jsonObject.put("pets", jsonArray);
		orgJSON.setJsonObject(jsonObject);
		
		assertEquals(jsonObject, orgJSON.getJsonObject());
	}
	
	@Test
	public void Test_Init_JsonObject() {
		JSONObject jo = new JSONObject("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}");
		orgJSON.setJsonObject(jo);
		
		assertEquals("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}", orgJSON.getJsonObject().toString());
	}
	
	@Test
	public void Test_Init_JsonArray() {
		JSONArray ja = new JSONArray("[true, \"lorem ipsum\", 215]");
		orgJSON.setJsonArray(ja);
		
		assertEquals("[true,\"lorem ipsum\",215]", orgJSON.getJsonArray().toString());
	}


}
