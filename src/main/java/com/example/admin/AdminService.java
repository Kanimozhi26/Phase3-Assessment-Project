package com.example.admin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.admin.Admin;
import com.example.question.Question;
import com.example.quiz.Quiz;
import com.example.result.Result;
import com.example.statistics.Statistics;
import com.example.user.User;
import com.example.admin.AdminRepository;
import com.example.question.QuestionRepository;
import com.example.quiz.QuizRepository;
import com.example.user.UserRepository;
@Service
public class AdminService {
	@Autowired
	QuestionRepository qr;
	@Autowired
	QuizRepository qur;
	@Autowired
	UserRepository ur;
	@Autowired
	Statistics stat;
	@Autowired
	AdminRepository adr;
	public String adminLogin(Admin u)
	 {
		Admin ad= adr.findById(1).get();
		if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
		 {
			return "Welcome admin";
		 }
		else
		 {
			return "invalid Credentials";
		 }
	 }
	public String adminupdate(Admin a)
	 {
		Admin ad= adr.findById(1).get();
		ad.setUsername(a.getUsername());
		ad.setPassword(a.getUsername());
		adr.saveAndFlush(ad);
			return "Updated";
	 }
	public String addQuestion(Question q)
	 {
		if(q!=null)
		 {
			qr.save(q);
			return "question added";
		 }
		else
		 {
			return "failed to add";
		 }
	 }
	public String addQuiz(Quiz q)
	 {
		if(q!=null)
		 {
			qur.save(q);
			return "quiz added";
		 }
		else
		 {
			return "failed to add";
		 }
	}
	public List<Quiz> viewAllQuiz()
	{
		return qur.findAll();
	}
	
	public Statistics quizInfo()
	{
		stat.setUsers(ur.findAll().size());
		stat.setQuestions(qr.findAll().size());
		stat.setQuiz(qur.listOfQuiz());
		return stat;
	}
}
