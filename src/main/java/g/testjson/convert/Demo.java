package g.testjson.convert;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Demo {

	private JSONArray jsonArray;
	private JSONObject jsonObject;
	private JsonObject gsonObject;

	public JSONArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}

	public JSONObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	public JsonObject getGsonObject() {
		return gsonObject;
	}

	public void setGsonObject(JsonObject gsonObject) {
		this.gsonObject = gsonObject;
	}
	
}
