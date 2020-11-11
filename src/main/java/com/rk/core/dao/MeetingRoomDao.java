package com.rk.core.dao;

import com.rk.core.entity.AppointmentEntity;
import com.rk.core.entity.MeetingroomEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MeetingRoomDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return this.sessionFactory.openSession();
    }

    //查询会议室情况
    public List<MeetingroomEntity> getAll(){
        return getCurrentSession().createQuery("FROM meetingroom").list();
    }

    //添加会议室
    public int saveMeetingRoom(MeetingroomEntity me){
        int id = (int) getCurrentSession().save(me);
        return id;
    }

    //删除会议室
    public void deleteMeetingRoom(Integer id){
        getCurrentSession().createQuery("DELETE FROM meetingroom m WHELE m.id = ?")
                .setInteger(0,id).executeUpdate();
    }

    //修改会议室信息
    //1.根据id查出要修改的会议室
    public MeetingroomEntity findById(){
        return (MeetingroomEntity) getCurrentSession().createQuery("FROM meetingroom WHERE id = #{id}").list();
    }
    //2.修改



}
