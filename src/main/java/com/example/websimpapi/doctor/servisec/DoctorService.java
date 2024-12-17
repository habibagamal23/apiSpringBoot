package com.example.websimpapi.doctor.servisec;
import com.example.websimpapi.doctor.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

   List<Doctor> doctors = new ArrayList<>();



    DoctorService(){
        doctors.add(new Doctor(1L, "Dr hana " , "eye"));
        doctors.add(new Doctor(2L, "Dr zaina " , "eye"));
        doctors.add(new Doctor(3L, "Dr alya " , "eye"));
        doctors.add(new Doctor(4L, "Dr hana " , "dentist"));

    }



    //1 get all doctor

    public  List<Doctor> getallDoctors(){
        return  doctors;

    }



    public  Doctor adddoctor(Doctor doctor){
        doctors.add(doctor);
        return  doctor;
    }








}