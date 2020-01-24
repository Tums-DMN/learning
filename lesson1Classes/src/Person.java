public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     *
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    public boolean marry(Person person) {
        if ((person.man != this.man) & (person.spouse == null) & (this.spouse == null)) {
            this.spouse = person;
            person.spouse = this;
            return true;
        } else return false;
    }


    /**
     * Sets spouse = null if spouse is not null
     *
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        if (this.spouse != null){
            spouse.spouse = null;
            this.spouse = null;
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {

        Person first = new Person(true, "Ivan");
        Person second = new Person(false, "Maria");
        Person third = new Person(false, "Anna");

        if (first.marry(second)) System.out.println(first.name + " & " + second.name + " Marryed!!!");
            else System.out.println("WTF?!");
        if (third.marry(second)) System.out.println(third.name + " & " + second.name + " Marryed!!!");
            else System.out.println("У " + third.name + " и " + second.name + " Свадьбы не будет!!!");
        if (third.marry(first)) System.out.println(third.name + " " + first.name + " Marryed!!!");
            else{
            if (first.divorce()) System.out.println(first.name + " divorced");
            third.marry(first);
            System.out.println(first.name + " & " + third.name + " Marryed!!!");

        }
    }
}
