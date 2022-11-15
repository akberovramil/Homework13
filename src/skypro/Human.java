package skypro;

public class Human {

    public String name;
    public int yearOfBirth;
    public String town;
    public String jobTitle;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null || name == "") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth <= 0) {
            throw new RuntimeException("Год рождения не может быть отрицательным или равным нулю");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! " + "Меня зовут " + name + "." + " Я из города " + town + "." + " Я родился в " + yearOfBirth + " году." + " Я работаю на должности " + jobTitle + "." + " Будем знакомы!";
    }
}
