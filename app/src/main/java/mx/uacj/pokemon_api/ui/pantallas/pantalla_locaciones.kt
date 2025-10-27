package mx.uacj.pokemon_api.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.uacj.pokemon_api.modelos.Locacion


@Composable
fun PantallaLocacion(
    modificador: Modifier = Modifier,
    locacion: Locacion
) {
    Column(modifier = modificador.padding(18.dp)) {
        Text("Id: ${locacion.id}")
        Text("Nombre de Locacion: ${locacion.name}")
        Text("Region: ${locacion.region.name}")
    }
}

@Preview
@Composable
fun previsualizacion_PantallaLocacion(){
    //PantallaLocacion()
}

