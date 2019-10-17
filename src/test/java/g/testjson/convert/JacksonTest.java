package g.testjson.convert;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import g.testjson.convert.jackson.Address;
import g.testjson.convert.jackson.Employee;
import g.testjson.convert.jackson.Jackson;

class JacksonTest {

	Jackson jackson;

	@BeforeEach
	public void setUp() {
		jackson = new Jackson();
		
		// create ObjectMapper instance
		jackson.setObjectMapper(new ObjectMapper());
	}

	@Test
	void Convert_JsonString_To_Object() {
		try {
			// read json file to String
			byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));
			
			// convert json string to obj
			Employee emp = jackson.getObjectMapper().readValue(jsonData, Employee.class);

//			System.out.println("Employee Object\n" + emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void Convert_Object_To_JsonString() throws JsonGenerationException, JsonMappingException, IOException {
		
		//create emp instance
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("David");
		emp1.setPermanent(false);
		emp1.setPhoneNumbers(new long[] { 123456, 987654 });
		emp1.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp1.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp1.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp1.setProperties(props);


		// configure Object mapper for pretty print
		jackson.getObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true);

		// writing to console, can write to any output stream such as file
		StringWriter stringEmp = new StringWriter();
		jackson.getObjectMapper().writeValue(stringEmp, emp1);
		
		System.out.println("Employee JSON is\n" + stringEmp);
	}

}
