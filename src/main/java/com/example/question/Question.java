package com.example.question;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="question")
public class Question  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String ques;
	private String o1;
	private String o2;
	private String o3;
	private String o4;
	private int answer;
	
	public int getQid() 
	{
		return qid;
	}
	public void setQid(int qid)
	{
		this.qid = qid;
	}
    public String getQues() 
    {
		return ques;
	}
	public void setQues(String ques) 
	{
		this.ques = ques;
	}
	public String getO1() 
	{
		return o1;
	}
	public void setO1(String o1) 
	{
		this.o1 = o1;
	}
	public String getO2() 
	{
		return o2;
	}
	public void setO2(String o2) 
	{
		this.o2 = o2;
	}
	public String getO3() 
	{
		return o3;
	}
	public void setO3(String o3) 
	{
		this.o3 = o3;
	}
	public String getO4() 
	{
		return o4;
	}
	public void setO4(String o4) 
	{
		this.o4 = o4;
	}
	public int getAnswer() 
	{
		return answer;
	}
	public void setAnswer(int answer) 
	{
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid 
				+ ", ques=" + ques 
				+ ", option-1=" + o1 
				+ ", option-2=" + o2 
				+ ", option-3=" + o3
				+ ", option-4=" + o4 
				+ ", answer=" + answer + "]";
	}
}
