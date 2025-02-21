package HiberTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TrainerStudentDao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	public static void main(String[] args) {

//		saveStudentTrainer();             
//		findById();
//		findAll();
//		updateStudentName();
//		assignTrainerToStudent();
//		deleteTrainerFromStudent();

	}

	public static void saveStudentTrainer() {
		Student student = new Student();
		student.setName("Pavan");

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student);

		Trainer trainer = new Trainer();
		trainer.setName("Raju Sir");

		List<Trainer> trainerList = new ArrayList<Trainer>();
		trainerList.add(trainer);

		trainer.setStudents(studentList);
		student.setTrainers(trainerList);

		et.begin();
		em.persist(trainer);
		et.commit();

	}

	public static void findById() {
		Student student = em.find(Student.class, 1);

		Trainer trainer = em.find(Trainer.class, 1);

		System.out.println("Student : " + student.getName());
		System.out.println("Trainer : " + trainer.getName());

	}

	public static void findAll() {
		Query query = em.createQuery("select student from Student student");

		List<Student> students = query.getResultList();

		for (Student student : students) {

			System.out.println("..............");
			System.out.println("Student Id : " + student.getId());
			System.out.println("Student Name : " + student.getName());
			System.out.println("..............");
		}

	}

	public static void updateStudentName() {
		Student student = em.find(Student.class, 1);

		student.setName("Ketan");

		et.begin();
		em.merge(student);
		et.commit();
	}

	public static void assignTrainerToStudent() {
		Trainer trainer = em.find(Trainer.class, 1);

		Student student = em.find(Student.class, 1);

		if (student != null && trainer != null) {

			List<Trainer> trainerList = student.getTrainers();

			trainerList.add(trainer);

			student.setTrainers(trainerList);

			List<Student> studentList = trainer.getStudents();

			studentList.add(student);

			trainer.setStudents(studentList);

			et.begin();
			em.persist(trainer);
			em.persist(student);
			et.commit();

		}
	}

	public static void deleteTrainerFromStudent() {
		Student student = em.find(Student.class, 1);
		Trainer trainer = em.find(Trainer.class, 1);

		if (student != null && trainer != null) {

			List<Trainer> trainerList = student.getTrainers();
			Iterator<Trainer> trainerIterator = trainerList.iterator();

			while (trainerIterator.hasNext()) {
				Trainer t = trainerIterator.next();
				if (t.getId() == trainer.getId()) {
					trainerIterator.remove();
					break;
				}
			}
			student.setTrainers(trainerList);

			List<Student> studentList = trainer.getStudents();
			Iterator<Student> studentIterator = studentList.iterator();

			while (studentIterator.hasNext()) {
				Student s = studentIterator.next();
				if (s.getId() == student.getId()) {
					studentIterator.remove();
					break;
				}
			}
			trainer.setStudents(studentList);
			;
		}

		et.begin();
		em.merge(student);
		et.commit();
	}

}
