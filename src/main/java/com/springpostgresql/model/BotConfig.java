package com.springpostgresql.model;

import org.hibernate.annotations.ColumnTransformer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "BotConfig")
@Table(name = "bot_config")
public class BotConfig extends BaseModel {
	
	@Column(name = "data1", columnDefinition = "jsonb")
	@JsonProperty("data1")
	@ColumnTransformer(write = "?::jsonb")
	@Convert(converter = JsonNodeConverter.class)
	private JsonNode data1;

	@Column(name = "data2", columnDefinition = "jsonb")
	@JsonProperty("data2")
	@ColumnTransformer(write = "?::jsonb")
	@Convert(converter = JsonNodeConverter.class)
	private JsonNode data2;

	public JsonNode getData1() {
		return data1;
	}

	public void setData1(JsonNode data1) {
		this.data1 = data1;
	}

	public JsonNode getData2() {
		return data2;
	}

	public void setData2(JsonNode data2) {
		this.data2 = data2;
	}
	
	
	
}
