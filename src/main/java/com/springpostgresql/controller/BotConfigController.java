package com.springpostgresql.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.springpostgresql.exception.BotConfigNotFoundException;
import com.springpostgresql.model.BotConfig;
import com.springpostgresql.service.BotConfigService;

@RestController
@RequestMapping("/api")
public class BotConfigController {

	@Autowired
	private BotConfigService service;

	@GetMapping(value = "/data")
	public List<BotConfig> list() {
		return service.listAll();
	}

	@GetMapping(value = "/data/{id}")
	public BotConfig getOne(@PathVariable Long id) throws BotConfigNotFoundException {
		try {
			return service.findById(id);
		} catch (NoSuchElementException e) {
			throw new BotConfigNotFoundException(" No element found");

		}

	}

	@PostMapping(value = "/data")
	public BotConfig create(@RequestBody BotConfig botConfig) {
		return service.create(botConfig);
	}

	@PutMapping(value = "/data/{id}")
	public ResponseEntity<?> update(@RequestBody BotConfig botConfig, @PathVariable Long id) {
		BotConfig create = service.update(botConfig);
		return ResponseEntity.ok(create);
	}

	@PatchMapping(value = "/data/{id}")
	public ResponseEntity<?> updatePartially(@PathVariable Long id, @RequestBody JsonNode data) {
		return null;
		// BotConfig create = service.update(botConfig);
		// return ResponseEntity.ok(botConfig);
	}

	@DeleteMapping(value = "/data/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.ok("test");
	}

}