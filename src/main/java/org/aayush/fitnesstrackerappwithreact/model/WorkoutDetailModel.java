package org.aayush.fitnesstrackerappwithreact.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class WorkoutDetailModel {
    private String title;
    private String description;
    private String type;
    private int intensity;
    private int duration;
    private Date date;
}
