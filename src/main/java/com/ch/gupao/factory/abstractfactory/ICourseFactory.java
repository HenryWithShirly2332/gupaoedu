package com.ch.gupao.factory.abstractfactory;

import com.ch.gupao.factory.ICourse;

//要求所有的子工程都实现这个工厂
//(一个品牌的抽象)
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

}
