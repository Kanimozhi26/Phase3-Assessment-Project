package com.example.user;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.admin.Admin;
import com.example.question.Question;
import com.example.quiz.Quiz;
import com.example.result.Result;
import com.example.statistics.Statistics;
import com.example.test.Test;
import com.example.user.User;
import com.example.admin.AdminService;
import com.example.user.UserService;
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService us;
	@Autowired
	AdminService as;
	@Autowired
	UserRepository userRepository;

	   @GetMapping("/user")
	   public List<User> getAllUser() {
		   return (List<User>)this.userRepository.findAll();
	   }

	   @GetMapping("/user/{user_id}")
		public User getParticularUser(@PathVariable("user_id") int user_id){
	 		 Optional<User> optional =  this.userRepository.findById(user_id);
			return optional.get();
		}


       @PostMapping("/user")
       public User addNewUser(@RequestBody User user) {
	   return this.userRepository.save(user);
       }
       
	   @PostMapping(value="Login", consumes = MediaType.APPLICATION_JSON_VALUE)
	   public String userLogin(@RequestBody User u)
	   {
			return us.userLogin(u.getEmailid(), u.getPassword());
	   }
	
	@PostMapping(value="Register", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userRegiter(@RequestBody User u)
	{
		return us.userRegister(u);
	}

	@GetMapping(value="viewQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Object> viewQuiz()
	{
			return us.viewAllQuiz();
	}

	@PostMapping(value="takeTest", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String takeTest(@RequestBody Test t)
	{
			return us.takeTest(t);
	}
	
	@GetMapping(value="getAllTest", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Test> getAllTest()
	{
			return us.getTestList();
	}

	@GetMapping(value="getresult", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Result> getresult()
	{
			return us.result();
	}
	
	@GetMapping(value="getAdminResult", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Result> getAdminResult()
	{
			return us.result();
	}
	

}