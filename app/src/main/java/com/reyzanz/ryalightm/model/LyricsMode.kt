package com.reyzanz.ryalightm.model

enum class LyricsMode(val label: String) {
    PER_WORD("Perkata"),
    PER_SENTENCE("Perkalimat")
}

enum class LanguageOption(val label: String, val description: String) {
    AUTO_DETECT("Auto Deteksi Bahasa", "Deteksi otomatis bahasa dari audio"),
    CHINA("China", "Teks China"),
    JAPAN("Jepang", "Teks Jepang"),
    KOREA("Korea", "Teks Korea"),
    INDONESIA("Indonesia", "Teks Indonesia"),
    MALAYSIA("Malaysia", "Teks Malaysia"),
    FILIPINA("Filipina", "Teks Filipina"),
    VIETNAM("Vietnam", "Teks Vietnam"),
    ENGLISH_BRITISH("Inggris British", "Teks British English"),
    ENGLISH_USA("Amerika", "Teks American English"),
    RUSSIA("Russia", "Teks Rusia"),
    ARAB("Arab", "Teks Arab")
}
