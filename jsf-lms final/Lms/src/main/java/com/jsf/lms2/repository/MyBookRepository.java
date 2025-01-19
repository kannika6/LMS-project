package com.jsf.lms2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsf.lms2.entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {

}
