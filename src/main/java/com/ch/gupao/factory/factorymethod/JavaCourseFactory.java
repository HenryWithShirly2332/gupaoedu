package com.ch.gupao.factory.factorymethod;

import com.ch.gupao.factory.ICourse;
import com.ch.gupao.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new JavaCourse();
    }
}
