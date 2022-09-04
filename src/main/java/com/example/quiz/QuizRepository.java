package com.example.quiz;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.quiz.Quiz;
@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer>
{
	@Query("select q.title,count(distinct q.quizno) from Quiz as q group by q.quizno")
	public List<Object> listOfQuiz();
}
