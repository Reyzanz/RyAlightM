package com.reyzanz.ryalightm.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.reyzanz.ryalightm.util.XmlExporter

@Composable
fun AutoVectorScreen() {
    var generatedXml by remember { mutableStateOf("") }
    var selectedImage by remember { mutableStateOf("pemandangan.jpg") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Auto Gambar Vector", style = MaterialTheme.typography.titleLarge)
                Text("Pilih foto/gambar yang akan dipisahkan objeknya.")
                Text("Contoh: background, meja, kursi, air, matahari, dll.")
            }
        }

        OutlinedButton(
            onClick = { selectedImage = "landscape_with_table_and_chair.jpg" },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Pilih Gambar")
        }

        Button(
            onClick = {
                generatedXml = XmlExporter.generatePhotoVectorXml(selectedImage)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Generate Vector XML")
        }

        if (generatedXml.isNotEmpty()) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Hasil XML", fontWeight = FontWeight.Bold)
                    Text(generatedXml)
                }
            }
        }
    }
}
