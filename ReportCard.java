package com.example.android.reportcard;

/**
 * Created by Cedo Peric 13.05.2017
 * ReportCard class project
 */


public class ReportCard {
    //Student's name
    private String mStudentName;
    //Academic year of the report card
    private Integer mAcademicYear;
    //Grades of the subjects the student is attending
    private int mMath;
    private int mEnglish;
    private int mBiology;
    private int mPhysics;
    private int mLiterature;


    /**
     * Create a new ReportCard object
     *
     * @param studentName  Name of the student
     * @param academicYear Academic year the student is currently enrolled in
     * @param math         Math grade
     * @param english      English grade
     * @param biology      Biology grade
     * @param physics      Physics grade
     * @param literature   Literature grade
     */


    public ReportCard(String studentName, Integer academicYear, int math, int english, int biology, int physics, int literature) {
        mStudentName = studentName;
        mAcademicYear = academicYear;
        mMath = math;
        mEnglish = english;
        mBiology = biology;
        mPhysics = physics;
        mLiterature = literature;

    }


    //Get the students name
    public String getStudentName() {
        return mStudentName;
    }

    // Set the student's name
    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    //Get the academic year the student is currently enrolled in
    public Integer getmAcademicYear() {
        return mAcademicYear;
    }

    // Set the academic year
    public void setmAcademicYear(Integer academicYear) {
        mAcademicYear = academicYear;
    }


    //Get and set the grades for the subjects
    public Integer getmMath() {
        return mMath;
    }

    public void setmMath(Integer math) {
        mMath = math;
    }


    public Integer getmEnglish() {
        return mEnglish;
    }

    public void setmEnglish(Integer english) {
        mEnglish = english;
    }

    public Integer getmBiology() {
        return mBiology;
    }

    public void setmBiology(Integer biology) {
        mBiology = biology;
    }

    public Integer getmPhysics() {
        return mPhysics;
    }

    public void setmPhysics(Integer physics) {
        mPhysics = physics;
    }

    public Integer getmLiterature() {
        return mLiterature;
    }

    public void setmLiterature(Integer literature) {
        mLiterature = literature;
    }


    public String toString() {
        //Return a representation of the report card

        return "Student's Name: " + mStudentName + "\n" +
                "Academic Year: " + mAcademicYear + "\n" +
                "Math: " + mMath + "\n" +
                "English: " + mEnglish + "\n" +
                "Biology: " + mBiology + "\n" +
                "Physics: " + mPhysics + "\n" +
                "Literature: " + mLiterature;


    }


}
