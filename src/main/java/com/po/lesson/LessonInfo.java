package com.po.lesson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonInfo {
    private Integer id;
    private Integer room;
    private Integer startWeek;
    private Integer endWeek;
    private String building;
    private Integer day;
    private Integer startNum;
    private Integer endNum;
    private Integer week;
    private Integer num;
}
