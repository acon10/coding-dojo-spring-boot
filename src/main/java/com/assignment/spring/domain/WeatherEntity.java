package com.assignment.spring.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "weather")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "city", length = 255, nullable = false)
	private String city;

	@Column(name = "country", length = 255, nullable = false)
	private String country;

	@Column(name = "temperature", precision=5, scale=2)
	private Double temperature;

}
