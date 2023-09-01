package com.fedex.streamapi;

public class EmployeeObject implements Comparable<EmployeeObject> {
    @Override
    public String toString() {
        return "EmployeeObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    private Integer id;
    private String name;
    private String designation;
    private Integer salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public EmployeeObject(Integer id, String name, String designation, Integer salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeObject that) {
        if(this.getSalary()>that.getSalary()){
            return 1;
        }else if(this.getSalary()<that.getSalary()){
            return -1;
        }else{
            return 0;
        }
    }
}
