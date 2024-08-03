public class Main {
    public static void main(String[] args) {

        System.out.println("Homework_2!");
        System.out.println();
        System.out.println("Задача 1.");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println();
        var increaseDog = dog + 4;
        var increaseCat = cat + 4;
        var increasePaper = paper + 4;

        System.out.println("Задача 2.");
        System.out.println(increaseDog);
        System.out.println(increaseCat);
        System.out.println(increasePaper);

        System.out.println();
        var decreaseDog = dog - 3.5;
        var decreaseCat = cat - 1.6;
        var decreasePaper = paper - 7639;
        System.out.println("Задача 3.");
        System.out.println(decreaseDog);
        System.out.println(decreaseCat);
        System.out.println(decreasePaper);

        System.out.println();
        System.out.println("Задача 4.");
        var friend = 19;
        System.out.println(friend);
        var additionFriend = friend + 2;
        System.out.println(additionFriend);
        var divisionFriend = additionFriend / 7;
        System.out.println(divisionFriend);

        System.out.println();
        System.out.println("Задача 5.");
        var frog = 3.5;
        System.out.println(frog);
        var increaseFrog = frog * 10;
        System.out.println(increaseFrog);
        var divisionFrog = increaseFrog / 3.5;
        System.out.println(divisionFrog);
        var additionFrog = divisionFrog + 4;
        System.out.println(additionFrog);

        System.out.println();
        System.out.println("Задача 6.");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("totalWeight: " + (boxerWeight1+boxerWeight2));
        System.out.println("differenceWeight: " + (boxerWeight2-boxerWeight1));
        System.out.println("Задача 7.");
        System.out.println("DiffWeight b2/b1: "+ (boxerWeight2 / boxerWeight1) + "%");

        System.out.println();
        System.out.println("Задача 8.");
        var workingHours = 640;
        var workHourPerson = 8;
        var quantityPeople = workingHours / workHourPerson;
        System.out.println("8.1. Всего работников в компании - " + quantityPeople + " человек.");
        var newQuantityPeople = quantityPeople + 94;
        var newHourWorkPerson = workHourPerson * newQuantityPeople;
        System.out.printf("8.2. Если в компании работает - %d человек, то всего %d часов работы, может быть поделено между сотрудниками.",
                newQuantityPeople, newHourWorkPerson);
    }
}