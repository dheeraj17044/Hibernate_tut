package org.example.map;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String text;

//    @ManyToOne
//    @JoinColumn(name = "qid")
//    private Question question;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getText() {
        return text;
    }

//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }

    public void setText(String text) {
        this.text = text;
    }

    public Answer() {
    }

    public Answer(int answerId, String text) {
        this.answerId = answerId;
        this.text = text;
//        this.question = question;
    }
}
