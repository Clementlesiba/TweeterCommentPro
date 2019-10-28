package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tweetComment")
public class TweetCommentEntity {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private long id;
 
 private String tweetComment;
 private Date tweetDate;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
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
   
}
