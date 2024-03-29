package com.example.books.repositories;

import com.example.books.entities.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPageRepository extends JpaRepository<Page, Long> {
}