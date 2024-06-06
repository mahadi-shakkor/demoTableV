module com.oop.mahadi.demotablev {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demotablev to javafx.fxml;
    exports com.oop.mahadi.demotablev;
}