package com.wuwei.service;

import com.wuwei.dao.Dao;
import com.wuwei.entity.Student;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 服务层Service
 *
 * @author 吴维
 * @date 2017-8-5 14:49:21
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private Dao dao;

    @Override
    public int addStudent(Student student) {
        return dao.addStudent(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }

    @Override
    public Student getStudentById(int id) {
        return dao.getStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public int delStudentById(int id) {
        return dao.delStudentById(id);
    }
}