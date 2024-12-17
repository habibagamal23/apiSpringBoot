package com.example.websimpapi.doctor.controller;

import com.example.websimpapi.doctor.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.websimpapi.doctor.model.Doctor;
import com.example.websimpapi.doctor.servisec.DoctorService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @GetMapping
    public ResponseEntity<Response<List<Doctor>>> getalldata(){
        List doctors = doctorService.getallDoctors();
        Response<List<Doctor>> response = new Response<>("OK" , "Doctors retived succesfl" , doctors);
      return new ResponseEntity<>(response , HttpStatus.OK);


    }



    @PostMapping
    public   ResponseEntity<Response<Doctor>> adddoctors
            (@RequestBody Doctor doctor){
 Doctor doctor1 = doctorService.adddoctor(doctor);

        Response<Doctor> response = new Response<>
                ("OK" , "Doctors added succesfl" , doctor1);
        return new ResponseEntity<>(response , HttpStatus.OK);
    }

}