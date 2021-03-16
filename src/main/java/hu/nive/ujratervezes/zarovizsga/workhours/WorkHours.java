package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {
    public String minWork(String s) {

        String result = "";
        Path file = Path.of(s);
        List<WorkDays> workDaysList = new ArrayList<>();

        try {
            List<String> workdays = Files.readAllLines(file);
            for (String workday: workdays) {

                String[] workdaysAsarray = workday.split(",");
                workDaysList.add(new WorkDays(workdaysAsarray[0], Integer.parseInt(workdaysAsarray[1]), workdaysAsarray[2]));

            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        workDaysList.sort((workDays1, workDays2) -> workDays1.getWorkHours().compareTo(workDays2.getWorkHours()));

        result = workDaysList.get(0).getWorkerName() + ": " + workDaysList.get(0).getWorkDate();
        //System.out.println(result);
        return result;

    }

//    public static void main(String[] args) {
//        WorkHours wh = new WorkHours();
//
//        wh.minWork("src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt");
//    }
}
