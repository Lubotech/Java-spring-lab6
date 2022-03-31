
  package vlsu.ispi.sms.StudentManagementSystemOriginal;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.CommandLineRunner; import
  org.springframework.boot.SpringApplication;
 

  import org.springframework.boot.autoconfigure.SpringBootApplication;
  
 import vlsu.ispi.sms.StudentManagementSystemOriginal.entity.Student; import
  vlsu.ispi.sms.StudentManagementSystemOriginal.repository.StudentRepository;
  
  @SpringBootApplication public class
  StudentManagementSystemOriginal1Application implements CommandLineRunner{
  
  public static void main(String[] args) {
  SpringApplication.run(StudentManagementSystemOriginal1Application.class,
  args); }
  
  @Autowired private StudentRepository studentrepository;
  
  @Override public void run(String... args) throws Exception{
  
		
		  Student student1 = new Student("Äbraham", "Lincon", "lincon@gmail.com" );
		  studentrepository.save(student1);
		  
		  Student student2 = new Student("Charles", "Darwin", "darwinism@gmail.com");
		  studentrepository.save(student2);
		  
		  Student student3 = new Student("Kiyimba", "Philip",
		  "kiyimbaphili@gmail.com"); studentrepository.save(student3);
		 
		  Student student4 = new Student("Ssserwadda", "BigEric",
		  "BigEricSseru@gmail.com"); studentrepository.save(student4);
		 
      } 
  }
 

/*
 * package vlsu.ispi.sms.StudentManagementSystemOriginal;
 * 
 * 
 * import org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication;
 * 
 * 
 * 
 * @SpringBootApplication public class
 * StudentManagementSystemOriginal1Application {
 * 
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(StudentManagementSystemOriginal1Application.class,
 * args);
 * 
 * } }
 */


