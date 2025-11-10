package com.avn.tns.oopsdemo;

public class PersonMain {
     public static void main(String[] args) {

        Person p = new Person();

        p.setName("Sowmya");
        p.setPid(6620);
        p.setAge(20);

        System.out.println(p.getName());
        System.out.println(p.getPid());
        System.out.println(p.getAge());
    }
}
