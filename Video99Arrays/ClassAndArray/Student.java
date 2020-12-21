package com.amitsuneja;

public class Student {

        private String nameofstudent;
        private int rollnumber;

        public Student(String nameofstudent, int rollnumber) {
            this.nameofstudent = nameofstudent;
            this.rollnumber = rollnumber;
    }

    public String getNameofstudent() {
        return nameofstudent;
    }

    public int getRollnumber() {
        return rollnumber;
    }
}
