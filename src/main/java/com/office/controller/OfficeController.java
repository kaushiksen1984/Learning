package com.office.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.office.model.Country;
import com.office.model.CountryPayload;
import com.office.model.Person;

@RestController
public class OfficeController {
	
	@Value("${externalAPI}")
	private String externalApiURL;
	
//	@Autowired
	private RestTemplate restTemplate = new RestTemplate();
	
	@PostMapping("/person/addPerson")
	public ResponseEntity<Person> savePerson(@RequestBody Person person){
		
		ResponseEntity<CountryPayload> countryPayload;
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		httpHeaders.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		System.out.println(externalApiURL);
		System.out.println(person.getCountry());
		HttpEntity<Country> requestEntity 
			= new HttpEntity<Country>(new Country(person.getCountry()), httpHeaders);
//		countryPayload = restTemplate.postForEntity(externalApiURL, requestEntity, String.class);
		countryPayload = restTemplate.exchange(externalApiURL, HttpMethod.POST, requestEntity, CountryPayload.class);
		
		System.out.println(countryPayload);
		ResponseEntity<Person> response=new ResponseEntity<Person>(person, HttpStatus.CREATED);
		return response;
		
	}

}
