package model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean (name="tweetComment")
@SessionScoped  


public class TweetComment {

	private String tweetComment;
	private Date tweetDate;
	
	public String getTweetComment() {
		return tweetComment;
	}
	public void setTweetComment(String tweetComment) {
		this.tweetComment = tweetComment;
	}
	public Date getTweetDate() {
		return tweetDate;
	}
	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	} 
	public TweetCommentEntity getEntity()
	{
		TweetCommentEntity tweetCommentEntity=new TweetCommentEntity()
	    tweetCommentEntity.SettweetComment(tweetComment);
		 tweetCommentEntity. setTweetDate(tweetDate);
	 	 return tweetCommentEntity;
	}
}
