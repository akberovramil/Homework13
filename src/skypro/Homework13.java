package skypro;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("������� 1 � ������� 2");
        Human maxim = new Human("������", 2000, "�����", "�����-��������");
        Human anya = new Human("���", 1993, "������", "�������� ��������������� ��������");
        Human katya = new Human("����", 1992, "�����������", "�������-��������");
        Human artem = new Human("�����", 1995, "������", "�������� �� �������� �������");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println("������� 3");
        Car lada = new Car("", "Granta", 1.7, "", 0, "������");
        Car audi = new Car("Audi", " A8 50 L TDI quattro", 3.0, "������", 2020, "��������");
        Car bmw = new Car("BMW", "Z8", 3.0, "������", 2021, "��������");
        Car kia = new Car("Kia", "Sportage 4-�� ���������", 2.4, "�������", 2018, "����� �����");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "���������", 2016, "����� �����");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        Human dima = new Human("����", 12, "������","");
        System.out.println(dima);
        Human vladimir = new Human("��������", 2001, "������", "����� �� ��������");
        System.out.println(vladimir);
        Flower rosa = new Flower("����", null, "���������", 35.59);
        Flower hriz = new Flower("����������", null, null, 15.00, 5);
        Flower pion = new Flower("����", null, "������", 69.90, 1);
        System.out.println(rosa.toString());
        System.out.println(hriz.toString());
        System.out.println(pion.toString());
        Car abc = new Car("����", "New", 2.4, "�����", 2002, "������", "������", "�����", "x110vc111", 5, "������", null, null);
        System.out.println(abc.toString1());
        abc.changeTires();
        System.out.println(abc.toString1());
        abc.checkNumber(abc.regNumber);







    }

}
