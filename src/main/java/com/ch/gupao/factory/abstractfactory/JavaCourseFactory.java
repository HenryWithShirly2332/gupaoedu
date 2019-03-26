package com.ch.gupao.factory.abstractfactory;

import com.ch.gupao.factory.ICourse;
import com.ch.gupao.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{

    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
