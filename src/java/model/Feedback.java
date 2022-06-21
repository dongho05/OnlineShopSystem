/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author phung
 */
public class Feedback {
    private int feedbackID;
    private User user;
    private int detailID;
    private String comment;
    private String commentDate;

    public Feedback() {
    }

    public Feedback(int feedbackID, User user, int detailID, String comment, String commentDate) {
        this.feedbackID = feedbackID;
        this.user = user;
        this.detailID = detailID;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }
    
    
   
}
