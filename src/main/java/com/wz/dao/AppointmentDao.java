package com.wz.dao;

import com.wz.entity.Appointment;
import org.apache.ibatis.annotations.Param;


public interface AppointmentDao {

    int insertAppointment(@Param("bookId") int bookId, @Param("studentId") long studentId);

    Appointment queryByKeyWithBook(@Param("bookId")long bookId,@Param("studentId") long studentId);



}
