package com.fedex.springdemo.Interview.ObjectCopy;

public class ShallowDeepCopyMain {

    public static void main(String args[]){
        Student obj1=new Student();
        obj1.id=21;

        Address add=new Address();
        add.addressId=101;
        obj1.address=add;

        Student obj2=(Student) obj1.clone();


        obj2.id=22;
        obj2.address.addressId=102;
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
