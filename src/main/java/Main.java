import entity.Exam;
import entity.Student;
import entity.Subject;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import reports.ExamResult;
import reports.Reports;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
        public static void main(final String[] args) {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();

            Transaction transaction = session.beginTransaction();
/*
            Student student = new Student();
            student.setFirstName("Svetlana");
            student.setLastName("Petrova");
            student.setAge(18);
            session.save(student);

            Student student = session.get(Student.class, 1);
            Set<Exam> exams = student.getExams();


            Subject subject = new Subject();
            subject.setName("Biology");
            session.save(subject);
*/
/*            Exam exam = new Exam();
            exam.setStudent(session.get(Student.class, 1));
            exam.setSubject(session.get(Subject.class, 3));
            exam.setGrade(2);
            session.save(exam);
            transaction.commit();

            Query query = session.createQuery("from Student");
            List<Student> students = query.list();
*/
            Reports reports = new Reports();
            List<ExamResult> examResult = reports.getExamResult("Ivan", "Ivanov", session);

            session.close();
            sessionFactory.close();
    }
}