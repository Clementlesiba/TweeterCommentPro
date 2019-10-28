package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;

import model.TweetCommentEntity;

/**
 * Session Bean implementation class TweetCommentEjb
 */
@Stateless
@LocalBean
public class TweetCommentEjb {
@PersistenceContext
private EntityManager em;

public  TweetCommentEjb() {
}
 public void addNew(TweetCommentEntity tweetCommentEntity){
	 em.persist(tweetCommentEntity); 
 }
}
  