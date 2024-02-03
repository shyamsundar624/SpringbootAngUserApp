package in.shyam;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.shyam.entity.User;
import in.shyam.repository.UserRepository;

@SpringBootApplication
public class UserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}
@Bean
	CommandLineRunner init(UserRepository userRepository) {
	userRepository.deleteAll();
	return args->{
		Stream.of("Shyam","Sangam","Vinod","Shilpi").forEach(name->{
			User user=new User(name,name.toLowerCase()+"@domain.com");
		userRepository.save(user);
		});
	};
	}
}
