package com.example.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.user.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	 public User findByEmailid(String emailid);
}
