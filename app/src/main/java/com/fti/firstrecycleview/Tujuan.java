package com.fti.firstrecycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Tujuan extends AppCompatActivity {

    private static String[] deskripsi = new String[] {"Kim Nam-joon (Hangul: 김남준; lahir 12 September 1994; umur 26 tahun),[2] atau dikenal juga sebagai RM (sebelumnya Rap Monster), adalah seorang idol rapper dan penyanyi sekaligus penulis lagu asal Korea Selatan. Dia adalah pemimpin dan rapper utama dari boy band asal Korea Selatan yaitu Bangtan Boys, yang dibentuk di bawah naungan Big Hit Entertainment.",
            "Kim Seok-jin (Hangul: 김석진; lahir 4 Desember, 1992), juga dikenal dengan nama panggungnya Jin, adalah penyanyi dan penulis lagu dari Korea Selatan.[1][2] Dia adalah member tertua dan vokalis dari boygrup di Korea Selatan, BTS.[2] Sebagai seorang penulis lagu, dia mempunyai lima lagu terakreditasi namanya oleh Korea Music Copyright Association.[3]",
            "Min Yoon-gi (lahir 9 Maret 1993; umur 28 tahun; Hangul: 민윤기), lebih dikenal sebagai Suga, adalah seorang rapper, penyanyi, penulis lagu, dan produser rekaman. Ia adalah anggota dari grup idola pria Korea Selatan, BTS, yang dikelola oleh Big Hit Entertainment. Pada bulan Agustus 2016, ia merilis album solo pertamanya berupa mixtape yang bertajuk Agust D, dengan menggunakan nama Agust D.",
            "Jung Ho-seok (Hangul: 정호석; lahir 18 Februari 1994; umur 27 tahun), lebih dikenal dengan nama \"J-Hope\", adalah seorang rapper, penari, penyanyi, penulis lagu, dan produser rekaman dari Korea Selatan. Pada tahun 2013, J-Hope memulai debutnya sebagai anggota boy band dari Korea Selatan BTS, dikelola di bawah Big Hit Entertainment. Sebagai salah satu komposer utama untuk grup, ia memiliki 77 lagu yang terakreditasi atas nama-nya oleh Korea Music Copyright Association.\n" +
                    "\n" +
                    "J-Hope merilis mixtape pertamanya, Hope World, di seluruh dunia pada tanggal 1 Maret 2018. Album ini diterima dengan sambutan positif, dan debutnya di peringkat 63 membuatnya menjadi artis solo K-pop tertinggi di Billboard 200.",
            "Park Ji-min (Hangeul: 박지민[1]; lahir 13 Oktober 1995; umur 25 tahun) atau dikenal dengan nama panggung Jimin adalah salah satu anggota BTS atau Bangtan Sonyeondan yang berasal dari Korea Selatan, dengan posisi vokalis (lead vocal) dan penari utama (main dancer)[2] yang berada dibawah naungan agensi Big Hit Entertainment.",
            "Kim Tae-hyung (Hangul: 김태형,[2] Chinese: 金泰亨;Jīn Tàihēng, Japan: キム テヒョン;Kimu Tehyon, lahir di Daegu, 30 Desember 1995; umur 25 tahun) lebih dikenal dengan nama panggungnya V, adalah penyanyi, penulis lagu, dan aktor asal Korea Selatan. Ia merupakan anggota dari grup vokal pria Korea Selatan, BTS.[3]",
            "Jeon Jeong-guk (Hangeul: 전정국;lahir 1 September 1997; umur 23 tahun) atau dikenal dengan nama panggung Jungkook adalah seorang penyanyi dan anggota boy band Korea Selatan yaitu BTS atau Bangtan Boys yang dibentuk di bawah naungan Big Hit Entertainment pada tahun 2013[2]. Posisinya adalah main vocalist (vokalis utama), lead dancer (penari), sub-rapper, dan center."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan);
        MemberModel memberModel = null;
        ArrayList<MemberModel> list = new ArrayList<>();
        for (int i = 0; i <deskripsi.length; i++) {
            memberModel = new MemberModel();
            memberModel.setDeskripsi(deskripsi[i]);
            list.add(memberModel);
        }
    }
}