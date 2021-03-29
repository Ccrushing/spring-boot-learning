package top.crush.boot.batis.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Crush
 * @date 2021/3/25
 * @dercsiption Clazz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Clazz {
    /**
     * 班级Id
     */
    private Integer clazzId;

    /**
     * 班级名称
     */
    private String clazzName;

    /**
     * 班级管理老师的Id
     */
    @JsonIgnore
    private Integer teacherId;

    /**
     * 管理班级的教师对象（一对一）
     */

    private Teacher teacher;

    /**
     * 一方里声明多方的集合
     */

    private List<Student> students;
}