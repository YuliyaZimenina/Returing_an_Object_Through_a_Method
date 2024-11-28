package returing_an_object_of_type_string;

public class ErrorMessageDemo {
    public static void main(String[] args) {
        ErrorMessage errorMessage = new ErrorMessage();

        System.out.println(errorMessage.getErrorMessage(2));
        System.out.println(errorMessage.getErrorMessage(19));
    }
}
