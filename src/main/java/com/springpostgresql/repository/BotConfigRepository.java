package com.springpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springpostgresql.model.BotConfig;

@Repository
public interface BotConfigRepository extends JpaRepository<BotConfig, Long> {
 
}