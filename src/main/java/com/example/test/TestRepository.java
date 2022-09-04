package com.example.test;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.test.Test;
public interface TestRepository extends JpaRepository<Test, Integer>
{	
	@Query("Select t from Test as t group by t.uid")
	List<Test> getIndividual();
}
