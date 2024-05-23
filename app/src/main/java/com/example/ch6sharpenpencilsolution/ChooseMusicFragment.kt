package com.example.ch6sharpenpencilsolution

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChooseMusicFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChooseMusicFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_choose_music, container, false)

        val searchMusicButton = view.findViewById<Button>(R.id.search_music_btn)

        searchMusicButton.setOnClickListener {

            val navController = view.findNavController()

            val options = arrayOf(true, false)

            val selected = options[(Math.random() * options.size).toInt()]

            if (selected){
                navController.navigate(R.id.action_chooseMusicFragment_to_foundFragment)
            }else{
                navController.navigate(R.id.action_chooseMusicFragment_to_notFoundFragment)
            }

        }

        return view
    }


}