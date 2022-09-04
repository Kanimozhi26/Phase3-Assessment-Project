package com.example.test;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import com.example.question.Question;
import com.example.quiz.Quiz;
import com.example.user.User;
@Component
@Entity
@Table(name="test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "uid")
	private User uid;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "quid")
	private Quiz quid;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private Question qid;
	
	private int testans;

	public int getTid() 
	{
		return tid;
	}
	public void setTid(int tid) 
	{
		this.tid = tid;
	}
	public User getUid() 
	{
		return uid;
	}
	public void setUid(User uid) 
	{
		this.uid = uid;
	}
	public Quiz getQuid() 
	{
		return quid;
	}
	public void setQuid(Quiz quid) 
	{
		this.quid = quid;
	}
	public Question getQid() 
	{
		return qid;
	}
	public void setQid(Question qid) 
	{
		this.qid = qid;
	}
	public int getTestans() 
	{
		return testans;
	}
	public void setTestans(int testans)
	{
		this.testans = testans;
	}
	@Override
	public String toString() 
	{
		return "Test [tid=" + tid 
				+ ", userid=" + uid 
				+ ", quid=" + quid 
				+ ", questionid=" + qid
				+ ", testans=" + testans + "]";
	}
}
