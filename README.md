# RyAlightM

Aplikasi Android starter untuk fitur:
- Auto Gambar Vector
- Lyrics Teks Otomatis

## Status saat ini
Versi yang sudah dibuat saat ini adalah MVP cepat dengan:
- 2 tab utama
- formulir pemilihan gambar/audio
- pilihan bahasa
- mode lirik Perkata / Perkalimat
- generator XML mock untuk Alight Motion
- tombol Download

## Fitur yang direncanakan lanjutan
1. Pendeteksi objek otomatis pada foto
2. Segmentasi objek per layer (background, meja, kursi, air, matahari, dll)
3. Transkripsi audio ke teks dengan timing per kata / per kalimat
4. Deteksi bahasa otomatis dan mapping ke model bahasa yang lebih akurat
5. Export XML yang lebih rapi dan dapat didownload sebagai file
6. Build APK final untuk Android

## Struktur proyek
- `app/` = module Android utama
- `app/src/main/java/` = kode Compose + data model + export logic
- `app/src/main/res/` = tampilan dan ikon aplikasi

## Cara menjalankan
1. Buka folder `RyAlightM` di Android Studio.
2. Tunggu Gradle sync selesai.
3. Jalankan aplikasi di emulator atau perangkat Android.

## Catatan penting
Versi ini masih berupa starter project yang siap dikembangkan lebih lanjut. Untuk hasil yang benar-benar presisi seperti yang Anda inginkan, perlu integrasi ke model AI seperti:
- segmentasi objek vision
- speech-to-text dengan timestamp akurat
- alignment timing lirik
- export XML yang cocok dengan struktur Alight Motion

