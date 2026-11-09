module com.mycompany.lab10_fall {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.lab10_fall to javafx.fxml;
    exports com.mycompany.lab10_fall;
}
