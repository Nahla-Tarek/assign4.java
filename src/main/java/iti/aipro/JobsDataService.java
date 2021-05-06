package iti.aipro;
import java.util.*;

public class JobsDataService {
    public Map<String,Long> filterByTitle() {

        TestWuzzufJobs t = new TestWuzzufJobs();
        List<JobDetails> jobDetails = t.test();
        List<String> temp = new ArrayList<>();

        List<Long> Count = new ArrayList<>();

        List<String> Title = new ArrayList<>();

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        LinkedHashMap<String, Long> map = new LinkedHashMap<>();


        long count = 0;

        for (JobDetails jobDetail : jobDetails) {
            temp.add(jobDetail.getTitle());

        }

        lhs.addAll(temp);

        temp.clear();

        temp.addAll(lhs);


        for (String s : temp) {
            for (JobDetails jobDetail : jobDetails) {
                if (s.equals(jobDetail.getTitle())) {
                    count += 1;

                }

            }
            Count.add(count);
            Title.add(s);
            count = 0;
        }
        for (int i = 0; i < Title.size(); i++) {
            map.put(Title.get(i), Count.get(i));
        }
        return map;
    }

    public Map<String,Long> filterbyCountry()
    {
        TestWuzzufJobs t=new TestWuzzufJobs();
        List<JobDetails> jobDetails=t.test();
        List<String> temp1 = new ArrayList<>();
        List<Long> Count1 = new ArrayList<>();
        List<String> Country1 = new ArrayList<>();
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        LinkedHashMap<String,Long>map1=new LinkedHashMap<>();
        long count1 = 0;
        for (JobDetails jobDetail : jobDetails) {
            temp1.add(jobDetail.getCountry());
        }
        lhs1.addAll(temp1);
        temp1.clear();
        temp1.addAll(lhs1);
        for (String s : temp1) {
            for (JobDetails jobDetail : jobDetails) {
                if (s.equals(jobDetail.getCountry())) {
                    count1 += 1;

                }

            }
            Count1.add(count1);
            Country1.add(s);
            count1 = 0;


        }
        for(int i=0;i<Country1.size();i++)
        {
            map1.put(Country1.get(i),Count1.get(i));
        }
        return map1;
    }
    public Map<String,Long> filterbyLevel()
    {
        TestWuzzufJobs t=new TestWuzzufJobs();
        List<JobDetails> jobDetails=t.test();
        List<String> temp2 = new ArrayList<>();
        List<Long> Count2 = new ArrayList<>();
        List<String> Level = new ArrayList<>();
        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        LinkedHashMap<String,Long>map2=new LinkedHashMap<>();
        long count2 = 0;
        for (JobDetails jobDetail : jobDetails) {
            temp2.add(jobDetail.getLevel());
        }
        lhs2.addAll(temp2);
        temp2.clear();
        temp2.addAll(lhs2);
        for (String s : temp2) {
            for (JobDetails jobDetail : jobDetails) {
                if (s.equals(jobDetail.getLevel())) {
                    count2 += 1;

                }

            }
            Count2.add(count2);
            Level.add(s);
            count2 = 0;


        }
        for(int i=0;i<Level.size();i++)
        {
            map2.put(Level.get(i),Count2.get(i));
        }
        return map2;
    }
    public Map<String,Long> filterbyYearsOfExp()
    {
        TestWuzzufJobs t=new TestWuzzufJobs();
        List<JobDetails> jobDetails=t.test();
        List<String> temp3 = new ArrayList<>();
        List<Long> Count3 = new ArrayList<>();
        List<String> YearsOfExp = new ArrayList<>();
        LinkedHashSet<String> lhs3 = new LinkedHashSet<>();
        LinkedHashMap<String,Long>map3=new LinkedHashMap<>();
        long count3 = 0;
        for (JobDetails detail : jobDetails) {
            temp3.add(detail.getYearsExp());
        }
        lhs3.addAll(temp3);
        temp3.clear();
        temp3.addAll(lhs3);
        for (String s : temp3) {
            for (JobDetails jobDetail : jobDetails) {
                if (s.equals(jobDetail.getYearsExp())) {
                    count3 += 1;

                }

            }
            Count3.add(count3);
            YearsOfExp.add(s);
            count3 = 0;


        }
        for(int i=0;i<YearsOfExp.size();i++)
        {
            map3.put(YearsOfExp.get(i),Count3.get(i));
        }
        return map3;
    }

}
