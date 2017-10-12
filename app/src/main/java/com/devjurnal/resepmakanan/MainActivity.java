package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel
        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();



        // TODO 5. Masukkan data ke List
        for (int i=0; i< 5; i++) {
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Donat Panggang Labu Kuning");
            resep1.setPoster("https://selerasa.com/images/Kue-Basah/donat-labu-panggang.jpg");
            resep1.setSummary("Hidangan ini akan cukup mudah untuk anda olah dan dipraktikan di rumah. " +
                    "Betapa tidak, resep kali ini telah kami rangkum sesederhana mungkin sehingga mampu memberikan sajian " +
                    "yang mudah untuk ditiru.");
            resep1.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan : 75 menit\n" +
                    "Memasak : 10 menit\n" +
                    "Total : 85 Menit\n" +
                    "\n" +
                    "Bahan-Bahan:\n" +
                    "\n" +
                    "500 gram tepung terigu\n" +
                    "minyak goreng untuk menggoreng\n" +
                    "175 ml susu cair dingin\n" +
                    "125 gram labu kuning\n" +
                    "50 gram gula pasir\n" +
                    "1 sendok teh ragi instan\n" +
                    "2 kuning telur\n" +
                    "100 gram tepung terigu protein sedang\n" +
                    "1 putih telur\n" +
                    "2 tetes pewarna kuning\n" +
                    "50 gram mentega tawar\n" +
                    "1/2 sendok teh garam\n\n" +
                    "Bahan Biang Untuk Donat:\n" +
                    "80 ml air hangat\n" +
                    "1 sendok teh ragi instan\n" +
                    "1 sendok teh gula pasir\n\n" +
                    "Bahan Toping Donat:\n" +
                    "\n" +
                    "100 gram gula pasir\n" +
                    "150 gram white cooking chocolate\n" +
                    "150 ml susu cair\n" +
                    "Persiapan Donat Panggang Labu Kuning:\n" +
                    "\n" +
                    "Hal pertama silahkan lakukan dengan mempersiapkan peralatan yang akan dibutuhkan untuk membuat adonan donat. Beberapa peralatan seperti halnya baskom, loyang, beberapa wadah dan sebuah kocokan akan membantu anda untuk dapat membuat adonan donat dengan lebih mudah dan lebih praktis. Untuk itu, maka sebaiknya silahkan persiapkan semua peralatan yang disebutkan diatas agar mempermudah anda dalam membuat adonan.\n" +
                    "Bila sudah selesai silahkan lanjutkan dengan mengupas kulit labu kuning dengan menggunakan pisau sampai bersih dan merata. Setelah itu, potong-potong labu dengan menggunakan pisau.\n" +
                    "Bawa labu ke tempat cucian untuk kemudian dibersihkan secara merata sampai kotoran dan kuman yang ada pada labu bisa dihilangkan secara merata.\n" +
                    "Kemudian masukkan potongan labu kuning dalam kukusan dan kukus secara merata hingga semua bahan ini berubah teksturnya menjadi lebih lembut dan matang secara merata.\n" +
                    "Angkat bila sudah empuk dan matang, lalu haluskan dengan menggunakan garpu atau sendok sampai teksturnya benar-benar seperti puree. Setelah itu, sisihkan sementara.\n" +
                    "Lanjutkan dengan melelehkan margarin dalam wajan. Caranya masukkan margarin kedalam wajan dan nyalakan api yang sedang untuk kemudian diamkan bahan ini sampai meleleh secara merata.\n\n" +
                    "Cara Membuat Adonan:\n"+
                    "\n" +
                    "Untuk membuat adonan terlebih dahulu silahkan buat bahan biangnya. Caranya aduk rata semua bahan biang dengan menggunakan sendok. Lalu diamkan bahan ini secara merata selama kurang lebih 15 menit sampai mengembang.\n" +
                    "Setelah itu, campurkan bahan-bahan kering dan bahan basah seperti halnya tepung terigu, labu, gula pasir dan juga ragi instan. Aduk-aduk dengan menggunakan kocokan dan bila sudah mulai tercampur silahkan uleni dengan menggunakan tangan sampai tercampur. Masukkan pula bahan biang kedalamnya. Uleni merata.\n" +
                    "Masukkan campuran telur bersama dengan susu dingin dan juga pewarna sedikit demi sedikit secara merata sambil diuleni hingga bahan tersebut menjadi lebih lembut merata. Masukkan mentega kedalamnya bersama dengan garam. Aduk-aduk dan uleni bahan tersebut merata.\n" +
                    "Masukkan adonan dalam kantung plastik segitiga. Lalu semprotkan dalam cetakan tulban kecil yang telah diolesi dengan margarin. Setelah itu, diamkan selama kurang lebih 30 menit sampai mengembang merata.\n" +
                    "Oven selama 14 menit dibawah suhu 190 derajat sampai matang.\n" +
                    "Untuk membuat topping, silahkan gosongkan gula pasir dan tuangkan susu sedikit demi sedikit aduk merata dan matikkan api. Masukkan white cooking coklat aduk bahan ini sampai larut dan tercampur merata.");
            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Kue Bolu Gulung Batik Keju");
//
            resep2.setPoster("https://selerasa.com/images/Kue-Basah/kue-gulung-batik.jpg");
            resep2.setSummary("Betapa tidak, empuk dan gurihnya sajian membuat siapa saja ketagihan untuk mencicipinya. Nah, bagi anda yang ingin menyimak resep membuat sajian kue bolu gulung batik keju yang enak.");
            resep2.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 35 menit\n" +
                    "\n" +
                    " \n" +
                    "Memasak: 20 menit\n" +
                    "\n" +
                    "Total: 65 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "14 Porsi\n" +
                    "\n" +
                    "Bahan-Bahan yang Diperlukan Untuk Membuat Kue Bolu Gulung Batik Keju\n" +
                    "\n" +
                    "Bahan bahan Kue Bolu Gulung Batik Keju:\n" +
                    "\n" +
                    "100 gram margarin, dilelehkan\n" +
                    "3 putih telur\n" +
                    "1/2 sendok makan emulsifier (sp/tbm)\n" +
                    "60 gram tepung terigu\n" +
                    "8 kuning telur\n" +
                    "75 gram butter cream untuk olesan\n" +
                    "100 gram gula pasir\n" +
                    "10 gram tepung maizena\n" +
                    "10 gram susu bubuk\n" +
                    "1/4 sendok teh cokelat pasta\n" +
                    "125 gram keju cheddar parut untuk taburan\n" +
                    "\nMempersiapkan Bahan dan Alat\n" +
                    "\n" +
                    "Untuk yang pertama kali bisa dilakukan adalah dengan mempersiapkan beberapa peralatan yang akan digunakan untuk membuat kue. Beberapa peralatan tersebut diantaranya adalah mixer, oven, loyang, baskom untuk membuat adonan dan beberapa wadah yang akan digunakan untuk menampung adonan. Setelah peralatan ini dipersiapkan, maka akan lebih mudah untuk anda dapat membaut sajian adonan kue dengan lebih mudah.\n" +
                    "Nah, bahan pertama yang akan dipersiapkan adalah telur. Silahkan pisahkan tiga telur utuh untuk kemudian akan dipecahkan dengan perlahan. Siapkan dua wadah berbeda dan pecahkan telur lalu pisahkan antara kuning dan puithnya. Nah, disini kita hanya akan membutuhkan putih telur dari 3 butir telur. Sementara untuk kuning telur, anda akan membutuhkan sebanyak 8 kuning telur. Untuk itu, sisa kuning telur ini bisa didapatkan dari menyiapkan 5 telur lagi dan ambil bagian kuningnya saja, kemudian sisihkan sementara.\n" +
                    "Untuk bahan selanjutnya adalah keju. Silahkan siapkan wadah dna parut untuk mengolah keju. Sebelum dicampur ke kue, silahkan parut terlebih dahulu bahan ini secara merata sampai semua bagian keju diparut secara merata. Lalu sisihkan sementara\n" +
                    "Untuk tepung, silahkan kukur tepung dengan menggunakan timbangan dan ukur dengan takaran yang pas sesuai dengan takaran yang ada pada resep. Setelah itu, masukkan dalam wadah dan ayak dengan menggunakan saringan.\n" +
                    "Untuk margarin, silahkan ukur margarin dengan takaran yang pas. Lalu, siapkan wajan dan lelehkan bahan ini secara merata dengan menggunakan wajan sampai meleleh secara merata. Setelah itu, angkat dari wajan dan sisihkan sementara.\n" +
                    "\nCara Membuat Kue Bolu Gulung Batik Keju:\n" +
                    "\n" +
                    "Olesi terlebih dhaulu loyang ukuran 30x25x3 dengan menggunakan margarin secara merata sampai kebagian sudut dan pastikan jika semua bagain loyang terolesi dengan bahan ini. Setelah itu, sisihkan sementara dan taburi dengan menggunakan tepung terigu secara merata. Hal ini dimaksudkan agar kue yang akan dikeluarkan dari loyang tidak menempel pada loyang dan membuat kue sulit untuk dikeluarkan.\n" +
                    "Dalam baskom atau wadah, silahkan kocok beberapa bahan seperti telur, gula pasir dan juga emulsifier sampai mengembang dan berwarna pucat. Masukkan tepung terigu kedalamnya bersama dengan tepung maizena dan susuh bubu yang telah diayak sebelumnya. Aduk-aduk merata dan gunakan kecepatan tinggi.\n" +
                    "Ambil sebanyak 50 gram adonan kue dan masukkan dalam piping bag atau plastik segitiga, lalu masukkan pasta coklat kedalamnya dan aduk-aduk merata.\n" +
                    "Lalu tambahkan margarin yang telah dilelehkan dalam sisa adonan bahan dan aduk-aduk secara perlahan sampai semua bahan ini tercampur merata.\n" +
                    "Setelah itu, baru tuangkan adonan dalam loyang dan ratakan bagian atasnya dengan menggunakan spatula.\n" +
                    "Kemudian, semprot miring adonan coklat tadi dan tarik dengan menggunakan tusuk gigi dengan arah yang berlawanan sampai membentuk pola batik.\n" +
                    "Panggang dalam oven selama kurang lebih 20 menit dibawah suhu 190 derajat.");
            listResep.add(resep2);

            resep3.setJudul(" Nasi Kuning");
            resep3.setPoster("https://selerasa.com/images/nasi/Resep-Nasi-Kuning-Praktis.jpg");
            resep3.setSummary("Nasi kuning merupakan salah satu sajian nasi yang biasanya banyak disajikan ketika perayaan tertentu, baik itu hajatan, syukuran atau lain sebagainya. Selain itu, nasi kuning juga merupakan salah satu menu yang digemari untuk menu sarapan. Rasanya yang enak dengan menu pelengkap yang sehat sangat cocok dijadikan sebagai hidangan ketika pagi hari.");
            resep3.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 40 menit\n" +
                    "\n" +
                    "Memasak: 45 menit\n" +
                    "\n" +
                    "Total: 85 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "5 Porsi\n" +
                    "\n" +
                    "Bahan-Bahan yang Diperlukan Untuk Membuat Nasi Kuning\n" +
                    "\n" +
                    "Bahan Utama Nasi Kuning:\n" +
                    "\n" +
                    "1 liter beras\n" +
                    "3 lembar daun salam\n" +
                    "65 ml santan\n" +
                    "1 batang serai\n" +
                    "Air secukupnya\n" +
                    "\nBumbu Nasi Kuning:\n" +
                    "\n" +
                    "Garam secukupnya\n" +
                    "2 siung bawang merah\n" +
                    "1 ruas kunyit\n" +
                    "3 siung bawang putih\n" +
                    "Penyedap rasa secukupnya\n" +
                    "\n" +
                    "Menyiapkan Bahan Bahan:\n" +
                    "\n" +
                    "Langkah pertama kali yang harus anda lakukan yaitu mencuci atau membersihkan beras yang sudah anda siapkan. Cuci beras hingga benar-benar bersih atau hingga air cucian beras berwarna bening. Jika sudah, anda bisa menyisihkannya terlebih dahulu.\n" +
                    "Setelah itu, cuci serai dan daun salam. Lalu geprek serai yang sudah dicuci.\n" +
                    "Kupas bawang merah dan bawang putih. Lalu parut kunyit dan tambahkan air sedikit saja, saring dan ambil sarinya.\n" +
                    "Haluskan semua bumbu yang sudah anda siapkan." +
                    "\n"+
                    "Membuat Nasi Kuning:\n"+
                            "\n"+
                    "Setelah semua bahan-bahan yang dibutuhkan siap olah, anda bisa langsung membuat nasi kuning.\n" +
                            "Siapkan alat-alat untuk membuat nasi kuning. Jika anda ingin lebih praktis, maka anda dapat membuat nasi kuning dengan menggunakan rice cooker atau magic com.\n" +
                            "Masukan beras yang sudah anda cuci ke dalam rice cooker. Kemudian, tambahkan bumbu yang sudah dihaluskan ke dalamnya. Tambahkan pula santan beserta air secukupnya.\n" +
                            "Setelah itu, tambahkan serai yang sudah digeprek bersama dengan daun salam. Tambahkan pula bumbu penyedap rasa secukupnya. Jika sudah, aduk-aduk beras hingga merata.\n" +
                            "Selanjutnya, nyalakan rice cooker dan tunggu beberapa saat hingga nasi berubah warna menjadi kuning dan matang.");
            listResep.add(resep3);
            resep4.setJudul("Cheese Lemon Curd");
            resep4.setPoster("https://selerasa.com/images/cheeselemoncurd.jpg");
            resep4.setSummary("Resep Cheese Lemon Curd, Dessert Mewah yang Wah.");
            resep4.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 15 menit\n" +
                    "\n" +
                    "Memasak: 20 menit\n" +
                    "\n" +
                    "Total: 35 menit\n" +
                    "\n" +
                    "Bahan yang Diperlukan Untuk Membuat Cheese Lemon Curd\n" +
                    "\n" +
                    "Bahan Base\n" +
                    "\n" +
                    "100 gram biskuit cracker (misal Roma Cracker)\n" +
                    "2 sendok makan mentega tawar\n" +
                    "100 gram almon bubuk\n" +
                    "\n" +
                    "Bahan Lemon\n"+
                    "\n" +
                    "150 ml lemon jus\n" +
                            "1 sendok teh kulit jeruk lemon\n" +
                            "100 gram vla instan\n"+
                    "\n"+
                    "Bahan Buah\n"+
                    "\n"+
                    "100 gram blueberry\n" +
                            "100 gram stoberi\n" +
                            "Bahan Cream Cheese:\n" +
                            "300 gram mascarpone cheese\n" +
                            "1/2 sendok teh pasta vanila\n" +
                            "125 gram susu kental manis\n"+
                    "\nPersiapan Cheese Lemon Curd\n" +
                    "\n" +
                    "Untuk yang pertama kali ini kita akan lakukan metode persiapan untuk membuat sajian dessert kali ini. Persiapan menjadi langkah awal yang penting sebab ada beberapa bahan pada resep yang akan dapat anda olah terlebih dahulu sebelum anda mencampurnya menjadi hidangan yang nikmat dan lezat.\n" +
                    "Bahan pertama yang perlu kita persiapkan adalah crackers. Bahan ini perlu anda haluskan secara merata namun masih terlihat tekstur dari cracker yang kasar. Untuk itu, guna membantu anda meremas crackers maka gunakan rolling pin dan masukkan crackers kedalam plastik. Lalu haluskan secara merata. Setelah itu, sisihkan sementara.\n" +
                    "Setelah selesai dengan cracker, selanjutnya silahkan siapkan sebuah wajan datar. Lalu gunakan api sedang untuk bahan kali ini. Masukkan mentega atau margarin kedalamnya dan lelehkan sajian ini secara merata sampai leleh.\n" +
                    "Kemudian, sangrai almond bubuk dengan menggunakan wajan yang lain. Namun gunakan api yang kecil pada saat anda menyangrai sajian kali ini. Lalu setelah itu, sisihkan sementara dalam wadah saat sajian ini sudah matang.\n" +
                    "Bahan terakhir yang perlu dipersiapkan adalah pada bahan buah. Untuk strawberry silahkan potong atau belah sajian buah ini menjadi 4 bagian secara merata. Lalu masukkan dalam wadah dan sisihkan sementara sebelum anda mengolah sajian ini dengan bahan-bahan lainnya.\n" +
                    "\n"+
                    "Cara Membuat Cheese Lemon Curd\n"+
                    "\n" +
                    "Untuk membuat sajian kali ini kita akan awali dengan membuat basenya terlebih dahulu. Untuk itu, silahkan persiapkan bahan base secara merata.\n" +
                    "Lalu siapkan sebuah wadah dan masukkan biskuit bersama dengan lemon dan mentega tawar. Aduk-aduk semua bahan ini secara merata sampai tercampur dan teraduk.\n" +
                    "Setelah itu, silahkan masukkan bahan ini dalam gelas-gelas kecil yang cantik. Lalu tata dengan perlahan dan sisihkan bahan ini secara merata.\n" +
                    "Setelah itu, untuk membuat sajian lemon dapat anda lakukan dengan menyiapkan sebuah wadah yang lain. Lalu tambahakn kedalamnya vla, lemon jus dan juga kulit lemon yang anda parut.\n" +
                    "Lalu aduk bahan lemon tersebut dengan menggunakan mixer sampai mengembang dan berubah menjadi lebih lembut secara merata.\n" +
                    "Selanjutnya silahkan tuangkan sajian ini diatas base yang sudah anda masukkan kedalam gelas sebelumnya.\n" +
                    "Tata buah-buahan diatasnya dan sisihkan sementara sebelum anda akan melanjutkannya dengan cara yang lainnya.\n" +
                    "Sementara itu, untuk membuat cheese kali ini anda bisa mengocok mascarpone didalam sebuah wadah lalu tambahkan kedalamnya susu kental manis dan pasta vanila. Untuk selanjutnya aduk-aduk semua bahan ini secara merata hingga tercampur.\n" +
                    "Terakhir, silahkan tuangkan sajian ini diatas buah dan sebelum disajikan anda akan dapat memasukkannya dalam lemari es untuk didinginkan sementara sebelum dinikmati oleh keluarga.");
            listResep.add(resep4);

        }
        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        recycler.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

    }
}
