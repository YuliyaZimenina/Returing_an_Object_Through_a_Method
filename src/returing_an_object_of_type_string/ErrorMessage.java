package returing_an_object_of_type_string;
// Returning an object of type String
public class ErrorMessage {
    String [] message = {
      "Output Error",
      "Input Error",
      "The disk is full",
      "The index has gone out of bounds."
    };

    // Method returning error message
    String getErrorMessage(int i){
        if (i >= 0 & i < message.length ) return message[i];
        else return "Non-existing error code";
    }
}
