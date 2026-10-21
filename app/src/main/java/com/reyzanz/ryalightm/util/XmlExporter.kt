package com.reyzanz.ryalightm.util

import com.reyzanz.ryalightm.model.LanguageOption
import com.reyzanz.ryalightm.model.LyricsMode

object XmlExporter {

    fun generatePhotoVectorXml(imageName: String): String {
        return buildString {
            appendLine("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
            appendLine("<AlightMotionProject version=\"1.0\">")
            appendLine("  <metadata>")
            appendLine("    <title>Auto Vector Photo</title>")
            appendLine("    <source>$imageName</source>")
            appendLine("    <group id=\"1\" name=\"Generated Vector\" />")
            appendLine("  </metadata>")
            appendLine("  <layers>")
            appendLine("    <group id=\"1\" name=\"background\">")
            appendLine("      <layer type=\"image\" name=\"background\" source=\"background.png\" />")
            appendLine("    </group>")
            appendLine("    <group id=\"2\" name=\"table\">")
            appendLine("      <layer type=\"image\" name=\"table\" source=\"table.png\" />")
            appendLine("    </group>")
            appendLine("    <group id=\"3\" name=\"chair\">")
            appendLine("      <layer type=\"image\" name=\"chair\" source=\"chair.png\" />")
            appendLine("    </group>")
            appendLine("    <group id=\"4\" name=\"water\">")
            appendLine("      <layer type=\"image\" name=\"water\" source=\"water.png\" />")
            appendLine("    </group>")
            appendLine("    <group id=\"5\" name=\"sun\">")
            appendLine("      <layer type=\"image\" name=\"sun\" source=\"sun.png\" />")
            appendLine("    </group>")
            appendLine("    <group id=\"6\" name=\"landscape\">")
            appendLine("      <layer type=\"image\" name=\"landscape\" source=\"landscape.png\" />")
            appendLine("    </group>")
            appendLine("  </layers>")
            appendLine("</AlightMotionProject>")
        }
    }

    fun generateLyricsXml(
        audioName: String,
        mode: LyricsMode,
        language: LanguageOption,
    ): String {
        val sampleLyrics = listOf(
            "Lagu", "yang", "indah", "ini", "membawa",
            "aku", "ke", "masa", "lalu", "dan",
            "masa", "depan", "yang", "menjanjikan",
            "harapan", "baru"
        )

        val lyricsText = sampleLyrics.mapIndexed { index, word ->
            val start = index * 900L
            val end = start + 850L
            "    <text start=\"$start\" end=\"$end\" mode=\"${mode.label}\" language=\"${language.label}\">$word</text>"
        }.joinToString(separator = "\n")

        return buildString {
            appendLine("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
            appendLine("<AlightMotionLyrics>")
            appendLine("  <metadata>")
            appendLine("    <title>Auto Lyrics</title>")
            appendLine("    <audio>$audioName</audio>")
            appendLine("    <mode>${mode.label}</mode>")
            appendLine("    <language>${language.label}</language>")
            appendLine("  </metadata>")
            appendLine("  <lyrics>")
            appendLine(lyricsText)
            appendLine("  </lyrics>")
            appendLine("</AlightMotionLyrics>")
        }
    }
}
