# RyAlightM

Project Android starter untuk aplikasi yang berisi dua fitur utama:
- Auto Gambar Vector
- Lyrics Teks Otomatis

## Struktur
- `app/` = project Android
- `app/src/main/java/com/reyzanz/ryalightm/` = kode utama
- `app/src/main/res/` = resource Android

## Fitur MVP yang sudah dibuat
- UI tab untuk Auto Gambar Vector
- UI tab untuk Lyrics Teks Otomatis
- Pilihan bahasa dan mode lyric
- Generasi XML mock untuk Alight Motion
- Download button UI

## Cara buka di Android Studio
1. Buka Android Studio
2. Pilih `Open` lalu pilih folder `RyAlightM`
3. Tunggu Gradle sync selesai
4. Jalankan aplikasi di emulator atau HP Android

## Catatan
Ini adalah versi starter / MVP cepat. Fitur AI object segmentation dan timing lyric yang presisi tinggi butuh integrasi model tambahan, seperti:
- OpenCV / MediaPipe / segmentasi objek
- Whisper / Vosk untuk transkripsi audio
- alignment timing yang lebih akurat untuk per kata maupun per kalimat

## Nama aplikasi
`RyAlightM`
