package com.example.mvpexampleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvpexampleapp.Presenter.ILoginPresenter
import com.example.mvpexampleapp.Presenter.LoginPresenter
import com.example.mvpexampleapp.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {
    override fun onLoginResult(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        button_login.setOnClickListener {
            loginPresenter.onLogin(edit_text_email.text.toString(), edit_text_password.text.toString())
        }
    }
}
