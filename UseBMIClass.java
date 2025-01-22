public class UseBMIClass {
    public static void main(String[] args) {
        // Creating a new instance of the BMI
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        // Creating a new instance of the BMI
        // Note that we lack one parameter and the IDE's interpreter will take age = 215 and weight = 70 and likely
        // default age to null which makes Susan's BMI 9.223372036854776__E__16. This is the code as it is in the book.
        // If we put in 18 for age we get three arguments and the result will be as stated in the expected output.
        BMI bmi2 = new BMI("Susan King",215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
        // "The BMI for Susan King is 30.85 Obese" is the expected output, but from the lack of age in the book we get
        // a BMI of comic proportions.
    }
}
