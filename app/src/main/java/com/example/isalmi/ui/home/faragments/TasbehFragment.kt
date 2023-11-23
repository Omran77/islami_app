package com.example.isalmi.ui.home.faragments

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationSet
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.isalmi.R
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.core.graphics.rotationMatrix
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

class TasbehFragment :Fragment(){
    lateinit var tasbeehNumber :Button
    lateinit var zakrName :Button
    lateinit var changeMode :Button
    lateinit var sebhaImg:ImageView
    var number:Int=0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fargment_tasbah,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
//        zakrName.setOnClickListener(View.OnClickListener {
//
//            number++
//
//            tasbeehNumber.text=number.toString() //convert int to string
//            if (number==33){
//                number=0
//            }
//
//        })
        changeMode.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }

        sebhaImg.setOnClickListener {

            rotateImage()




        }


    }

    private fun initViews() {
        tasbeehNumber =requireView().findViewById(R.id.tasbehNumButton)
        changeMode =requireView().findViewById(R.id.change_mode)
        sebhaImg=requireView().findViewById(R.id.sebhaimage)


    }
    private fun rotateImage(){

        sebhaImg.animate().apply {

            number++
            tasbeehNumber.text=number.toString() //convert int to string
            if (number==33){
                number=0
            }
          YoYo.with(Techniques.RotateIn).duration(150)
              .playOn(sebhaImg)





        }



    }
}