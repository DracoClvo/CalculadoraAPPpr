package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    val motor = engine()
    var a = 0
    var b = 0
    var aux=0
    var opeb:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun borrar_fun(V:View){
        resultado2.setText("")
        resultado.setText("")
        a = 0
        b = 0
        opeb = ""
    }
    fun empaquetar(add:Int,to:Int):Int{
        return to.times(10).plus(add)
    }
    fun operacion(V:View){
        val ope = (V as Button).text.toString()
        val ban = resultado.text.toString().equals("").not()
        if(ban){
            a = aux
            opeb = ope

        }
    }
    fun equals(V:View){

    }
    fun Concatenar_numero(v:View){
        val num = (v as Button).text.toString().toInt()
        val to = get_num(resultado.text.toString())
        resultado.setText(empaquetar(num,to).toString())
        aux = resultado.text.toString().toInt()
    }
    fun get_num(str:String):Int{
        var to:Int
        if (str.equals("")){
            to = 0 as Int
        }else {
            to = str.toInt()
        }
        return to
    }
 }
