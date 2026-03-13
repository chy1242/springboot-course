package com.yhc.springbootweek02.service;

import com.yhc.springbootweek02.entity.Phone;
import com.yhc.springbootweek02.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class StudentService {
    private static final Map<Long, Student> STUDENT_DATA = new ConcurrentHashMap<>();

    static {
        Student student1 = Student.builder()
                .id(1L)
                .name("张三")
                .gender("男")
                .birthday(LocalDate.of(1990, 1, 1))
                .phone(Phone.builder().band("华为").price(5000.0).color("蓝色").build())
                .build();
        STUDENT_DATA.put(student1.getId(), student1);
        Student student2 = Student.builder()
                .id(2L)
                .name("李四")
                .gender("女")
                .birthday(LocalDate.of(1995, 2, 2))
                .phone(Phone.builder().band("苹果").price(8000.0).color("黑色").build())
                .build();
        STUDENT_DATA.put(student2.getId(), student2);

    }


    /**
     * 创建学生
     *
     * @param student
     */
    public void createStudent(Student student) {
        STUDENT_DATA.put(student.getId(), student);
    }

    /**
     * 通过id查询学生
     *
     * @param id
     * @return
     */
    public Student getStudentById(Long id) {
        return STUDENT_DATA.get(id);
    }

    /**
     * 通过姓名查询学生
     *
     * @param name
     * @return
     */
    public Student getStudentByName(String name) {
        return STUDENT_DATA.values().stream().filter(student -> student.getName().equals(name)).findFirst().orElse(null);
    }

    /**
     * 获取所有学生
     *
     * @return
     */
    public Iterable<Student> getAllStudents() {
        return STUDENT_DATA.values();
    }

    /**
     * 通过id更新学生
     *
     * @param id
     * @param student
     */
    public void updateStudentById(Long id, Student student) {
        STUDENT_DATA.put(id, student);
    }

    /**
     * 通过id删除学生
     */
    public void deleteStudentById(Long id) {
        STUDENT_DATA.remove(id);
    }
}
