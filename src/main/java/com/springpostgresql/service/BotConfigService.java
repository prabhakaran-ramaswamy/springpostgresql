package com.springpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpostgresql.model.BotConfig;
import com.springpostgresql.repository.BotConfigRepository;
@Service
public class BotConfigService {

	@Autowired
	private BotConfigRepository repo;

	public List<BotConfig> listAll() {
		return repo.findAll();
	}

	public BotConfig create(BotConfig product) {
		return repo.save(product);
	}

	public BotConfig update(BotConfig product) {
		return repo.save(product);
	}

	public BotConfig findById(Long id) {
		BotConfig botConfig = repo.findById(id).get();
		return botConfig;
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
