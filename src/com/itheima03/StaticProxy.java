package com.itheima03;

// 静态代理案例：多线程实现原理


public class StaticProxy {
    public static void main(String[] args) {

        weddingCompany weddingCompany = new weddingCompany(new You());
        weddingCompany.HappyMarry();


    }
//    结婚 接口
    interface Marry{
        void HappyMarry();
    }

//     真实角色   真实结婚对象类
static class You implements Marry{

        @Override
        public void HappyMarry() {
            System.out.println("李华要结婚了");
        }
    }

//    代理角色   代理真实角色结婚
static class weddingCompany implements Marry{

        private Marry target;  //代理的目标

        weddingCompany(Marry target){
            this.target = target;
        }              //带参构造方法

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private  void after(){
        System.out.println("结婚之后直接洞房");
    }
    private void before(){
        System.out.println("结婚之前先去定亲");
    }
}




}
