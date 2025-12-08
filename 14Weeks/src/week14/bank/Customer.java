package week14.bank;

public class Customer {
    // 필드
    private String name;
    private String jobList;

    // 생성자
    public Customer(String name, String jobList) {
        this.name = name;
        this.jobList = jobList;
    }

    public String getName() {
        return name;
    }

    public String getJobList() {
        return jobList;
    }

    public void showInfo() {
        System.out.println("이름: " + name + ", 업무: " + jobList);
    }
}
