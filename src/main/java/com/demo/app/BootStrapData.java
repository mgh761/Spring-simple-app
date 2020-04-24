package com.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    AdventureRepo adventureRepo;

    @Override
    public void run(String... args) {

        System.out.println("Load Adventures data.");

        Adventure a1 = new Adventure();
        a1.setTara("Romania");
        a1.setRegiune("Brasovului");
        a1.setLocalitate("Sinaia");
        a1.setTipSport("ATV");
        a1.setCost(50);
        a1.setPerioada("Aprilie-Mai");
        adventureRepo.save(a1);

        Adventure a2 = new Adventure();
        a2.setTara("Romania");
        a2.setRegiune("Brasovului");
        a2.setLocalitate("Bunloc");
        a2.setTipSport("Parapanta");
        a2.setCost(200);
        a2.setPerioada("Tot anul");
        adventureRepo.save(a2);

        System.out.println("Adventures saved.");
    }
}
