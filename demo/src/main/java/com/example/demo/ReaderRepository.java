package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

/**
 * @program: rehearsal
 * @description: ReaderRepository
 * @author: LiShuLin
 * @create: 2019-08-14 14:42
 **/
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
