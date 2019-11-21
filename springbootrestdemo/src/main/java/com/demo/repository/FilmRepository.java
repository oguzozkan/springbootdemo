package com.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.entity.FilmsEntity;


@Repository
public interface FilmRepository extends JpaRepository<FilmsEntity, Long> {
}


