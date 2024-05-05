package BookMyShow;

public class User {
    String name;
    int userId;
    int age;
    String gender;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setUserName(String name)
    {
        this.name=name;
    }
    public void setUserId(int id)
    {
        this.userId=id;
    }
    public String getUserName()
    {
        return this.name;
    }
    public int getUserId()
    {
        return this.userId;
    }

}
