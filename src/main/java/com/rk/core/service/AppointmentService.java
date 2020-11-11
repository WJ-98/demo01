package com.rk.core.service;
import com.rk.core.dao.AppointmentDao;
import com.rk.core.entity.AppointmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class AppointmentService {
    @Autowired
    AppointmentDao appointmentDao;

    //会议室预约
    public int saveAppointment(AppointmentEntity ae){
       ae.setName("张三");
       ae.setAppointmentTime(new Date());
       ae.setNumber(50);
       ae.setOutline("对新员工进行培训");
       return appointmentDao.saveAppointment(ae);
    }
}
