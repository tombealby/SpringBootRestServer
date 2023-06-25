package restForCucumber.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restForCucumber.demo.domain.Fruit;

@RestController
public class FruitController {
	
	@RequestMapping("/fruits")
	public ResponseEntity<List<Fruit>> hello() {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("banana", "yellow"));
		fruits.add(new Fruit("strawberry", "red"));
		return ResponseEntity.ok(fruits);
	}

}
