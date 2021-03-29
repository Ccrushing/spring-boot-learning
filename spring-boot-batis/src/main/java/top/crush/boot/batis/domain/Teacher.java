package top.crush.boot.batis.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
    * 教师id
    */

    private Integer teacherId;

    /**
    * 教师姓名
    */
    private String teacherName;

    /**
    * 教师管理的班级id
    */
    @JsonIgnore
    private Integer clazzId;

    /**
     * 教师管理的班级对象
     */
    @JsonIgnore
    private Clazz clazz;
}