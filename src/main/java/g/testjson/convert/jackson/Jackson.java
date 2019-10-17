package g.testjson.convert.jackson;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
