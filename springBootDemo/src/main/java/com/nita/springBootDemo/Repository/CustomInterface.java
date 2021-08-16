package com.nita.springBootDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nita.springBootDemo.POJO.Book;

public interface CustomInterface extends JpaRepository<Book,Long>{

}
