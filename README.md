# DES_Algorithm
Implementasi Algoritma DES untuk mengenkripsi data dengan menggunakan bahasa pemrograman JAVA

## Kelompok
1.Destriyani
<br>2.Ahmad Raf Sanjani
<br>3.Agung Yulianto
<br>4.Ardha Sena
<br>5.Kaishananda Dwi . T
<br>6.Rizki Dharmawan Pohan

##Deskripsi Program
Program terdiri dari beberapa kelas, yaitu DES.java, Ecnrypt.java, Decrypt.java dan SubKey.java. Kelas utama dalam program ini adalah DES.java dan kelas yang lain adalah kelas tambahan yang fungsinya sesuai namanya. Encrypt.java untuk mengenkripsi, Decrypt.java untuk mendekripsi dan SubKey.java menampung tabel table yang dibutuhkan dalam bentuk array. Penjelasan method method yang terdapat di dalam kelas sudah ada di dalam program.

##Penggunaan Program
1.Jalankan program di dalam kelas DES.java
<br>2.Masukan input berupa string (Angka dan Huruf, Panjang Bebas)
<br>3.Masukan key berupa string (Angka dan Huruf, harus sebanyak 8 karakter)
<br>4.Hasil akan menampilkan hasil enkripsi dan dekripsi secara langsung. Selain itu akan ditampilkan dari setiap hasil dari proses proses yang terjadi

##Kontribusi
Dalam program ini, kami membuatnya secara bersama - sama dan bertahap. Dari awal pembuatan, kami selalu berusaha membuat nya bersama sama (walaupun hanya di satu laptop). Karena tugas implementasi ini sudah di disuruh dari pertemuan sebelumnya, maka program ini sebenarnya sudah jadi, namun belom sesuai yang diharapkan, salah satunya masalah inputan (Plaintext) yang belum bisa berupa string. Nah secara garis besar peran saya sangat terlihat pada bagian ini, lebih tepatnya membuat coding-an untuk membuat inputan berupa string. Coding-an ini saya masukan kedalam kelas DES.java . Coding-an tersebut saya buat dengan beberapa referensi yang menunjukan bagaimana cara merubah string menjadi biner 0 dan 1. Selain itu referensi tentang DES itu sendiri yang menunjukan kalau Plaintext nya harus berupa deret biner sebanyak 64bit. Itu berarti harus 8 byte, berarti harus 8 karakter. Karakter yang saya gunakan adalah karakter yang ada di tabel ASCII, dan untuk masalah 8 karakter itu, jika inputan lebih dari 8 karakter maka akan dikelompokan menjadi beberapa kelompok dimana masing - masing kelompok berisi 8 karakter. Dan jika ada kelompok yang isinya kurang dari 8 karakter maka saya membuat agar di kelompok tersebut ditambahkan karakter spasi sebanyak yang dibutuhkan sehingga jumlahnya menjadi 8 karakter. Karakter spasi saya pilih karena karakter tersebut tidak terlihat, sehingga saat proses decrypt hasilnya seperti tidak ditambahkan apapun. 
