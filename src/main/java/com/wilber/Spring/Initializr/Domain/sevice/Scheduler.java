package com.wilber.Spring.Initializr.Domain.sevice;
import org.springframework.scheduling.annotation.Scheduled;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class Scheduler {
    // Method
    // To trigger the scheduler every one minute
    // between 19:00 PM to 19:59 PM
    @Scheduled(cron = "0 * 19 * * ?")
    public void scheduleTask()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss.SSS");

        String strDate = dateFormat.format(new Date());

        System.out.println(
                "Cron job Scheduler: Job running at - "
                        + strDate);
    }

    @Scheduled(fixedRate = 5000)
    public void runTask() {
        System.out.println("Running Scheduled Task every 5 seconds!");
    }

    @Scheduled(cron = "${my.cron.expression}")
    public void dynamicScheduledTask() {
        System.out.println("Executing task based on dynamic cron expression!");
    }

    @Scheduled(fixedRate = 5000)
    public void runTaskWithLogging() {
        try {
            System.out.println("Starting Scheduled Task...");

            // Task logic here

            System.out.println("Scheduled Task completed successfully!");
        } catch(Exception e) {
            System.err.println("Error executing scheduled task: " + e.getMessage());
        }
    }

    @Scheduled(cron = "0 0 12 * * ?") // Ejecuta el método todos los días a las 12:00 PM
    public void doCronTask() {
        // Código de la tarea programada
        System.out.println("Tarea programada ejecutada a las 12:00 PM.");
    }

}
