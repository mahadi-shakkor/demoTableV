package com.oop.mahadi.demotablev;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Student {
    private SimpleStringProperty fName,lName;
    private LocalDate birthYear;

    public Student() {
    }

    public String getfName() {
        return fName.get();
    }

    public SimpleStringProperty fNameProperty() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName.set(fName);
    }

    public String getlName() {
        return lName.get();
    }

    public SimpleStringProperty lNameProperty() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName.set(lName);
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public Student(String fName, String lName, LocalDate birthYear) {
        this.fName = new SimpleStringProperty(fName);
        this.birthYear = birthYear;
        this.lName = new SimpleStringProperty((lName));
    }
}
