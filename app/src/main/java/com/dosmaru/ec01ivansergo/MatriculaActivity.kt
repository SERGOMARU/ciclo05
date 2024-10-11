package com.dosmaru.ec01ivansergo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import com.dosmaru.ec01ivansergo.databinding.ActivityMatriculaBinding

class MatriculaActivity : AppCompatActivity() , View.OnClickListener{

    private lateinit var binding: ActivityMatriculaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMatriculaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?){
        val numMaterias=binding.txtNumMaterias.text.toString().toDouble()
        val costo=if(numMaterias>5){
            520*numMaterias*0.9
        }else{
            520*numMaterias
        }

        binding.lblResultado.setText("El costo de : $numMaterias"+"materias es: $costo")
    }

}