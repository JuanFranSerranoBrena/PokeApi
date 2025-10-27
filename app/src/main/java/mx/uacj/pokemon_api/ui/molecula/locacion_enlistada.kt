package mx.uacj.pokemon_api.ui.molecula

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mx.uacj.pokemon_api.modelos.Locacion
import mx.uacj.pokemon_api.modelos.Pokemon

@Composable
fun LocacionLista(locacion: Locacion, modificador: Modifier = Modifier){
    Column(modificador) {
        Text("Id: ${locacion.id}")
        Text("Nombre de Locacion: ${locacion.name}")
        Text("Region: ${locacion.region.name}")
    }
}


