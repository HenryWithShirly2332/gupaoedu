package com.ch.gupao.factory.factorymethod;

import com.ch.gupao.factory.ICourse;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
    }

}
