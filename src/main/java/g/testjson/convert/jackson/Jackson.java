package g.testjson.convert.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Jackson {
	
	private ObjectMapper objectMapper;
	
	private SerializationFeature serializationFeature;
	
	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}

	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public SerializationFeature getSerializationFeature() {
		return serializationFeature;
	}

	public void setSerializationFeature(SerializationFeature serializationFeature) {
		this.serializationFeature = serializationFeature;
	}
}
