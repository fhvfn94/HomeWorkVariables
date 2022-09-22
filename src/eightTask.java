public class eightTask {
    public static void main(String[] args){
        var hours = 640;
        var person = 8;
        var allPeople = hours / person;
        System.out.println("Всего работников в компании - " + allPeople);
        var morePerople = allPeople + 94;
        var workTime = hours / morePerople;
        System.out.println("Если в компании работает " + morePerople + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками");
    }
}
