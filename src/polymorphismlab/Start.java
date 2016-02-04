/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismlab;

/**
 *
 * @author alancerio18
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Name n = new John();

        Name[] names = new Name[2];
        names[0] = new John();
        names[1] = new Mike();

        for (int i = 0; i < names.length; i++) {
            names[i].setfName();
            names[i].setlName();
        }

    }

}
