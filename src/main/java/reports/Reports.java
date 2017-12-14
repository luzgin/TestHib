package reports;

import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class Reports {

    public List<ExamResult> getExamResult(String firstName, String lastName, Session session){
        String query = "select new reports.ExamResult(s.lastName, sj.name, e.grade)" +
                " from Exam e, Student s, Subject sj " +
                " where e.student.id = s.id and e.subject.id = sj.id" +
                " and s.firstName = :firstName and s.lastName = :lastName";
        Query hibernateQuery = session.createQuery(query);
        hibernateQuery.setParameter("firstName", firstName);
        hibernateQuery.setParameter("lastName", lastName);

        return hibernateQuery.list();
    }

    public List<ExamResult> getExamResultLight(String firstName, String lastName, Session session){
        String query = "select new reports.ExamResult(e.student.lastName, e.subject.name, e.grade)" +
                " from Exam e " +
                "where e.student.firstName = :firstName and e.student.lastName = :lastName";
        Query hibernateQuery = session.createQuery(query);
        hibernateQuery.setParameter("firstName", firstName);
        hibernateQuery.setParameter("lastName", lastName);

        return hibernateQuery.list();
    }

    public List<StudentAddressReport> getStudentAddress (String firstName, String lastName, Session session){
        String query = "select new reports.StudentAddressReport(s.firstName, s.lastName, s.studentAddress.city, s.studentAddress.address) " +
                "from Student s " +
                "where s.firstName = :firstName and s.lastName = :lastName";
        Query hibernateQery = session.createQuery(query);
        hibernateQery.setParameter("firstName", firstName);
        hibernateQery.setParameter("lastName", lastName);
        return hibernateQery.list();
    }
}
