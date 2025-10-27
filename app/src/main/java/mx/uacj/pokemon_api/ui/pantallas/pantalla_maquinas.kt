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
import mx.uacj.pokemon_api.modelos.Maquina

@Composable
fun PantallaMaquina(
    modificador: Modifier = Modifier,
    maquina: Maquina
) {
    Column(modifier = modificador.padding(18.dp)) {
        Text("Id: ${maquina.id}")
        Text("Nombre de la maquina: ${maquina.item.name}")
        Text("Movimiento: ${maquina.move.name}")
        Text("Version Group: ${maquina.version_group.name}")
    }
}


@Preview
@Composable
fun previsualizacion_PantallaMaquinas(){
    //PantallaMaquinas()
}
