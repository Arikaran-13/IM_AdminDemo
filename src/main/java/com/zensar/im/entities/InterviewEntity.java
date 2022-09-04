package com.zensar.im.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="interview_schedule")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InterviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int interview_id;
    private int candidate_id;
    private int tech_rating;
    private int hr_rating;
    private String hr_comments;
    private String status;
    private String start_time;
}
