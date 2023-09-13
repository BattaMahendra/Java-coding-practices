package com.fedex.springdemo.Interview.ObjectCopy;

public class Address implements Cloneable{

     int addressId;

     @Override
     public String toString() {
          return "Address{" +
                  "addressId=" + addressId +
                  '}';
     }

     @Override
     public Address clone() {
          try {
               Address clone = (Address) super.clone();
               // TODO: copy mutable state here, so the clone can't change the internals of the original
               return clone;
          } catch (CloneNotSupportedException e) {
               throw new AssertionError();
          }
     }
}
