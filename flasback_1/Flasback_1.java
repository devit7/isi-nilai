/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flasback_1;

/**
 *
 * @author ASUS
 */
public class Flasback_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=3;
                    for(int a=8;a>1;a--){
                        for (int i = 1; i < a; i++) {
                            System.out.print(j+" ");
                            j+=2;
                        }
                        System.out.println();
                    }
    }
}
