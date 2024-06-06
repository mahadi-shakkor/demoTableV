package com.oop.mahadi.demotablev;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.time.LocalDate;
import java.time.Month;

public class  TableVControler {

    @FXML
    private TableColumn<Student, LocalDate> dobFxid;

    @FXML
    private TableColumn<Student, String> fNamefxid;

    @FXML
    private TableColumn<Student, String> lNamefxid;

    @FXML
    private TableView<Student> tavbeViewfxid;
    @javafx.fxml.FXML
    public void initialize() {
        fNamefxid.setCellValueFactory(new PropertyValueFactory<Student,String>("fName"));
        lNamefxid.setCellValueFactory(new PropertyValueFactory<Student,String>("lName"));
        dobFxid.setCellValueFactory(new PropertyValueFactory<Student,LocalDate>("BirthYear"));
          tavbeViewfxid.setItems(observable());

          tavbeViewfxid.setEditable(true);
          fNamefxid.setCellFactory(TextFieldTableCell.forTableColumn());
          lNamefxid.setCellFactory(TextFieldTableCell.forTableColumn());



    }
    public ObservableList<Student> observable(){
        ObservableList<Student> obList= FXCollections.observableArrayList();
        Student s1=new Student("x","y",LocalDate.of(2000, Month.APRIL,23));
         obList.add(s1);
        return obList;

    }


    @FXML
    public void changeFirstNameCellEvent(TableColumn.CellEditEvent editCell){
        Student demoStu    =tavbeViewfxid.getSelectionModel().getSelectedItem();
        demoStu.setfName(editCell.getNewValue().toString());

    }

    @FXML
    public void changeSecondNameCellEvent(TableColumn.CellEditEvent editCell){
        Student demoStu    =tavbeViewfxid.getSelectionModel().getSelectedItem();
        demoStu.setlName(editCell.getNewValue().toString());

    }
}
