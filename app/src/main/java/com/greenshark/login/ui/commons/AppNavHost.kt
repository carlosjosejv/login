package com.greenshark.login.ui.commons

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.greenshark.login.ui.screens.LoginScreen
import com.greenshark.login.ui.screens.SignInScreen
import com.greenshark.login.ui.screens.SignUpScreen


/**
 * Created by Carlos Jiménez on 24-Jun-24.
 */

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    starDestination: String
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = starDestination
    ) {
        composable(NavigationItem.Login.route){
            LoginScreen(navController)
        }
        composable(NavigationItem.SignIn.route){
            SignInScreen(navController)
        }
        composable(NavigationItem.SignUp.route){
            SignUpScreen(navController)
        }
    }
}