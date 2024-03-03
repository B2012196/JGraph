
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Form;
public class Main {

    public void unitView(){
        Form form = new Form();
        form.setVisible(true);
    } 
    public static void main(String[] args) {

        new Main().unitView();
    }
}
