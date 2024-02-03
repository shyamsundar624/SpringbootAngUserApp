package in.shyam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shyam.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
