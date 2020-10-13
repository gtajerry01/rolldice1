package com.sofgen.rolldice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sofgen.rolldice.entity.RollDice;

@Repository
public interface RollDiceRepository extends JpaRepository<RollDice, Long> {

}
