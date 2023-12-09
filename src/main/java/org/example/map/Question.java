package org.example.map;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @Id
    @Column(name="question_id")
    private int questionId;
    private String text;

//    @OneToOne
//    @JoinColumn(name="a_id")

//    @OneToMany(mappedBy = "question")

    @OneToMany
    private List<Answer> answers;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswerId() {
        return answers;
    }

    public void setAnswerId(List<Answer> answerId) {
        this.answers = answerId;
    }

    public Question() {
    }

    public Question(int questionId, String text, List<Answer> answers) {
        this.questionId = questionId;
        this.text = text;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", text='" + text + '\'' +
                ", answers=" + answers +
                '}';
    }
}
