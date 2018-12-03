package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "lk_allaince_db", catalog = "")
public class UserModel {
    private String userId;
    private String username;
    private String userEmail;
    private String password;
    private String userSecurityQuestionAnswer;
    private int userTypeId;
    private Date userDob;
    private String securityQuestion;
    private String firstName;
    private String lastName;

    @Id
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "user_security_question_answer")
    public String getUserSecurityQuestionAnswer() {
        return userSecurityQuestionAnswer;
    }

    public void setUserSecurityQuestionAnswer(String userSecurityQuestionAnswer) {
        this.userSecurityQuestionAnswer = userSecurityQuestionAnswer;
    }

    @Basic
    @Column(name = "user_type_id")
    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Basic
    @Column(name = "user_dob")
    public Date getUserDob() {
        return userDob;
    }

    public void setUserDob(Date userDob) {
        this.userDob = userDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return userTypeId == userModel.userTypeId &&
                Objects.equals(userId, userModel.userId) &&
                Objects.equals(username, userModel.username) &&
                Objects.equals(userEmail, userModel.userEmail) &&
                Objects.equals(password, userModel.password) &&
                Objects.equals(userSecurityQuestionAnswer, userModel.userSecurityQuestionAnswer) &&
                Objects.equals(userDob, userModel.userDob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, userEmail, password, userSecurityQuestionAnswer, userTypeId, userDob);
    }

    @Basic
    @Column(name = "security_question")
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
