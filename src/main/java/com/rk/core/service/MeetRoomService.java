package com.rk.core.service;

import com.rk.core.dao.MeetingRoomDao;
import com.rk.core.entity.AppointmentEntity;
import com.rk.core.entity.MeetingroomEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MeetRoomService {
    @Autowired
    private MeetingRoomDao meetingRoomDao;


    //查询会议室情况
    public List<MeetingroomEntity> getAll(){
        return meetingRoomDao.getAll();
    }

    //添加会议室
    public int saveMeetingRoom(MeetingroomEntity me){
        me.setLocation("一楼西侧");
        me.setValue(30);
        me.setProjection("是");
        return meetingRoomDao.saveMeetingRoom(me);
    }

    //删除会议室
    public void delete(Integer id){
        meetingRoomDao.deleteMeetingRoom(id);
    }

    //修改会议室信息
    //1.根据id查出要修改的会议室
    public MeetingroomEntity findById(){
        return meetingRoomDao.findById();
    }
    //2.修改

}
