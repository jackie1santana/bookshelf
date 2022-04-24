package org.libraryapi.server;
import org.json.simple.JSONObject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@SpringBootApplication
@RestController

public class ServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	
	@CrossOrigin()
	@GetMapping("/api/bookshelf")
	public Object bookShelfResponse(@RequestParam(value = "name", defaultValue = "book") String name) {
		JSONObject books = new JSONObject();
		JSONObject authors = new JSONObject();
		JSONObject author_robert_greene = new JSONObject();
		JSONObject author_napoleon_hill = new JSONObject();
		
//		Titles under Authors
		ArrayList<Object> authorList = new ArrayList<Object>();
		ArrayList<String> napolean_hill_titles = new ArrayList<String>();
		ArrayList<String> robert_greene_titles = new ArrayList<String>();
		
//		Robert greene Titles Arrays
	 	robert_greene_titles.add("Human Nature");
	 	robert_greene_titles.add("48 Laws of Power");

//		Napolean Hill Titles Arrays
		napolean_hill_titles.add("Think and Grow Rich");

//		Creating the JSON Object 
		// CREATE AN ARRAY TO LOOP IN FRONTEND
		 books.put("authors", authors);
	     authors.put("robert_greene", robert_greene_titles);
	     authors.put("napolean_hill", napolean_hill_titles);

		return books;
	}
	
}