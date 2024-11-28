package return_of_a_class_object;
/*
This class encapsulates the error message along with
the severity leve of the error
 */
public class ErrorForMessage {
    String errorMessage; // Error message
    int severity; // Code that reflect the severity of the error

    ErrorForMessage (String message, int codeSeverity){
        errorMessage = message;
        severity = codeSeverity;
    }
}
