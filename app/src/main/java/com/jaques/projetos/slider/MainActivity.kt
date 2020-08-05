package com.jaques.projetos.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide

class MainActivity : IntroActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        isButtonBackVisible = false
        isButtonNextVisible = false
        for (i in 0..1){
            val fragmentIntro = arrayListOf(R.layout.intro_1,R.layout.intro_2)[i]
            addSlide( FragmentSlide.Builder()
                                   .background(android.R.color.white)
                                   .fragment(fragmentIntro)
                                   .build()
            )
        }




//        isButtonBackVisible = false
//        isButtonNextVisible = false
//        for (i in 0..3){
//           val pic = arrayListOf(R.drawable.um,R.drawable.dois,R.drawable.tres,R.drawable.quatro )[i]
//           val title = arrayListOf("um", "dois","três", "quatro")[i]
//           val description = arrayListOf("uma", "duas","três", "quatro")[i]
//            addSlide(SimpleSlide.Builder()
//                    .title("Titulo ${title}")
//                    .description("Descrição ${description}")
//                    .image(pic)
//                    .background(android.R.color.holo_orange_light)
//                    .build()
//            )
//        }
    }
}