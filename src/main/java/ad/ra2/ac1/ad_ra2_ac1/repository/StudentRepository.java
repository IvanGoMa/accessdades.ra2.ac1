package ad.ra2.ac1.ad_ra2_ac1.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import ad.ra2.ac1.ad_ra2_ac1.model.Student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
@Repository
public class StudentRepository {

    // Creem una instància de jdbcTemplate, que ens permet connectar-nos a la BD
    @Autowired
    JdbcTemplate jdbcTemplate;

    // Mapejem la taula de la bd al model definit a model.Student
    private static final class StudentRowMapper implements RowMapper<Student>{
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
            Student student = new Student();
            student.setId(rs.getLong("id"));
            student.setAge(rs.getInt("age"));
            student.setNom(rs.getString("nom"));
            student.setCognom(rs.getString("cognom"));
            student.setCicle(rs.getString("cicle"));
            student.setAnyo(rs.getInt("anyo"));
            return student;

        }
    }

    // Retorna tots els estudiants
    public List<Student> getStudents(){
        return jdbcTemplate.query("SELECT * FROM students", new StudentRowMapper());
    }

    // Insereix un estudiant
    public int insertStudent(long id, String name, String cognom, int edat, String cicle,int any){
        String sql = "INSERT IGNORE INTO students VALUES (?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,id,name,cognom,edat,cicle,any);
        
    }

        
    
}
