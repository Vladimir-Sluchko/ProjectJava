package Lesson9.collection.dto;

import java.util.Date;
import java.util.Objects;

public class Passport {
    private Date dateRegistration;
    private String id;

    public Passport(Date dateRegistration, String id) {
        this.dateRegistration = dateRegistration;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(dateRegistration, passport.dateRegistration) && Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateRegistration, id);
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "dateRegistration=" + dateRegistration +
                ", id='" + id + '\'' +
                '}';
    }
}
