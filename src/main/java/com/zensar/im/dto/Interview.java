package com.zensar.im.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel
public class Interview {
    @ApiModelProperty(value="interview id of an candidate")
    private int interview_id;
    @ApiModelProperty(value = "candidate id of an candidate")
    private int candidate_id;
    @ApiModelProperty(value = "Candidate technical round rating")
    private int tech_rating;
    @ApiModelProperty(value = "Candidate hr round rating")
    private int hr_rating;
    @ApiModelProperty(value = "Candidate hr comment")
    private String hr_comments;
    @ApiModelProperty(value ="Interview status of an candidate")
    private String status;
    @ApiModelProperty(value = "interview start timing")
    private String start_time;
}
