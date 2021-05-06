package iti.aipro;

public class JobDetails {
    String title;
    String company;
    String location;
    String type;
    String level;
    String yearsExp;
    String country;
    String skill;


    public JobDetails(String title,String company,String location,String type,String level,String yearsExp,String country,String skill) {


        this.title=title;
        this.company=company;
        this.location=location;
        this.type=type;
        this.level=level;
        this.yearsExp=yearsExp;
        this.country=country;
        this.skill=skill;


    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany(){return company;}

    public void setCompany(String company) {
        this.company = company;
    }
    public String getLocation(){return location;}

    public void setLocation(String location) {
        this.location = location;
    }
    public String getType(){return type;}

    public void setType(String type) {
        this.type = type;
    }
    public String getLevel(){return level;}

    public void setLevel(String level) {
        this.level = level;
    }
    public String getYearsExp(){return yearsExp;}

    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry( String country) {
        this.country= country;
    }
    public String getSkill(){return skill;}

    public void setSkill(String skill) {
        this.skill = skill;
    }
    // write the remaining setters and getters




}
