package com.example.test.repository;

import com.example.test.model.MyNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomNumberRepository extends JpaRepository<MyNumber, Long> {
}
