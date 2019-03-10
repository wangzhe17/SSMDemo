import com.wz.dao.AppointmentDao;
import com.wz.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentDaoTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInsertAppointment() throws Exception {
        int bookId = 1000;
        long studentId = 12345678910L;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryByKeyWithBook() throws Exception {
        long bookId = 1000;
        long studentId = 12345678910L;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }

}
