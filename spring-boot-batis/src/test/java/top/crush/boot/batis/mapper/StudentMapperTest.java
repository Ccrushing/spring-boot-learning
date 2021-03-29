package top.crush.boot.batis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.crush.boot.batis.domain.Student;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

//    @Test
//    void insert() {
//        Student student = Student.builder()
//                .clazzId(1)
//                .studentName("test学生")
//                .hometown("江苏南京")
//                .birthday(LocalDate.of(2000, 10, 10))
//                .build();
//        int n = studentMapper.insert(student);
//        assertEquals(n, 1);
//    }
//
//    @Test
//    void deleteByPrimaryKey() {
//    }
//
//    @Test
//    void selectByPrimaryKey() {
//        Student student = studentMapper.selectByPrimaryKey(1);
//        assertEquals("金晨星", student.getStudentName());
//    }
//
//    @Test
//    void updateByPrimaryKeySelective() {
//        Student student = Student.builder()
//                .studentId(1009)
//                .clazzId(2)
//                .studentName("新名字")
//                .build();
//        int n = studentMapper.updateByPrimaryKeySelective(student);
//        assertEquals(1, n);
//    }
//
//    @Test
//    void batchInsert() {
//        List<Student> students = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Student student = Student.builder()
//                    .studentId(3000 + i)
//                    .clazzId(1)
//                    .studentName("测试学生" + i)
//                    .hometown("测试城市")
//                    .birthday(LocalDate.of(1999, 10, 10))
//                    .build();
//            students.add(student);
//        }
//        int n = studentMapper.batchInsert(students);
//        assertEquals(10, n);
//    }
//
//
//    @Test
//    void batchUpdate() {
//        List<Student> students = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Student student = Student.builder()
//                    .studentId(3000 + i)
//                    .clazzId(1)
//                    .studentName("新名字" + i)
//                    .build();
//            students.add(student);
//        }
//        int n = studentMapper.batchUpdate(students);
//        assertEquals(1, n);
//    }
//
//    @Test
//    void batchDelete() {
//        List<Integer> idList = new ArrayList<>();
//        idList.add(3001);
//        idList.add(3002);
//        idList.add(3003);
//        int n = studentMapper.batchDelete(idList);
//        assertEquals(3, n);
//    }
//
//    @Test
//    void selectByDynamicSql() {
//        Student student = Student.builder().hometown("江").build();
//        List<Student> students = studentMapper.selectByDynamicSql(student);
//        System.out.println(students);
//    }
    @Test
    void getStudentManyToOne() {
        Student student = studentMapper.getStudent(1001);
        assertEquals("江苏苏州 ",student.getHometown());
        System.out.println(student);http://localhost:8080/api/course/allhttp://localhost:8080/api/course/all
        assertEquals(1001,student.getStudentId());
        assertEquals("金晨星",student.getStudentName());
        assertEquals(1,student.getClazz().getClazzId());
        assertEquals("软件1921",student.getClazz().getClazzName());
        assertEquals(2,student.getCourses().size());

    }
}