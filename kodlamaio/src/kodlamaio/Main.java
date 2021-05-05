package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setId(1);
		student.setFirstName("Ty");
		student.setLastName("Nii");
		student.setEmail("Ty@Nii.com");
		
		Instructor instructor = new Instructor();
			instructor.setId(1);
			instructor.setFirstName("Engin");
			instructor.setLastName("Demirog");
			instructor.setLesson("Java");
			
			UserManager userManager = new UserManager();
			userManager.add(student);
			userManager.delete(student);
			
			StudentManager studentManager = new StudentManager();
			studentManager.add(student);
			
			InstructorManager instructorManager = new InstructorManager();
			instructorManager.add(instructor);
			
	
	}

}
