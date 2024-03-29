package in.shyam.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.shyam.entity.User;
import in.shyam.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getUser() {
		List<User> all = userRepository.findAll();
		return new ResponseEntity<List<User>>(all, HttpStatus.OK);
	}

	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
}
