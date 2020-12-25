package com.atguigu.spring5.bean;

public class Orders
{
    private String oname;

    public Orders()
    {
        System.out.println("第一步 执行无参数构造创建bean实例");
    }

    public void setOname(String oname)
    {
        this.oname = oname;
        System.out.println("第二部 调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void initMethod()
    {
        System.out.println("第三步 执行初始化的方法");
    }

    public void destroyMethod()
    {
        System.out.println("第五部 销毁的方法");
    }
}
