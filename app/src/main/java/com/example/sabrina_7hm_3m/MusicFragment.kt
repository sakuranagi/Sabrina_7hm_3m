package com.example.sabrina_7hm_3m

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sabrina_7hm_3m.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {

    private lateinit var binding: FragmentMusicBinding
    private var resultFragment:ResultActivity = ResultActivity()
    private  var bundle: Bundle= Bundle()

    private val musicList = arrayListOf(
        Music("1","LILAC","IU","3:34"),
        Music("2","Celebrity","IU","3:15"),
        Music("3","BBIBBI","IU","3:14"),
        Music("4","People (feat. IU)","AugustD","3:33"),
        Music("5","Meaning of you","IU, Kim Chang-Wan","3:15"),
        Music("6","dlwlrma","IU","2:56"),
        Music("7","Blueming","IU","2:55"),
        Music("8","Good Day","IU","2:46"),
        Music("9","Love poem","IU","2:57"),
        Music("10","Palette (feat. IU)","G-DRAGON","3:37")


    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = adapter
    }
    private fun onClick(position:Int){
        val music= musicList[position]
        val intent = Intent(activity, ResultActivity::class.java)
        intent.putExtra("name",  music.songName)
        intent.putExtra("singer", music.singerName)
        startActivity(intent)

        }

}