package kr.ac.knu.grammer;

import lombok.Data;

/**
 * Created by rokim on 2017. 5. 25..
 */
@Data
public class Student {
    private String name;
    private int point;


    public Student(String name, int point) {
        this.name = name;
        this.point = point;
    }
}
