package com.ch.gupao.factory.factorymethod;

import com.ch.gupao.factory.ICourse;
import com.ch.gupao.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
