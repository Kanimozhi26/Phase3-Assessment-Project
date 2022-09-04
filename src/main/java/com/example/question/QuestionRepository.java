package com.example.question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.question.Question;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
