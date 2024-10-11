package com.dosmaru.ec01ivansergo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dosmaru.ec01ivansergo.databinding.ActivityNumMayorBinding

class NumMayorActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding:ActivityNumMayorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNumMayorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener(this)
    }

    override fun onClick(p0: View?){
        val numero1=binding.txtnum01.text.toString().toDouble()
        val numero2=binding.txtNum02.text.toString().toDouble()
        val numero3=binding.txtNum3.text.toString().toDouble()
        val numero4=binding.txtNum4.text.toString().toDouble()

        val numMayor=if((numero1>numero2)&&(numero1>numero3)&&(numero1>numero4)){
            numero1
        }else if((numero2>numero1)&&(numero2>numero3)&&(numero2>numero4)){
            numero2
        }else if((numero3>numero2)&&(numero3>numero1)&&(numero3>numero4)){
            numero3
        }else{
            "los numeros son Iguales"
        }

        //val suma=numero1+numero2
        binding.lblResultNumMayor.setText("El numero mayor es: $numMayor")
    }

}