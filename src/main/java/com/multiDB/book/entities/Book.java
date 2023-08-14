package com.multiDB.book.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOK_DETAILS")
public class Book {
	
	@Id
	@Column(name = "BOOK_ID")
	private Integer bookId;
	
	@Column(name = "BOOK_PRICE")
	private Integer bookPrice;
	
	@Column(name = "BOOK_NAME")
	private String bookName;
}
