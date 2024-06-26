package com.greenshark.login.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.greenshark.login.R
import com.greenshark.login.ui.commons.NavigationItem
import com.greenshark.login.ui.theme.LoginTheme

/**
 * Created by Carlos Jiménez on 24-Jun-24.
 */

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_image),
            contentDescription = "Imagen del inicio de sesion",
            modifier = Modifier.size(300.dp)
        )

        Text(
            text = "Hola!",
            fontSize = 50.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            modifier = Modifier.padding(start = 50.dp, end = 50.dp),
            textAlign = TextAlign.Center,
            text = "¡Hola! Descubre un mundo de posibilidades en [Nombre de la app]. Explora, conecta y disfruta. ¡Regístrate ya!"
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(NavigationItem.SignIn.route) },
            modifier = Modifier.width(250.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "Iniciar sesión")
        }

        Button(
            onClick = { navController.navigate(NavigationItem.SignUp.route) },
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.outlinedButtonColors(),
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Registrarse", color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginTheme {
        LoginScreen(rememberNavController())
    }
}