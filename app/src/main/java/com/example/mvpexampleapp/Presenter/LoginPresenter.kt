package com.example.mvpexampleapp.Presenter

import com.example.mvpexampleapp.Model.User
import com.example.mvpexampleapp.View.ILoginView

class LoginPresenter (var iLoginView: ILoginView): ILoginPresenter{
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val isLoginSuccesfull = user.isDataValid
        if (isLoginSuccesfull){
            iLoginView.onLoginResult("Login Success")
        }else{
            iLoginView.onLoginResult("Login Error")
        }
    }
}