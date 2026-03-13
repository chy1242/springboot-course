package com.yhc.springbootweek02.controller;

import com.yhc.springbootweek02.entity.Student;
import com.yhc.springbootweek02.service.StudentService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
@Slf4j
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 创建学生
     * @param student
     * @return
     */
    @PostMapping
    public String createStudent(@RequestBody Student student) {
        log.info("创建学生信息：{}", student);
        studentService.createStudent(student);
        return "创建学生成功";
    }

    /**
     * 通过id查询学生
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        log.info("通过id查询学生信息：{}", id);
        return studentService.getStudentById(id);
    }

    /**
     * 通过姓名查询学生
     * @param name
     * @return
     */
    @GetMapping()
    public Student getStudentByName(@RequestParam String name) {
        log.info("通过姓名查询学生信息：{}", name);
        return studentService.getStudentByName(name);
    }

    /**
     * 获取所有学生
     * @return
     */
    @GetMapping("/all")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    /**
     * 通过id更新学生
     * @param id
     * @param student
     * @return
     */
    @PutMapping("/{id}")
    public String updateStudentById(@PathVariable Long id, @RequestBody Student student) {
        log.info("通过id查询学生信息：{}", id);
        log.info("通过id更新学生信息：{}", student);
        studentService.updateStudentById(id, student);
        return "更新学生成功";
    }

    /**
     * 通过id删除学生
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        log.info("通过id删除学生信息：{}", id);
        studentService.deleteStudentById(id);
        return "删除学生成功";
    }
}
