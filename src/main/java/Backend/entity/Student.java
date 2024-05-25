package Backend.entity;

import javax.persistence.Column;

public class Student extends Account{
    @Column(name = "major")
    private String majority;
    @Column(name = "gender")
    private String gender;
    @Column(name = "credit_required")
    private int required_credit;

    public String getMajority() {
        return majority;
    }

    public void setMajority(String majority) {
        this.majority = majority;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRequired_credit() {
        return required_credit;
    }

    public void setRequired_credit(int required_credit) {
        this.required_credit = required_credit;
    }


}
