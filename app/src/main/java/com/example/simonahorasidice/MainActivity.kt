package com.pmdm.cristian.botonescolores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pmdm.cristian.botonescolores.modelview.MyViewModel
import com.pmdm.cristian.botonescolores.view.*

/**
 * Clase MainActivity donde se ejecuta la aplicación.
 */
class MainActivity : ComponentActivity() {
    /**
     * Llamado cuando la actividad está comenzando. Aquí es donde debe ir la mayor parte de la inicialización.
     *
     * @param savedInstanceState Si la actividad se está re-inicializando después de haber sido previamente cerrada, entonces este Bundle contiene los datos que más recientemente proporcionó en onSaveInstanceState(Bundle).
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Crear un objeto de la clase MyViewModel y pasarlo a la función composable UI
        val viewModel = MyViewModel()
        enableEdgeToEdge()
        setContent {
            UI(viewModel)
        }
    }
}










