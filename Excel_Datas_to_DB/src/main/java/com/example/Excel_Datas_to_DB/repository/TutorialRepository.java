package com.example.Excel_Datas_to_DB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Excel_Datas_to_DB.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}

