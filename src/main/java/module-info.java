module com.badal.snakegamebybadal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.badal.snakegamebybadal to javafx.fxml;
    exports com.badal.snakegamebybadal;
}