package com.ch.gupao.factory.simplefactory;

import com.ch.gupao.factory.ICourse;
import com.ch.gupao.factory.JavaCourse;


public class SimpleFactoryTest {
    public static void main(String[] args) {

        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();


    }
}
