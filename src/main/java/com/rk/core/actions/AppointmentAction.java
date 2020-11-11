package com.rk.core.actions;

import com.rk.core.entity.AppointmentEntity;
import com.rk.core.entity.MeetingroomEntity;
import com.rk.core.service.AppointmentService;
import com.rk.core.service.MeetRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("appointment")
public class AppointmentAction {
    @Autowired
    AppointmentService appointmentService;

    @ResponseBody
    @RequestMapping("/savaAppointment")
    public String savaMeetingRoom(){
        AppointmentEntity appointmentEntity = new AppointmentEntity();
        appointmentService.saveAppointment(appointmentEntity);
        return "success";
    }

}
