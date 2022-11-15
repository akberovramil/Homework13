package skypro;

public class Human {

    public String name;
    public int yearOfBirth;
    public String town;
    public String jobTitle;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null || name == "") {
            this.name = "���������� �� �������";
        } else {
            this.name = name;
        }
        if (yearOfBirth <= 0) {
            throw new RuntimeException("��� �������� �� ����� ���� ������������� ��� ������ ����");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null || town == "") {
            this.town = "���������� �� �������";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "���������� �� �������";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "������! " + "���� ����� " + name + "." + " � �� ������ " + town + "." + " � ������� � " + yearOfBirth + " ����." + " � ������� �� ��������� " + jobTitle + "." + " ����� �������!";
    }
}
