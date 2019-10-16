package g.testjson.convert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import junit.framework.TestCase;

class GsonJsonTest extends TestCase {

	GsonJson gson;

	@BeforeEach
	public void setUp() {
		gson = new GsonJson();
	}

	@Test
	public void Test1_JSONObject_JsonParser_GSON() {
		String json = "{ \"name\": \"Baeldung\", \"java\": true }";
		gson.setGsonObject(new JsonParser().parse(json).getAsJsonObject());

		assertEquals("{\"name\":\"Baeldung\",\"java\":true}", gson.getGsonObject().toString());
		assertTrue(gson.getGsonObject().isJsonObject());
		assertTrue(gson.getGsonObject().get("name").getAsString().equals("Baeldung"));
		assertTrue(gson.getGsonObject().get("java").getAsBoolean() == true);
	}

	@Test
	public void Test2_JSONObject_FromJson_GSON() {
		String json = "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}";
		gson.setGsonObject(new Gson().fromJson(json, JsonObject.class));

		assertEquals("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}", gson.getGsonObject().toString());
		assertTrue(gson.getGsonObject().isJsonObject());
		assertTrue(gson.getGsonObject().get("name").getAsString().equals("jon doe"));
		assertTrue(gson.getGsonObject().get("age").getAsInt() == 22);
	}

	@Test
	public void Test3_PrettyFormat_Gson() {
		String jo = "{ \"name\": \"Baeldung\", \"java\": true }";
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonElement jsonElement = new JsonParser().parse(jo);
//		System.out.println("Test3:\n" + gson.toJson(jsonElement));

		assertEquals("{\"name\":\"Baeldung\",\"java\":true}", jsonElement.toString());
	}

}
