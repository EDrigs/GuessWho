module org.example.guesswhoproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.guesswhoproject to javafx.fxml;
    exports org.example.guesswhoproject;
}