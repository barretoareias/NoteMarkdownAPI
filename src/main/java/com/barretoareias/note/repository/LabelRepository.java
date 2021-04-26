package com.barretoareias.note.repository;

import java.util.Optional;

import com.barretoareias.note.entity.Label;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelRepository extends JpaRepository<Label,Long> {
    
    Optional<Label> findByName(String name);
}
