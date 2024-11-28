package return_of_a_class_object;

public class ErrorInformation {
    // Error messages
    String[] message = {
            "Output Error",
            "Input Error",
            "The disk is full",
            "The index has gone out of bounds."
    };

    // Error severity code
    int[] howBad = {3, 3, 2, 4};

    // Method returning class object ErrorForMessage
    ErrorForMessage getErrorInformation (int i){
        if (i >= 0 & i < message.length)
            return new ErrorForMessage(message[i], howBad[i]);
        else
            return new ErrorForMessage("Non-existing error code", 0);
    }
}
