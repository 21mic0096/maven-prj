package validation;

public class app {
    public static void main(String[] args) {
        PersonValidator validator = new PersonValidator();
        System.out.println(validator.validatePerson("ram", 3025));
    }
