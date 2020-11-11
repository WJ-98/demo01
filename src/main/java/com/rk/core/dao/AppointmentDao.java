package com.rk.core.dao;

import com.rk.core.entity.AppointmentEntity;
import com.rk.core.entity.MeetingroomEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return this.sessionFactory.openSession();
    }

    //会议室预约
    public int saveAppointment(AppointmentEntity ae){
        int id = (int) getCurrentSession().save(ae);
        return id;
    }
}
