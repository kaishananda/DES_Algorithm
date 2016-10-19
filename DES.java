/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package des_encrypt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Kelompok Destriyani, Ahmad Raf Sanjani, Agung Yulianto, Ardha Sena, Kaishananda Dwi .T, Rizki Dharmawan Pohan
 */
public class DES {
    public BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    public String message;
    public String key;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        DES callDes = new DES();//membuat instance dari kelas DES agar dapat dipanggil
        Encrypt callEncrypt = new Encrypt();//membuat instance dari kelas Encrypt agar dapat dipanggil
       
        callDes.Input();//Memanggil Input pada kelas DES
        callEncrypt.SubKeyFind(callDes.key);//Memanggil SubkeyFind pada kelas SubKey dengan mengirim variable key untuk diproses agar dapat mendapatkan subkey
        callEncrypt.EncryptMessage(callDes.message, callDes.key);//Memanggil EncrypMessage pada kelas Encrypt dengan mengirim variable key dan message untuk diproses agar dapat mendapatkan encrypt dan decrypt pesan
        //Pesan akan langsun di decrypt karena jika hasil di copy maka java tidak mengenali input yang dimasukkan
        
    }
    void Input()throws Exception{
        System.out.print("Silahkan masukkan pesan yang ingin di encrypt : ");message = input.readLine();
        /*Pada baris di bawah ini berfungsi untuk memeriksa apakah input merupakan kelipatan dari 8, jika tidak maka akan ditambahkan spasi
          hingga jumlahnya menjadi kelipatan 8, karena DES akan memproses data sebesar 64-bit perblok dimana 64-bit = 8 karakter.
        */
        while(message.length()%8 != 0){
            message = message.concat(" ");
        }
        System.out.print("Silahkan masukkan key yang inginkan(8) : ");key = input.readLine();
        while(key.length() != 8){//perintah ini berguna untuk memeriksa apakah input key sudah sepanjang 8 karakter
            System.out.print("Key harus terdiri dari 8 karakter : ");key = input.readLine();
        }
    }
}