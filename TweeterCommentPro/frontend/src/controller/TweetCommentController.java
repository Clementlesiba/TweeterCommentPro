package controller;

import twitter4j.util.function.*;
import twitter4j.conf.*;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.SessionMap;

import model.TweetComment;

@ManagedBean (name = "tweetCommentController")
@SessionScoped

public class TweetCommentController {
	
   
   
	@ManagedProperty(value="#{tweetComment}")
	private TweetComment tweetComment;
    
    public TweetComment getTweetComment() {
		return tweetComment;
	}

	public void setTweetComment(TweetComment tweetComment) {
		this.tweetComment = tweetComment;
	}

	public void addNewTweetcomment()
    { 
		ConfigurationBuider cf= new ConfigurationBuider;
		cf.setDebugEnabled(true)
		  .setOAuthCustomerKey("71VopPebq13I0VYWqFlvolDIP ")
		  .setOAuthCustomerSecret("ImnTTSojkpRG6XgD8D45oGXCmCgBTUF6wXGJ83ALJrfZgD5bVk")
		  .setOAuthAccessToken("1897774585-sJXVZBwG67QJe0esPRJdXTzfW9fRYMr1hi6o0VB ")
		  .setOAuthAccessTokenSecret("yQdwtImAJx0tTBt25PyCaQshWbLFK9m4gSDeIW1u8B6lq");
		
		
		Twitterfactory tf =new Twitterfactory(cf.Build());
		twitter4j.Twitter twitter=tf.getInstance(); 
		
		List<tweetComment> status= twitter.getTweetComment();
		for (tweetComment tc : status)
		{
			tweetCommentController.tweetComment.tweetComment= getTweetComment(st.getText);
			tweetCommentController.tweetComment.tweetComment= getTweetDate(st.getDate);
		}
    }
 
} 
 