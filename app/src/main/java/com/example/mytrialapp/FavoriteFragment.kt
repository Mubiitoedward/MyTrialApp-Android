package com.example.mytrialapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text


class FavoriteFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_favorite, container, false)

        binding.findViewById<TextView>(R.id.myText).text = resources.getString(R.string.fav1)
      //  binding.findViewById<TextView>(R.id.myText2).text = resources.getString(R.string.fav2)

        val floatingButton = binding.findViewById<FloatingActionButton>(R.id.myFloatingActionButton)

        floatingButton.setOnClickListener {
            val intent = Intent(activity, SelectRoutine::class.java)
            startActivity(intent)
        }

        return binding

    }


}