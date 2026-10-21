package com.reyzanz.ryalightm.util

import com.reyzanz.ryalightm.model.LanguageOption
import com.reyzanz.ryalightm.model.LyricsMode

object XmlExporter {

    fun generatePhotoVectorXml(imageName: String): String {
        return """
            <AlightMotionProject version="1.0">
              <metadata>
                <title>Auto Vector Photo</title>
                <source>$imageName</source>
                <group id="1" name="Generated Vector" />
              </metadata>
              <layers>
                <group id="1" name="background">
                  <layer type="image" name="background" source="background.png" />
                </group>
                <group id="2" name="table">
                  <layer type="image" name="table" source="table.png" />
                </group>
                <group id="3" name="chair">
                  <layer type="image" name="chair" source="chair.png" />
                </group>
                <group id="4" name="water">
                  <layer type="image" name="water" source="water.png" />
                </group>
                <group id="5" name="sun">
                  <layer type="image" name="sun" source="sun.png" />
                </group>
              </layers>
            </AlightMotionProject>
        """.trimIndent()
    }

    fun generateLyricsXml(
        audioName: String,
        mode: LyricsMode,
        language: LanguageOption,
    ): String {
        val lyricItems = listOf(
            "Lagu", "yang", "indah", "ini", "membawa",
            "aku", "ke", "masa", "lalu", "dan",
            "masa", "depan"
        )

        val lyricsXml = lyricItems.joinToString(separator = "\n") { item ->
            val start = (lyricItems.indexOf(item) * 1200L)
            val end = start + 1200L
            "    <text start=\"$start\" end=\"$end\" mode=\"${mode.label}\" language=\"${language.label}\">$item</text>"
        }

        return """
            <AlightMotionLyrics>
              <metadata>
                <title>Auto Lyrics</title>
                <audio>$audioName</audio>
                <mode>${mode.label}</mode>
                <language>${language.label}</language>
              </metadata>
              <lyrics>
            $lyricsXml
              </lyrics>
            </AlightMotionLyrics>
        """.trimIndent()
    }
}
