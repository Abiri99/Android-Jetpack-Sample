package com.example.jetpacksample.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpacksample.R
import com.example.jetpacksample.databinding.ItemDogBinding
import com.example.jetpacksample.model.DogBreed
import com.example.jetpacksample.util.getProgressDrawable
import com.example.jetpacksample.util.loadImage
import kotlinx.android.synthetic.main.item_dog.view.*

class DogsListAdapter(val dogsList: ArrayList<DogBreed>) :
    RecyclerView.Adapter<DogsListAdapter.DogViewHolder>(), DogClickListener {

    fun updateDogList(newDogsList: List<DogBreed>) {
        dogsList.clear()
        dogsList.addAll(newDogsList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
//        val view: View = inflater.inflate(R.layout.item_dog, parent, false)
        val view: ItemDogBinding =
            DataBindingUtil.inflate<ItemDogBinding>(inflater, R.layout.item_dog, parent, false)
        return DogViewHolder(view)
    }

    override fun getItemCount() = dogsList.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.view.dog = dogsList[position]
        holder.view.listener = this

//        holder.view.dogName_tv.text = dogsList[position].dogBreed
//        holder.view.lifespan_tv.text = dogsList[position].lifeSpan
//        holder.view.dog_iv.loadImage(dogsList[position].imageUrl, getProgressDrawable(holder.view.dog_iv.context))
//        holder.view.setOnClickListener {
//            val action: ListFragmentDirections.ActionListFragmentToDetailFragment = ListFragmentDirections.actionListFragmentToDetailFragment()
//            action.dogUuid = dogsList[position].uuid
//            Navigation.findNavController(it).navigate(action)
//        }
    }

    override fun onDogClicked(v: View) {
        val uuid = v.dogId.text.toString().toInt()
        val action: ListFragmentDirections.ActionListFragmentToDetailFragment =
            ListFragmentDirections.actionListFragmentToDetailFragment()
        action.dogUuid = uuid
        Navigation.findNavController(v).navigate(action)
    }

    class DogViewHolder(var view: ItemDogBinding) : RecyclerView.ViewHolder(view.root)

}