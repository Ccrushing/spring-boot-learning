package top.crush.boot.batis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
    private Integer id;

    private String name;

    private String description;

    private String cover;
}