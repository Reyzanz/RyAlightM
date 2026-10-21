package com.reyzanz.ryalightm.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.reyzanz.ryalightm.model.LanguageOption
import com.reyzanz.ryalightm.model.LyricsMode
import com.reyzanz.ryalightm.util.XmlExporter

@Composable
fun LyricsScreen() {
    var selectedAudio by remember { mutableStateOf("lagu_sample.mp3") }
    var selectedMode by remember { mutableStateOf(LyricsMode.PER_WORD) }
    var selectedLanguage by remember { mutableStateOf(LanguageOption.AUTO_DETECT) }
    var generatedXml by remember { mutableStateOf("") }
    var downloadText by remember { mutableStateOf("Download") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Lyrics Teks Otomatis", style = MaterialTheme.typography.titleLarge)
                Text("Pilih audio, mode, bahasa, lalu generate XML lyric.")
            }
        }

        OutlinedButton(
            onClick = { selectedAudio = "song_demo.mp3" },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Pilih Lagu / Sound")
        }

        Text("Mode", fontWeight = FontWeight.Bold)
        LyricsMode.values().forEach { mode ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                RadioButton(
                    selected = selectedMode == mode,
                    onClick = { selectedMode = mode }
                )
                Text(mode.label)
            }
        }

        Text("Tentukan Bahasa", fontWeight = FontWeight.Bold)
        LanguageOption.values().forEach { language ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                RadioButton(
                    selected = selectedLanguage == language,
                    onClick = { selectedLanguage = language }
                )
                Text(language.label)
            }
        }

        Button(
            onClick = {
                generatedXml = XmlExporter.generateLyricsXml(
                    audioName = selectedAudio,
                    mode = selectedMode,
                    language = selectedLanguage
                )
                downloadText = "Download"
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Generate Auto Lyrics")
        }

        if (generatedXml.isNotEmpty()) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Preview XML Lyrics", fontWeight = FontWeight.Bold)
                    Text(generatedXml)
                }
            }

            Button(
                onClick = {
                    downloadText = "Downloaded"
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(downloadText)
            }
        }
    }
}
