package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.MovieRowBinding

class MovieAdapter(val callBack:(Movie)->Unit) :ListAdapter<Movie,MovieAdapter.MovieViewHoldder>(MovieDiffUtil()) {

    class MovieViewHoldder(private val binding:MovieRowBinding):
        RecyclerView.ViewHolder(binding.root){
            fun bind(movie:Movie){
                binding.movie=movie
            }

        }



    class MovieDiffUtil:DiffUtil.ItemCallback<Movie>(){
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {

            return oldItem==newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHoldder {
        val binding=MovieRowBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        )

        return MovieViewHoldder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHoldder, position: Int) {
        val movie=getItem(position)
        holder.bind(movie)
        holder.itemView.setOnClickListener {
            callBack(movie)

        }
    }
}