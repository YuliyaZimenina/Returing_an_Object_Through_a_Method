package return_of_a_class_object;

public class ErrorInfoDemo {
    public static void main(String[] args) {
        ErrorInformation errorInformation = new ErrorInformation();
        ErrorForMessage errorForMessage;
        errorForMessage = errorInformation.getErrorInformation(2);
        System.out.println(errorForMessage.errorMessage + " || Error severity level "
                + errorForMessage.severity);
        errorForMessage = errorInformation.getErrorInformation(19);
        System.out.println(errorForMessage.errorMessage + " || Error severity level "
                + errorForMessage.severity);
    }
}
