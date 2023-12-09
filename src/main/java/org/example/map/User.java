package org.example.map;

import javax.persistence.*;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class User {

    @Id
    @Column(name="u_id")
    private int userId;

    @Column(name="u_name")
    private String userName;

    @ManyToMany
    @JoinColumn(name = "p_id")
    private List<Pharmacy> pharmacies;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Pharmacy> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", pharmacies=" + pharmacies +
                '}';
    }
}
