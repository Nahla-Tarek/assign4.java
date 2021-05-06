package iti.aipro;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCsv1 {
    public ReadCsv1(){}
    public List<JobDetails> readJobDetailsFromCsv(String fileName) {
        List<JobDetails> jobDetails  = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(fileName) , ','))
        {
            String [] record;
            record=reader.readNext();


            while ((record = reader.readNext())!= null) {
                JobDetails jobdet=createJobdet(record);
                jobDetails.add(jobdet);




            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return jobDetails;
    }

    public JobDetails createJobdet(String[] arrOfStr) {
        String title=arrOfStr[0];
        String company=arrOfStr[1];
        String location=arrOfStr[2];
        String type=arrOfStr[3];
        String level=arrOfStr[4];
        String yearsExp=arrOfStr[5];
        String country=arrOfStr[6];
        String skill=arrOfStr[7];
        return new JobDetails(title,company,location,type,level,yearsExp,country,skill);
    }






}
