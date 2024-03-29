package com.example.kotlin65.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.kotlin65.databinding.ItemRickAndMortyBinding
import com.example.kotlin65.ui.model.CharacterAndLocationModel

class RickAndMortyAdapter :
    ListAdapter<CharacterAndLocationModel, RickAndMortyAdapter.RickAndMortyViewHolder>(
        DiffUtilCallback()
    ) {

    class RickAndMortyViewHolder(private val binding: ItemRickAndMortyBinding) :
        ViewHolder(binding.root) {
        fun onBind(data: CharacterAndLocationModel) = with(binding) {
            Glide.with(itemView.context).load(data.image).into(ivItem)
            tvCharactersItem.text = data.name
            tvLocationItem.text = data.location
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickAndMortyViewHolder {
        return RickAndMortyViewHolder(
            ItemRickAndMortyBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RickAndMortyViewHolder, position: Int) {
        getItem(position).let {
            holder.onBind(it)
        }
    }

    companion object {
        class DiffUtilCallback : DiffUtil.ItemCallback<CharacterAndLocationModel>() {

            override fun areItemsTheSame(
                oldItem: CharacterAndLocationModel, newItem: CharacterAndLocationModel
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: CharacterAndLocationModel, newItem: CharacterAndLocationModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}