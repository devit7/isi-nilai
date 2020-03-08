/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refisi;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class ke1 {
    public int baris1;
    Scanner baca =new Scanner(System.in);
    public String nama[]=new String[100];
    public int nilaimatem[]=new int[100];
    public int h=0,h2=0,h3=0;
    
    public void embuh(){
        System.out.println("masukan nama "+getBaris()+" baris :");
        boolean ul1=true;
        while(ul1){
            h++;
            nama[h]=baca.next();
            if(h<=1){
                ul1=true;
            }else if(h>=getBaris()){
                ul1=false;
            }
        }
    }
    public void aq_pegel(){
        System.out.println("masukan nilai matematika "+getBaris()+" baris :");
        boolean ul2=true;
        while(ul2){
            h2++;
            nilaimatem[h2]=baca.nextInt();
            if(h2<=1){
                ul2=true;
            }else if(h2>=getBaris()){
                ul2=false;
            }
        }
    }
   
    public void poll_pegele(){
        System.out.println();
        for (int i = 1; i <=1; i++) {
            System.out.print("nama "+" matem "+" keterangan");
            System.out.println();
            for(int a=1;a<=getBaris();a++){
                System.out.print(nama[a]+"  "+nilaimatem[a]);
                if(nilaimatem[a]>75){
                    System.out.println("  lulus");
                }else{
                    System.out.println("  tdk lulus");
                }
            }
        }
    }
    public void bingung(){
        baris1=baca.nextInt();
        setBaris(baris1);
    }
    public void setBaris(int baris){
    this.baris1=baris;
    }    
    public int getBaris(){
        return this.baris1;

    }
}
