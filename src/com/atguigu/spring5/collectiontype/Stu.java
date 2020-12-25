package com.atguigu.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu
{
    //1。定义数组、集合类型的属性
    //2。XML配置
    private String[] courses;

    private List<String> list;

    private List<Course> courseList;

    public void setCourseList(List<Course> courseList)
    {
        this.courseList = courseList;
    }

    private Map<String,String> map;

    private Set<String> sets;

    public void setList(List<String> list)
    {
        this.list = list;
    }

    public void setMap(Map<String, String> map)
    {
        this.map = map;
    }

    public void setCourses(String[] courses)
    {
        this.courses = courses;
    }

    public void setSets(Set<String> sets)
    {
        this.sets = sets;
    }

    public void test()
    {
        System.out.println(Arrays.toString(courses));
        System.out.println(courseList);
        System.out.println(map);
        System.out.println(sets);
    }
}
