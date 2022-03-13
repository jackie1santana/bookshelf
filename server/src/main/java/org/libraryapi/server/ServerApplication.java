package org.libraryapi.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class ServerApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
		
		
	}
	
	@GetMapping("/api/bookshelf")
	public Object bookShelfResponse(@RequestParam(value = "name", defaultValue = "book") String name) {
//		Data Types
//		Books
		Map<Object, Object>books = new HashMap<>();
		
//		Authors
		Map<String, String>author_robert_greene = new HashMap<>();
		Map<String, String>author_napoleon_hill = new HashMap<>();
		
//		Titles under Authors
		ArrayList<String> napolean_hill_titles = new ArrayList<String>();
		ArrayList<String> robert_greene_titles = new ArrayList<String>();

//		Maps & Arrays
		
//		Titles
//		Robert Greene Titles
		robert_greene_titles.add("48  Laws of Power");
		robert_greene_titles.add("Human nature");
//		Napolean Hill Titles
		napolean_hill_titles.add("Think and Grow Rich");
		
//		Authors
		author_robert_greene.put("Author", "Robert greene");
		author_napoleon_hill.put("Author", "Napolean Hill");
	    
//	    Books
//	    book 1
	    books.put(author_robert_greene, robert_greene_titles);
//	    book 2
	  books.put(author_napoleon_hill, napolean_hill_titles);

		return books;
	}
	
}


//Deserialize JSON hashmap in react
