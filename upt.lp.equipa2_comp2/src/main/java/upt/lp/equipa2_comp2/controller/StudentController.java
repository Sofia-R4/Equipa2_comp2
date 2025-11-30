/**
 * 
 */
package upt.lp.equipa2_comp2.controller;
import upt.lp.equipa2_comp2.entity.Student;
import upt.lp.equipa2_comp2.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.*;
/**
 * 
 */
@RestController
@RequestMapping ("/voluntariado/students")
public class StudentController {
	
	private final StudentService studentService;

	/**
	 * @param studentService
	 */
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student>getAll(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getById(@PathVariable Long id) {
		return studentService.getStudent(id);
	}
	
	@PostMapping("/student")
	public Student create (@RequestBody Student s) {
		return studentService.createStudent(s);
	}
}
