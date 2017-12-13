import entity.Student;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Map;

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
  */
            Student student = session.get(Student.class, 1);
            //System.out.println(student);
            student.setAge(30);

            transaction.commit();

            session.close();
            sessionFactory.close();
    }
}