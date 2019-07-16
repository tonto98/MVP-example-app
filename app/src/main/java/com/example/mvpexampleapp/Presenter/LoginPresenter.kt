package com.example.mvpexampleapp.Presenter

import com.example.mvpexampleapp.Model.User
import com.example.mvpexampleapp.View.ILoginView

class LoginPresenter (var iLoginView: ILoginView): ILoginPresenter{
    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val loginCheckCode = user.isDataValid()
        when(loginCheckCode){
            1 -> iLoginView.onLoginResult("Empty email field")
            2 -> iLoginView.onLoginResult("Invalid email")
            3 -> iLoginView.onLoginResult("Invalid Password")
            0 -> iLoginView.onLoginResult("Success!")
        }

    }
}