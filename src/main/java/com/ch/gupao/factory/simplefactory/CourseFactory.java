package com.ch.gupao.factory.simplefactory;

import com.ch.gupao.factory.ICourse;

public class CourseFactory {

    //方法一:传参
//    public ICourse create(String name){
//
//        if("java".equals(name)) {
//            return new JavaCourse();
//        }else if ("python".equals(name)){
//            return new PythonCourse();
//        }else {
//            return null;
//        }
//    }

    //方法二:传包名
//    public ICourse create(String className){
//        try {
//            if(null == className || "".equals(className)){
//
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return  null;
//    }

    //方法三:传类名
    public ICourse create(Class clazz){
        try {
            if(null != clazz){

                return (ICourse) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
}
