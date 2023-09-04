package com.example.loginlinear

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginlinear.ui.theme.LoginLinearTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.layout)

        val btnLogin: Button = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener{
            val i = Intent(this, ActiviryLogin::class.java)
            startActivity (i)

        }
    }

}