package org.example;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello Алиса!");
    Tester tester = new Tester("Мария", "Шинич", 3, "С1", 14411);
    String info = Tester.getInfo(tester);
    System.out.println(info);
  }
}

class Tester extends Employee{
  public String name;
  public String surname;
  public int experienceInYears;
  public String englishLevel;
  public double salary;

  public Tester() {
    this("Unknown", "Unknown", 0, "None", 0.0);
  }
  public Tester(String name) {
    this(name, "Unknown", 0, "None", 0.0);
  }
  public Tester(String name, String surname) {
    this(name, surname, 0, "None", 0.0);
  }
  public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
    super(name, surname);
    this.experienceInYears = experienceInYears;
    this.englishLevel = englishLevel;
    this.salary = salary;
  }
  public void inf() {
    System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + experienceInYears + " лет, уровень английского: " + englishLevel + ", зарплата: " + salary);
  }
  public void inf(boolean detailed) {
    if (detailed) {
      System.out.println("Детальная информация: Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + experienceInYears + " лет, уровень английского: " + englishLevel + ", зарплата: " + salary);
    } else {
      inf();
    }
  }
  public void updateSalary(double newSalary) {
    this.salary = newSalary;
  }
  public void updateEnglishLevel(String newLevel) {
    this.englishLevel = newLevel;
  }
  public void updateEnglishLevel(String newLevel, boolean isFluent) {
    if (isFluent) {
      this.englishLevel = newLevel;
    } else {
      this.englishLevel = newLevel;
    }
  }
  public static String getInfo(Tester tester) {
    return "Информация: " + tester.name + " " + tester.surname + ", Опыт: " + tester.experienceInYears + " лет, уровень английского: " + tester.englishLevel + ", зарплата: " + tester.salary;
  }
  @Override
  public void displayInfo() {
    System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + experienceInYears + " лет, уровень английского: " + englishLevel + ", зарплата: " + salary);
  }
}

class Employee {
  public String name;
  public String surname;

  public Employee(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }
  public void displayInfo() {
    System.out.println("Имя: " + name + ", Фамилия: " + surname);
  }
}