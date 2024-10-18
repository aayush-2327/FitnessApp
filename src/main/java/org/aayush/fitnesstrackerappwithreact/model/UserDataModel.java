package org.aayush.fitnesstrackerappwithreact.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document("users")
public class UserDataModel {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private double height;
    private List<WorkoutDetailModel> workouts;

    @Override
    public String toString() {
        return "UserDataModel{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", workouts=" + workouts +
                '}';
    }
}
