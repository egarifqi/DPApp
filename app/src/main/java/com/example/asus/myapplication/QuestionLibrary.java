package com.example.asus.myapplication;

/**
 * Created by asus on 10/27/2017.
 */

public class QuestionLibrary {

    private String mQuestions [] = {
		/*0*/"Jika resultan gaya yang bekerja pada sebuah benda sama dengan nol, maka: <br> <br> \n \n" +
            "(1)Benda tidak akan dipercepat <br>\n" +
            "(2) Benda selalu diam <br>\n" +
            "(3) Perubahan kecepatan benda nol <br>\n" +
            "(4) Benda tidak mungkin bergerak lurus beraturan <br>\n" +
            "Pernyataan yang benar ditunjukkan oleh nomor …",
		/*1*/"Hukum II Newton dapat disimpulkan ... <br> <br> \n \n" +
            "A. Percepatan benda berbanding terbalik dengan massa benda <br> \n" +
            "B. Percepatan benda berbanding lurus dengan massa benda <br>\n" +
            "C. Resultan gaya merupakan hasil kali massa dengan gaya <br>\n" +
            "D. Resultan gaya merupakan hasil bagi antara massa dengan percepatan <br>\n" +
            "E. Percepatan benda berbanding terbalik dengan resultan gaya <br>\n",
		/*2*/"Saat kita mendorong tembok dengan gaya sebesar F, tembok tidak bergerak karena . . . .<br><br>\n \n"+
            "A. Tembok mengubah gaya yang kita berikan menjadi gaya vertikal.<br>\n" +
            "B. Tembok memberikan gaya memebentuk sudut 90<sup>o</sup> terhadap F.<br>\n" +
            "C. Tembok memberikan gaya dengan besar yang sama, namun berlawanan arah.<br>\n" +
            "D. Tembok memberikan gaya dengan besar yang sama dan searah.<br>\n" +
            "E. Tidak dapat ditentukan.",
		/*3*/"Berikut adalah bunyi Hukum III Newton ….<br><br>\n\n" +
            "A. Sebuah benda yang diam akan tetap diam atau benda yang bergerak lurus akan tetap bergerak lliris beraturan jika resultan gaya yang bekerja pada benda tersebut sama dengan nol<br>\n" +
            "B. Jika benda A mengerjakan gaya pada benda B, benda B juga mengerjakan gaya sama besar tetapi berlawanan arah pada benda A<br>\n" +
            "C. Percepatan yang ditimbulkan oleh gaya yang bekerja pada sebuah benda berbanding lurus dengan besar gaya yang bekerja padanya dan berbanding terbalik dengan massa benda.<br>\n" +
            "D. Bila tidak ada gaya luar yang bekerja pada benda, jumlah energi potensial dan energi kinetiknya adalah tetap.<br>\n" +
            "E. Sebuah benda dikatakan bergerak terhadap benda lain atau terhadap suatu titik acuan tertentu jika posisinya berubah menurut waktu",
		/*ADA5GAMBAR4*/"Dari kelima benda di atas, percepatan paling besar terjadi pada benda...",
		/*5*/"Pada sebuah benda bermassa m terjadi percepatan sebesar a oleh gaya F. Jika massa benda menjadi 3m dan gaya dijadikan 2F, percepatan yang terjadi sebesar ….",
		/*6*/"Seseorang bergerak dalam kendaraan yang sedang bergerak, tiba-tiba kendaraan tersebut direm hingga berhenti, maka orang tersebut akan mendapatkan gaya dorong ke arah depan hal ini sesuai dengan hukum …",
		/*7*/"Sewaktu berada di dalam lift  yang diam, berat lift adalah 500 N. Sewaktu lift dipercepat keatas gaya normalnya menjadi 750 N. jika g = 10 m/s<sup><small>2</small></sup> maka percepatan lift adalah … m/s<sup><small>2</small></sup>",
		/*GAMBAR8*/"Dua benda m1 = 2 kg dan m2 = 3 kg terletak pada bidang datar yang licin. Kedua benda dihubungkan dengan tali kemudian ditarik dengan gaya F = 10√3 N seperti gambar di atas. Besar tegangan tali T antara kedua benda adalah",
		/*GAMBAR9*/"Perhatikan gambar diatas! Gesekan tali dan katrol diabaikan.Jika m1 = 5 kg, g = 10 m/s<sup><small>2</small></sup> dan benda m1 bergerak ke bawah dengan percepatan 2,5 m/s<sup><small>2</small></sup> maka massa benda m2 adalah…",
		/*10*/"Sebuah benda massanya 20 kg bergerak dengan kecepatan 8 m/s. Oleh karena gaya yang bekerja berlawanan arah dengan gerak benda, kecepatan benda menjadi 4 m/s setelah menempuh 12 m. Gaya yang bekerja pada benda tersebut adalah…",
		/*11*/"Benda bermassa 1 kg terletak di atas tanah ditarik ke atas dengan gaya 15 N selama 2 detik, lalu dilepaskan. Tinggi maksimum benda tersebut adalah…",
		/*GAMBAR12*/"Sebuah balok ditahan dipuncak bidang miring. Ketika dilepas balok meluncur tanpa gesekan sepanjang bidang miring. Kecepatan balok ketika mencapai dasar bidang miring adalah…",
		/*GAMBAR13*/"Perhatikan gambar!" +
            "Jika koefisien gesek kinetis 0,1 dan percepatan gravitasi 10 m/s<sup><small>2</small></sup> maka gaya yang harus diberikan agar sistem bergerak ke kiri dengan percepatan 2 m/s<sup><small>2</small></sup> adalah…",
		/*14*/"Perhatikan contoh fenomena di bawah ini! <br>\n" +
            "(1)	Pada saat kita mengerem sepeda motor tubuh kita akan terdorong ke depan<br>\n" +
            "(2)	Pada saat benda jatuh bebas, benda diperlambat oleh tekanan udara<br>\n" +
            "(3)	Orang mendorong gerobak bakso dengan kekuatan tertentu maka gerobak tersebut akan bergerak dengan percepatan tertentu<br>\n" +
            "(4)	Saat mendayung perahu ke belakang maka kita akan bergerak ke depan<br>\n" +
            "(5)	Saat kita memukul tembok, kita akan merasakan sakit.<br>\n" +
            "Secara berurutan contoh penerapan Hukum I, II, dan III  Newton dalam kehidupan sehari-hari adalah …. ",
		/*15*/"Menurut hukum Newton kedua, sebuah benda yang mengalami percepatan harus memiliki …. yang bekerja padanya.",
		/*16*/"Suatu gaya total yang diberikan pada sebuah benda mungkin menyebabkan …. Bertambah",
		/*17*/"Sekarang jika Anda mendorong dengan pelan tetapi dengan gaya yang konstan selama selang waktu tertentu, Anda akan mempercepat gerobak tersebut dari keadaan diam sampai laju tertentu yaitu 3 km/jam. Jika anda mendorong dengan gaya dua kali lipat, anda akan mendapatkan bahwa gerobak tersebut mencapai 3 km/jam dalam waktu … kali sebelumnya",
		/*18*/"Sekarang jika Anda mendorong dengan pelan tetapi dengan gaya yang konstan selama selang waktu tertentu, Anda akan mempercepat gerobak tersebut dari keadaan diam sampai laju tertentu yaitu 3 km/jam. Jika anda mendorong dengan gaya dua kali lipat, maka percepatannya menjadi … kali lipat",
		/*19*/"Jika anda menggandakan gaya, percepatan akan menjadi …. Kali lipat",
		/*20*/"Ketika gaya sama, makin besar massa maka makin …. Percepatan",
		/*21*/"Jika anda mendorong gerobak yang kosong dengan gaya yang sama seperti anda mendorong gerobak yang penuh, anda akan menemukan bahwa gerobak yang penuh mempunyai … yang lebih kecil",
		/*22*/"Satuan gaya disebut …",
		/*23*/"Seekor kuda menarik kereta belanja, martil mendorong paku, magnet menarik penjepit kertas. Ini adalah contoh dari….",
		/*24*/"Ketika suatu benda memberika gaya pada benda kedua, benda kedua tersebut memberikan gaya yang sama besar tetapi berlawanan arah terhadap benda yang pertama. Ini adalah bunyi dari hukum…",
		/*25*/"Gaya gravitasi atau gaya berat bekerja pada sebuah benda ketika…",
		/*26*/"Ketika gaya kontak tegak lurus terhadap permukaan kontak, gaya itu biasa disebut …",
		/*27*/"Gaya total pada sebuah benda dalam keadaan diam adalah …",
		/*28*/"Ketika sebuah benda bergerak sepanjang permukaan yang kasar, gaya gesekan kinetik bekerja dengan berlawanan arah terhadap …",
		/*29*/"'Jumlah semua gaya yang bekerja pada sistem sama dengan massa total sistem dikalikan dengan percepatan pusat massanya'. Ini merupakan hukum ….",
		/*30*/"Saat benda dalam mobil yang berjalan tiba-tiba direm, maka benda tersebut akan terdorong…",
		/*31*/"Sebuah balok bermassa 4 kg didorong dengan gaya 5 Newton. Berapa percepatan balok tersebut…  m/s<sup><small>2</small></sup>",
		/*32*/"Berat sebuah benda adalah 150 N, jika percepatan gravitasi yang dialami benda 10 m/s<sup><small>2</small></sup>, maka massa beda adalah ….",
		/*33*/"Sebuah benda yang massanya 1,5 kg ditarik keatas dengan percepatan 2 m/s<sup><small>2</small></sup>. Besarnya gaya yang bekerja pada benda adalah …",
		/*34*/"Seorang astronot melakukan perjalanan dari bumi ke bulan. Setelah sampai di bulan, maka yang akan terjadi adalah …<br><br>\n \n" +
            "A. Massa tetap sedangkan beratnya berubah<br>\n" +
            "B. Massa dan beratnya berubah<br>\n" +
            "C. Massa berubah sedangkan beratnya tetap<br>\n" +
            "D. Massa dan beratnya tetap<br>\n" +
            "E. Massa berubah dan berbanding lurus dengan beratnya",
		/*35*/"Pernyataan berikut yang berhubungan dengan hukum I Newton adalah <br><br>n\n" +
            "A. Saat mobil digas, badan penumpang terdorong ke belakang<br>\n" +
            "B. Penerjun payung bergerak ke bawah<br>\n" +
            "C. Sebuah sepeda yang direm sehingga berhenti<br>\n" +
            "D. Berat benda di bumi lebih besar daripada di bulan<br>\n" +
            "E. Ketika memukul tembok, kamu akan merasakan sakit",
		/*36*/"Hukum I Newton sering disebut sebagai hukum …",
		/*37*/"Berdasarkan hukum I Newton, jika resultan gaya yang bekerja pada sebuah benda adalah nol, kemungkinan benda tersebut akan …",
		/*38*/"Seekor ikan bermassa 1 kg tergaantung pada tali kail. Jika g = 10 m/s<sup><small>2</small></sup>, besar tegangan tali adalah ….",
		/*39*/"Sebuah bola dipengaruhi gaya tetap 5 N. Jika massa bola 0,5 kg, percepatan yang dialami bola adalah …  m/s<sup><small>2</small></sup>",
		/*40*/"Seorang nelayan berhasil memancing ikan bermassa 2 kg. nelayan tersebut menggunakan senar pancing yang akan putus jika tegangannya melebihi 6 N. percepatan maksimum untuk menarik ikan agar senar tidak putus adalah …  m/s<sup><small>2</small></sup>",
		/*41*/"Sebuah batu kembali diam di dasar sumur. Kemudian, batu diangkat menggunakan tambang dengan gaya 30 N. setelah 2 sekon, batu mencapai ketinggian 10 m. jika g = 10 m/s<sup><small>2</small></sup>, massa batu tersebut adalah….",
		/*42*/"Pada bidang miring, gaya normal ….<br><br>\n\n" +
            "A. Sama dengan dari berat benda<br>\n" +
            "B. Lebih besar dari berat benda<br>\n" +
            "C. Lebih kecil dari berat benda<br>\n" +
            "D. Bisa lebih kecil atau lebih besar dari berat benda<br>\n" +
            "E. Bisa lebih kecil, sama, atau lebih besar dari berat benda.",
		/*43*/"Massa seorang astronot di bumi 60 kg. jika gaya gravitasi bulan 1/6 gaya gravitasi bumi, maka berat astronot di bulan adalah …",
		/*44*/"Seseorang bermassa 60 kg berada di lift yang bergerak. Ketika di dalam lift beratnya menjadi 720 N. besar percepatan dan arah gerak lift adalah …   m/s<sup><small>2</small></sup> …",
		/*45*/"Leon dan Devan menarik sebuah meja dalam arah yang berlawanan. Leon menarik meja ke kanan dengan gaya 40 N sedangakan Devan menarik meja ke kiri dengan gaya 45 N. arah dan resultan gaya pada kasus tersebut adalah …",
		/*46*/"Sebuah benda dikenai dua gaya yang arahnya berlawanan. Gaya pertama 30 N ke kanan dan gaya kedua 10 N ke kiri. Jika massa benda tersebut adalah 10 kg, maka percepatan yang dialami oleh benda adalah …  m/s<sup><small>2</small></sup>",
		/*47*/"Berikut beberapa peristiwa sehari-hari <br>\n" +
            "1)	Tangan terasa sakit saat memukul dinding <br>\n" +
            "2)	Bagian ujung kaki terasa sakit saat menendang bola <br>\n" +
            "3)	Buah jatuh dari pohon bergerak jatuh bebas <br>\n" +
            "4)	Senapan terdorong ke belakang saat menembakkan peluru <br>\n" +
            "Peristiwa yang merupakan contoh dari hukum III Newton adalah …",
		/*48*/"Jika suatu benda diberi gaya 10 N mengalami percepatan 2 m/s<sup><small>2</small></sup>, maka percepatan benda jika gaya 25 N adalah …  m/s<sup><small>2</small></sup> ",
		/*49*/"Pada benda bermassa m, bekerja gaya F yang menimbulkan percepatan a. jika gaya dijadikan 2 F dan massa benda dijadikan ¼ m, maka percepatan yang ditimbulkan menjadi …",
    };

    private String mChoices [][] = {
		/*0*/{"(1), (2), dan (3)",
                "(1) dan (4)",
                "(2) dan (4)",
                "(4) saja",
                "(1), (2), (3), dan (4)"},
		/*1*/{"A",
                "B",
		        "C",
                "D",
                "E"},
		/*2*/{"A",
            "B",
            "C",
            "D",
            "E"},
		/*3*/{"A",
            "B",
            "C",
            "D",
            "E"},
		/*4*/{"(1)",
                "(2)",
                "(3)",
                "(4)",
                "(5)"},
		/*5*/{"4/3 a ",
                "6 a",
                "12 a",
                "2/9 a",
                "2/3 a"},
		/*6*/{"Gaya gerak",
                "Gravitasi Newton",
                "Newton I",
                "Newton II",
                "Newton III"},
		/*7*/{"5,0",
                "7,5",
                "10,5",
                "12,5",
                "15,0"},
		/*8*/{"4√3 N",
                "6 N",
                "3√3 N",
                "2√3 N",
                "3 N"},
		/*9*/{"0,5 kg",
                "1 kg",
                "1,5 kg",
                "2 kg",
                "3 kg"},
		/*10*/{"2 N",
                "4 N",
                "8 N",
                "20 N",
                "40 N"},
		/*11*/{"30 m",
                "15 m",
                "10 m",
                "5 m",
                "7,5 m"},
		/*12*/{"6 m/s",
                "8 m/s",
                "10 m/s",
                "12 m/s",
                "16 m/s"},
		/*13*/{"70 N",
                "90 N",
                "150 N",
                "250 N",
                "330 N"},
		/*14*/{"(1), (2), (3)",
                "(1), (2), (4)",
                "(1), (3), (4)",
                "(2), (1), (5)",
                "(2), (3), (4)"},
		/*15*/{"Gerak melingkar",
                "Kecepatan",
                "Kecepatan rata rata",
                "Gaya total",
                "Usaha"},
		/*16*/{"Kecepatan",
                "Gaya",
                "Daya",
                "Massa",
                "Berat"},
		/*17*/{"1/2",
                "1/4",
                "3",
                "2",
                "4"},
		/*18*/{"1/2",
                "1/4",
                "3",
                "2",
                "4"},
		/*19*/{"1/2",
                "1/4",
                "3",
                "2",
                "4"},
		/*20*/{"Tetap",
                "Kecil",
                "Besar",
                "Konstan",
                "Tinggi"},
		/*21*/{"Percepatan",
                "Massa",
                "Usaha",
                "Gaya gesek",
                "Gravitasi "},
		/*22*/{"Dyne",
                "Lb",
                "Atm",
                "Gram",
                "Newton"},
		/*23*/{"Gaya yang diberikan oleh benda lain",
                "Gaya gravitasi",
                "Gaya dorong",
                "Energy",
                "Usaha"},
		/*24*/{"Newton 2",
                "Newton 3",
                "Newton 1",
                "Kekekalan energy",
                "Kekekalan momentum"},
		/*25*/{"Benda tersebut melayang",
                "Benda tersebut mengapung",
                "Benda tersebut terjatuh",
                "Benda tersebut tenggelam",
                "Benda tersebut mempunyai massa jenis"},
		/*26*/{"Gaya normal",
                "Gaya gesek",
                "Gaya dorong",
                "Gaya kontak",
                "Gaya elastis"},
		/*27*/{"0 N",
                "100 N",
                "200 N",
                "400 N",
                "1000 "},
		/*28*/{"Gaya gravitasi",
                "Kecepatan benda",
                "Gaya sentripetal",
                "Gaya normal",
                "Massa benda"},
		/*29*/{"Hukum kekekalan",
                "Hukum II Newton",
                "Hukum kelembaman",
                "Hukum III Newton",
                "Hukum I Newton"},
		/*30*/{"Ke bawah",
                "Ke belakang",
                "Ke samping",
                "Ke depan",
                "Ke atas"},
		/*31*/{"1",
                "1,5",
                "1,25",
                "2",
                "2,5"},
		/*32*/{"10 kg",
                "15 kg",
                "20 kg",
                "25 kg",
                "30 kg"},
		/*33*/{"1,5 N",
                "2 N",
                "3 N",
                "3,5 N",
                "4 N"},
		/*34*/{"A",
            "B",
            "C",
            "D",
            "E"},
		/*35*/{"A",
            "B",
            "C",
            "D",
            "E"},
		/*36*/{"Kekekalan",
                "Aksi-reaksi",
                "Keseimbangan",
                "Kelembaman",
                "Momentum"},
		/*37*/{"Diam",
                "Bergerak lurus beraturan",
                "Bergerak lurus berubah beraturan",
                "Diam atau bergerak lurus beraturan",
                "Diam atau bergerak lurus berubah beraturan"},
		/*38*/{"5 N",
                "10 N",
                "15 N",
                "20 N",
                "25 N"},
		/*39*/{"10",
                "25",
                "5",
                "0,25",
                "1"},
		/*40*/{"20",
                "14",
                "7",
                "4",
                "3"},
		/*41*/{"1 kg",
                "2 kg",
                "3 kg",
                "5 kg",
                "6 kg"},
		/*42*/{"A",
            "B",
            "C",
            "D",
            "E"},
		/*43*/{"10 N",
                "50 N",
                "100 N",
                "300 N",
                "500 N"},
		/*44*/{"22 ke bawah",
                "22 ke atas",
                "12 ke atas",
                "2 ke bawah",
                "2 ke atas"},
		/*45*/{"85 N ke kanan",
                "5 N ke kanan",
                "85 N ke kiri",
                "5 N ke kiri",
                "Benda diam"},
		/*46*/{"5",
                "4",
                "3",
                "2",
                "1"},
		/*47*/{"1, 2 dan 3",
                "1, 2 dan 4",
                "2, 3 dan 4",
                "3 dan 4",
                "1 dan 3"},
		/*48*/{"3",
                "4",
                "5",
                "7",
                "8"},
		/*49*/{"1/4 a",
                "1 a",
                "4 a",
                "8 a",
                "16 a"},
    };

    private String mCorrectAnswer[] = {
		/*0*/"(1), (2), dan (3)",
		/*1*/"A",
		/*2*/"C",
		/*3*/"B",
		/*4*/"(2)",
		/*5*/"2/3 a",
		/*6*/"Newton I",
		/*7*/"5,0",
		/*8*/"6N",
		/*9*/"3 kg",
		/*10*/"40 N",
		/*11*/"10 m",
		/*12*/"10 m/s",
		/*13*/"330 N",
		/*14*/"(1), (3), (4)",
		/*15*/"Gaya total",
		/*16*/"Kecepatan",
		/*17*/"1/2",
		/*18*/"2",
		/*19*/"2",
		/*20*/"Kecil",
		/*21*/"Percepatan",
		/*22*/"Newton",
		/*23*/"Gaya yang diberikan oleh benda lain",
		/*24*/"Newton 3",
		/*25*/"Benda tersebut mempunyai massa jenis",
		/*26*/"Gaya normal",
		/*27*/"0 N",
		/*28*/"Kecepatan benda",
		/*29*/"Hukum II Newton",
		/*30*/"Ke depan",
		/*31*/"1,25",
		/*32*/"15 kg",
		/*33*/"3 N",
		/*34*/"A",
		/*35*/"A",
		/*36*/"Kelembaman",
		/*37*/"Diam atau bergerak lurus beraturan",
		/*38*/"10 N",
		/*39*/"10",
		/*40*/"3",
		/*41*/"2 kg",
		/*42*/"C",
		/*43*/"100 N",
		/*44*/"2 ke atas",
		/*45*/"5 N ke kiri",
		/*46*/"2",
		/*47*/"1, 2 dan 4",
		/*48*/"5",
		/*49*/"8 a",
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getChoice5(int a){
        String choice4 = mChoices[a][4];
        return choice4;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
