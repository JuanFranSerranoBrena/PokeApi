package mx.uacj.pokemon_api.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import mx.uacj.pokemon_api.modelos.Pokemon

@Composable
fun PantallaPokemon(modificador: Modifier = Modifier, pokemon: Pokemon){
    Column(modifier = modificador.padding(18.dp)){
        Text("Nombre: ${pokemon.name}")
        //Text("Tipos: ${pokemon}")
        for(tipos in pokemon.types){
            Text("tipo: ${tipos.type.name}")
        }
        Column{
            for (estadistica in pokemon.stats) {
                //Text("Estadistica: ${estadistica}", modifier = Modifier.padding(5.dp))
                Column(modifier = Modifier.padding(20.dp)) {
                    Text("${estadistica.stat.name}")


                    Text("Base: ${estadistica.base_stat}")


                    Text("Esfuerzo: ${estadistica.effort}")
                }

            }
        }
    }

}

@Preview
@Composable
fun previsualizacion_PantallaPokemon(){
    // PantallaPokemon()
}
