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

    // Creem una instància de StudentRepository
    @Autowired
    private StudentRepository repo;

    // Endpoint que insereix 10 alumnes a la BD
    @PostMapping("/students/batch")
    public String postMethodName() {
        repo.insertStudent(13,"Ivan","González",26,"DAM",2);
        repo.insertStudent(14,"Laura","Martínez",20,"DAW",1);
        repo.insertStudent(15,"Carlos","Ruiz",22,"ASIX",2);
        repo.insertStudent(16,"María","López",19,"DAM",1);
        repo.insertStudent(17,"Sergio","Navarro",25,"DAW",2);
        repo.insertStudent(18,"Paula","Fernández",21,"ASIX",1);
        repo.insertStudent(19,"Jorge","Castillo",23,"DAM",2);
        repo.insertStudent(20,"Elena","Santos",24,"DAW",1);
        repo.insertStudent(21,"David","Moreno",22,"ASIX",2);
        repo.insertStudent(22,"Lucía","Torres",20,"DAM",1);

        
        return "Alumnes creat correctament";
    }

    // Endpoint que retorna els estudiants de la base de dades
    @GetMapping("/students")
    public List<Student> getStudents() {
        return repo.getStudents();
    }


}
