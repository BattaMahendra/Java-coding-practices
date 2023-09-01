package com.fedex.streamapi;

import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeSpliterator implements Spliterator<EmployeeObject> {

    private Integer id;
    private String name;
    private String designation;
    private Integer salary;
    private Spliterator<String> baseSpliterator;
    public EmployeeSpliterator(Spliterator<String> baseSpliterator) {
        this.baseSpliterator=baseSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super EmployeeObject> action) {
       if(this.baseSpliterator.tryAdvance(id->this.id=Integer.valueOf(id))&&
        this.baseSpliterator.tryAdvance(name->this.name=name) &&
        this.baseSpliterator.tryAdvance(designation->this.designation=designation)&&
        this.baseSpliterator.tryAdvance(salary->this.salary=Integer.valueOf(salary))){
            action.accept(new EmployeeObject(this.id,this.name,this.designation,this.salary));
            return true;
       };
       return false;
    }

    @Override
    public Spliterator<EmployeeObject> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return baseSpliterator.estimateSize()/8;
    }

    @Override
    public int characteristics() {
        return baseSpliterator.characteristics();
    }
}
