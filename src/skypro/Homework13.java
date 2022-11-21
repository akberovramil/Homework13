package skypro;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("Задание 1 и задание 2");
        Human maxim = new Human("Максим", 2000, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        System.out.println(maxim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println("Задание 3");
        Car lada = new Car("", "Granta", 1.7, "", 0, "Россия");
        Car audi = new Car("Audi", " A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        Human dima = new Human("Дима", 12, "Казань","");
        System.out.println(dima);
        Human vladimir = new Human("Владимир", 2001, "Казань", "нигде не работает");
        System.out.println(vladimir);
        Flower rosa = new Flower("Роза", null, "Голландия", 35.59);
        Flower hriz = new Flower("Хризантема", null, null, 15.00, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.90, 1);
        System.out.println(rosa.toString());
        System.out.println(hriz.toString());
        System.out.println(pion.toString());
        Car abc = new Car("Фиат", "New", 2.4, "белый", 2002, "Италия", "ручная", "седан", "x110vc111", 5, "летняя", null, null);
        System.out.println(abc.toString1());
        abc.changeTires();
        System.out.println(abc.toString1());
        abc.checkNumber(abc.regNumber);







    }

}
