package ad.ra2.ac1.ad_ra2_ac1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import ad.ra2.ac1.ad_ra2_ac1.repository.StudentRepository;
import ad.ra2.ac1.ad_ra2_ac1.model.Student;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @PostMapping("/students/batch")
    public String postMethodName() {
        repo.insertStudents(13,"Ivan","González",26,"DAM",2);
        return "Alumne creat correctament";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repo.getStudents();
    }


}
