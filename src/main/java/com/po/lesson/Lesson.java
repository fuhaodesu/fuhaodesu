package com.po.lesson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson {
    private Integer id;
    private String LessonName;
    private String teacherName1="";
    private String teacherName2="";
    private String teacherName3="";
    private String teacherName4="";


}
