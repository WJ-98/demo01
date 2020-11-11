package com.rk.core.actions;


import com.rk.core.entity.MeetingroomEntity;
import com.rk.core.service.MeetRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;


@Controller
@RequestMapping("/meetingRoom")
public class MeetingRoomAction {
    @Autowired
    private MeetRoomService meetRoomService;

    public void setMeetRoomService(MeetRoomService meetRoomService) {
        this.meetRoomService = meetRoomService;
    }
    private Map<String,Object> request;
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    @ResponseBody
    @RequestMapping("/getAll")
    public String list(){
        request.put("meetingRooms",meetRoomService.getAll());
        return "list";
    }

    @ResponseBody
    @RequestMapping("/savaMeetingRoom")
    public String savaMeetingRoom(){
        MeetingroomEntity meetingroomEntity = new MeetingroomEntity();
        meetRoomService.saveMeetingRoom(meetingroomEntity);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/deleteMeetingRoom")
    public String deleteMeetingRoom(Integer id){
        meetRoomService.delete(id);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/findById")
    public String findById(){
        request.put("meetingRoom",meetRoomService.findById());
        return "success";
    }

}
