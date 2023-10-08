package homeWork.hw2.hw35rest;

public class ForReq {
    String name;
    String job;

    public ForReq(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public ForReq(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


}
