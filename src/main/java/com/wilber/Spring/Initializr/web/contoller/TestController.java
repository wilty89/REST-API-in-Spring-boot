package com.wilber.Spring.Initializr.web.contoller;

import com.wilber.Spring.Initializr.Domain.persistence.entity.Drivers;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")

public class TestController {

    @Scheduled(fixedRate = 10000)
    public static void runTask() {
        System.out.println("Running Scheduled Task every 10 seconds!");
    }


    @GetMapping("/")
    public String myIp(){
        try {
            InetAddress myIp;
            myIp = InetAddress.getLocalHost();
            return "Conneted from" + " /" + myIp + " /" + "to" + " /" + LocalDateTime.now();

        } catch (UnknownHostException e) {

            throw new RuntimeException(e);

        }
    }
    @RequestMapping(path = "nombre/{name}/{age}")
    public String output(
            @PathVariable(name="name", required = true) String name,
            @PathVariable(name= "age", required = true) int age
        ) {
        return String.format("%s is %s years old", name, age);
    }

    @GetMapping("/GetDrivers")
    public List<Drivers> GetDrivers(){
        return List.of(
                new Drivers(
                      1L,"jose martinez",30
                ),
                new Drivers(
                        2L,"carlos piantini",31
                )
        );
    }

    @GetMapping("/drivers")
    public List<Drivers> Drivers(){
        List<Drivers> drivers = new ArrayList<>();

        Drivers student1 = new Drivers();
        student1.setId(1L);
        student1.setName("jose martinez");
        student1.setAge(30);

        Drivers student2 = new Drivers();
        student2.setId(2L);
        student2.setName("carlos piantini");
        student2.setAge(31);

        drivers.add(student1);
        drivers.add(student2);
        return drivers;
    }
}