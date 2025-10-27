package mx.uacj.pokemon_api.ui.pantallas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.uacj.pokemon_api.modelos.Locacion
import mx.uacj.pokemon_api.modelos.Maquina
import mx.uacj.pokemon_api.modelos.Pokemon
import mx.uacj.pokemon_api.ui.molecula.PokemonLista
import mx.uacj.pokemon_api.viewmodels.PokemonesViewModel


@Composable
fun PantallaPrincipal(modificador: Modifier = Modifier,
                      controlador_pokemones: PokemonesViewModel = hiltViewModel()) {
    val controlador_navegacion = rememberNavController()

    var pokemon_seleccionado by remember { mutableStateOf<Pokemon?>(null) }
    var maquina_seleccionada by remember { mutableStateOf<Maquina?>(null) }
    var locacion_seleccionada by remember { mutableStateOf<Locacion?>(null) }


    NavHost(navController = controlador_navegacion, startDestination = "lista_pokemones"){
        composable("lista_pokemones") {
            Column(modifier = modificador) {
                Column {
                    Text("Conoce a los ${controlador_pokemones.pokemones.value.size} pokemon")
                }

                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    for (pokemon in controlador_pokemones.pokemones.value) {
                        PokemonLista(pokemon = pokemon, modificador = Modifier
                            .padding(18.dp)
                            .clickable
                            {
                            pokemon_seleccionado = pokemon
                            controlador_navegacion.navigate("pantalla_pokemones")
                        })
                    }

                }
            }
        }

        composable("pantalla_pokemones") {
            PantallaPokemon(modificador = modificador, pokemon = pokemon_seleccionado!!)
        }

/*
        //me quede atorado no supe como llamar a las pantallas para que se muestren
        composable("pantalla_maquina") {
            PantallaMaquina(modificador= modificador, maquina = maquina_seleccionada)
        }

        composable("pantalla-locacion") {
            PantallaLocacion(modificador = modificador, locacion = locacion_seleccionada)
        }
    }*/


}

@Composable
@Preview(showBackground = true)
fun PreviewPantallaPrincipal(){
    PantallaPrincipal()
}
