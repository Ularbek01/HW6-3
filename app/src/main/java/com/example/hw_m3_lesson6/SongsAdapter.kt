package com.example.hw_m3_lesson6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class SongsAdapter(private val songs : ArrayList<Songs>, val onItemClick : OnItemClick) :
    Adapter<SongsAdapter.SongsViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsViewHolder {
        return SongsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false))
    }

    override fun onBindViewHolder(holder: SongsViewHolder, position: Int) {
        holder.bind()
        holder.itemView.setOnClickListener{
            onItemClick.onItemClick(songs.get(position).name.toString(), songs.get(position).artist.toString())
        }
    }

    override fun getItemCount(): Int {
        return songs.size
    }


    inner class SongsViewHolder(itemView: View) : ViewHolder(itemView) {
        private var tvSongIndex : TextView
        private var tvName : TextView
        private var tvArtist : TextView
        private var tvSongDuration : TextView

        init {
            tvSongIndex = itemView.findViewById(R.id.tv_song_index)
            tvName = itemView.findViewById(R.id.tv_name)
            tvArtist = itemView.findViewById(R.id.tv_artist)
            tvSongDuration = itemView.findViewById(R.id.tv_song_duration)
        }


        fun bind() {
            val song = songs.get(adapterPosition)
            tvSongIndex.text = song.songIndex
            tvName.text = song.name
            tvArtist.text = song.artist
            tvSongDuration.text = song.songDuration
        }
    }
}