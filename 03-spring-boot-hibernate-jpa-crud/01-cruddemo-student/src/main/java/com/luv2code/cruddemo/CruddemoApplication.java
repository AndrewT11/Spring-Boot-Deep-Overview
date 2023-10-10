package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudents(studentDAO);
		};
	}




	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating ne student object ...");
		Student tempStudent = new Student("Daffy", "Duck", "duck@luv2code.com");

		// save the student
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated Id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with the id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 student objects...");

		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		// save the student objects
		System.out.println("Saving the student objects...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating one student object...");
		Student tempStudent = new Student("Andrew", "Tran", "andrew@luv2code.com");

		// save the student object
		System.out.println("Saving the student object...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Save student. Generated ID: " + tempStudent.getId());
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Applebum");

		// display list of students
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name to "Scooby"
		System.out.println("Updating student ...");
		myStudent.setFirstName("John");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated student: " + myStudent);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primary
		int studentId = 3;
		System.out.println("Deleting student with id: " + studentId);

		// deleting student
		studentDAO.delete(studentId);
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students ...");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

}
