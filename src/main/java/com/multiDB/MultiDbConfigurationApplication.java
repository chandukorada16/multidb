package com.multiDB;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multiDB.book.entities.Book;
import com.multiDB.book.repositories.BookRepository;
import com.multiDB.user.entities.User;
import com.multiDB.user.repositories.UserRepository;

@SpringBootApplication
@RestController
public class MultiDbConfigurationApplication {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostConstruct
	public void adddata2DB() {
		User user1 = new User(9, "chandukorada.com", "Chandu");
		User user2 = new User(10, "harshaRangu.com", "Harsha");
		List<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userRepository.saveAll(userList);
		
		Book book1 = new Book(105, 9023, "AWS");
		Book book2 = new Book(106, 992, "Salesforce");
		List<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookRepository.saveAll(bookList);
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
		
	}
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookRepository.findAll();
		
	}
	public static void main(String[] args) {
		SpringApplication.run(MultiDbConfigurationApplication.class, args);
	}

}
