package org.example.exstudent.service;

import org.example.exstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class StudentService implements IStudentService<Student> {

    private final Map<UUID , Student> students;

    public StudentService() {
        students = new HashMap<>();
    }

    public void saveOrUpdate(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudentById(UUID id){
        return students.get(id);
    }

    public List<Student> getAllStudent() {
        return students.values().stream().toList();
    }

    public List<Student> getStudentByName (String lastname){
        if (lastname.isEmpty()){
            return students.values().stream().toList();

        } else if (lastname.length() <= 3 ) {

            return students.values().stream().filter(s -> s.getLastname()
                    .contains(lastname)).toList();
        }else {
            return students.values().stream().filter(s -> s.getLastname()
                    .equals(lastname)).toList();
        }
    }

    public void deleteStudent (UUID id){
        students.remove(id);
    }

}
