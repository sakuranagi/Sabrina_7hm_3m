package com.example.sabrina_7hm_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sabrina_7hm_3m.databinding.ItemMusicBinding

class MusicAdapter(private val musicList: List<Music>, val onItemClick:(position:Int) -> Unit): RecyclerView.Adapter<MusicAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = musicList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])
    }

    inner class ViewHolder(private val binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(music: Music){
            binding.apply {
                music.apply {
                    tvNumber.text = number
                    tvSongName.text = songName
                    tvSingerName.text = singerName
                    tvSongTime.text = time
                }

                itemView.setOnClickListener {
                    onItemClick(adapterPosition)
                }
            }


        }
    }
}