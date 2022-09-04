package com.example.admin;
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
@RequestMapping("admin")
public class AdminController {
	@Autowired
	UserService us;
	@Autowired
	AdminService as;
	@Autowired
	
	AdminRepository adminRepository;
	@GetMapping("/admin")
	public List<Admin> getAllAdmin()
	{
		return (List<Admin>)this.adminRepository.findAll();
	}
	
	@GetMapping("/admin/{admin_id}")
	public Admin getParticularAdmin(@PathVariable("admin_id") int admin_id)
	{
 		 Optional<Admin> optional =  this.adminRepository.findById(admin_id);
		return optional.get();
	}
	
	@PostMapping("/admin")
	public Admin addNewAdmin(@RequestBody Admin admin )
	{
		return this.adminRepository.save(admin);
	}
	
		@PostMapping(value="login", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String adminLogin(@RequestBody Admin u)
		{
				return as.adminLogin(u);
		}
		
		
		@PostMapping(value="update", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String adminUpdate(@RequestBody Admin u)
		{
				return as.adminupdate(u);
		}
		
		
		@PostMapping(value="addQues", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String addQuestion(@RequestBody Question q)
		{
				return as.addQuestion(q);
		}
		
		
		@PostMapping(value="addQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String addQuiz(@RequestBody Quiz q)
		{
				return as.addQuiz(q);
		}
		
			
		@GetMapping(value="viewQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
		public List<Quiz> viewAllQuiz()
		{
				return as.viewAllQuiz();
		}
			
		
		@GetMapping(value="quizinfo", produces= MediaType.APPLICATION_JSON_VALUE)
		public Statistics quizinfo()
		{
				return as.quizInfo();
		}			
}		

	
	
	
	
	