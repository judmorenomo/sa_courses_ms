package sa.course.model;

import javax.persistence.*;

@Entity
@Table(name = "courses")
@NamedQueries({@NamedQuery(name = Course.FIND_ALL, query = "SELECT u FROM Course u")})
public class Course {

    public static final String FIND_ALL = "Course.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private String name;
    private Long credits;

    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }

    public String getName(){
      return name;
    }
    public void setName(String name){
      this.name = name;
    }

    public Long getCredits() {
        return credits;
    }
    public void setCredits(Long credits) {
        this.credits = credits;
    }
}