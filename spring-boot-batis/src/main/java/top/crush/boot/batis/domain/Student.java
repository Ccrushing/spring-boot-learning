package top.crush.boot.batis.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生所属班级的id
     */
    @JsonIgnore
    private Integer clazzId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生籍贯
     */
    private String hometown;

    /**
     * 出生日期
     */
    @JsonIgnore
    private LocalDate birthday;

    /**
     * 在多方里，声明一方的对象
     */
    @JsonIgnore
    private Clazz clazz;

    /**
     * 学生和班级多对一
     */
    @JsonIgnore
    private List<Course> courses;


}