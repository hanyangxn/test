package com.xn.util;

import java.io.Serializable;
import java.util.List;

/**
 * 对应excel模板数据的实体类
 * @author Administrator
 *
 */
public class KnowledgeExcelEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -406186749881175240L;
	private String question;
	private String answer;
	List<String> similarQuestion;
	private String companyUuid;
	
	public String getCompanyUuid() {
		return companyUuid;
	}
	public void setCompanyUuid(String companyUuid) {
		this.companyUuid = companyUuid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public List<String> getSimilarQuestion() {
		return similarQuestion;
	}
	public void setSimilarQuestion(List<String> similarQuestion) {
		this.similarQuestion = similarQuestion;
	}
	@Override
	public String toString() {
		return "KnowledgeExcelEntity [question=" + question + ", answer=" + answer + ", similarQuestion="
				+ similarQuestion + ", companyUuid=" + companyUuid + "]";
	}
	
}
