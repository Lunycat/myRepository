package Stepic.AdvancedJava.P7_Files.Lesson40_Serialization.programmer1.task2;

import java.io.Serializable;

public class Car implements Serializable {
    private final long serialVersionUID = 1;
    private String model;
    private String engine;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
