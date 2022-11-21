package skypro;

import java.time.LocalDate;

public class Human {

    public String name;
    private int yearOfBirth;
    private String town;
    public String jobTitle;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null || name == "") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth <= 0) {
            throw new RuntimeException("Сообщение должно было придти Арслану Закирову");
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

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0  ) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || !town.isEmpty() || !town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

    }

    @Override
    public String toString() {
        return "Привет! " + "Меня зовут " + name + "." + " Я из города " + town + "." + " Мне " + getAge() + " лет" + " Я работаю на должности " + jobTitle + "." + " Будем знакомы!";
    }
}
