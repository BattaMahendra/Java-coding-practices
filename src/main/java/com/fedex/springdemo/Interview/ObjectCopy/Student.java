package com.fedex.springdemo.Interview.ObjectCopy;

public class Student implements Cloneable{

    int id;
    Address address;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.address= (Address) address.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
