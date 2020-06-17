
package com.xn.pojo;

//import org.apache.solr.client.solrj.beans.Field;
//import org.springframework.data.solr.core.mapping.SolrDocument;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

@SolrDocument(solrCoreName="xbot_core")
public class SolrQuestionResult implements Serializable{

/**
	 * 
	 */

	private static final long serialVersionUID = -6031066219848718178L;
	@org.springframework.data.annotation.Id
	private String questionId;
	@Field("question")
	private String question;
	@Field("knowledgeId")
	private String knowledgeId;
	@Field("knowName")
	private String knowName;
	@Field("answer")
	private String answer;
	@Field("msgType")
	private String msgType;
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getKnowName() {
		return knowName;
	}
	public void setKnowName(String knowName) {
		this.knowName = knowName;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "SolrQuestionResult [questionId=" + questionId + ", question=" + question + ", knowledgeId="
				+ knowledgeId + ", knowName=" + knowName + ", answer=" + answer + ", msgType=" + msgType + "]";
	}
}

