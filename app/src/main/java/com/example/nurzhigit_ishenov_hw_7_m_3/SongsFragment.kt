package com.example.nurzhigit_ishenov_hw_7_m_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nurzhigit_ishenov_hw_7_m_3.databinding.FragmentSongsBinding

class SongsFragment : Fragment() {
    private lateinit var binding: FragmentSongsBinding
    private lateinit var adapter: SongAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSongsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val songs = listOf<Song>(
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"),
            Song("Качели", "Artik&Asti","3:23"))
        adapter = SongAdapter(songs)
        binding.rvSongs.adapter = adapter
    }
}