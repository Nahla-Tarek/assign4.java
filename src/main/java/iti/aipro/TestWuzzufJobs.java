package iti.aipro;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestWuzzufJobs {
    public List<JobDetails> test() {
        ReadCsv1 p1 = new ReadCsv1();
        return p1.readJobDetailsFromCsv("C:\\Users\\nahla\\IdeaProjects\\tablesaw\\wuzzf\\src\\Wuzzuf_Jobs.csv");
    }
    public void Test()
    {
        JobsDataService j=new JobsDataService();


        for (Map.Entry m : j.filterByTitle().entrySet()) {
            System.out.println("Job Title" + ":" + m.getKey() + " " + "&" + " " + "its frequency" + ":" + m.getValue());
        }


        for (Map.Entry m :  j.filterbyCountry().entrySet()) {
            System.out.println("Country" + ":" + m.getKey() + " " + "&" + " " + "The frequency of job demand in this country" + ":" + m.getValue());
        }

        for (Map.Entry m : j.filterbyLevel().entrySet()) {
            System.out.println("Level" + ":" + m.getKey() + " " + "&" + " " + "The frequency of this level" + ":" + m.getValue());
        }
        LinkedHashMap<String, Long> sortedMap3 = new LinkedHashMap<>();

        j.filterbyYearsOfExp().entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap3.put(x.getKey(), x.getValue()));

        for (Map.Entry m : sortedMap3.entrySet()) {
            System.out.println("years of exp." + ":" + m.getKey() + " " + "&" + " " + "The frequency of this years of exp." + ":" + m.getValue());
        }

    }
}
