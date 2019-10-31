package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: rehearsal
 * @description: ReadingListRepository
 * @author: LiShuLin
 * @create: 2019-08-14 14:27
 **/
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);
}
