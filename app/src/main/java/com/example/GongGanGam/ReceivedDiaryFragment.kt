package com.example.GongGanGam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.GongGanGam.databinding.FragmentReceivedDiaryBinding

class ReceivedDiaryFragment : Fragment() {
   lateinit var binding : FragmentReceivedDiaryBinding

   private val diaries = arrayListOf<Diary>(
       Diary("", "오늘도맑음", "21.12.24", "기억하니 우리가 했더 이별 시간이 멈춘 듯..."),
       Diary("", "오늘도맑음", "21.12.24", "기억하니 우리가 했더 이별 시간이 멈춘 듯..."),
       Diary("", "오늘도맑음", "21.12.24", "기억하니 우리가 했더 이별 시간이 멈춘 듯..."),
       Diary("", "오늘도맑음", "21.12.24", "기억하니 우리가 했더 이별 시간이 멈춘 듯..."),
       Diary("", "오늘도맑음", "21.12.24", "기억하니 우리가 했더 이별 시간이 멈춘 듯..."),
       Diary("", "오늘도맑음", "21.12.24", "기억하니 우리가 했더 이별 시간이 멈춘 듯..."),
       Diary("", "오늘도맑음", "21.12.24", "기억하니 우리가 했더 이별 시간이 멈춘 듯...")
   )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentReceivedDiaryBinding.inflate(inflater, container, false)

        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView() {
        binding.receivedDiaryRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val letterReceivedDiaryRVAdapter = LetterReceivedDiaryRVAdapter(diaries)
        binding.receivedDiaryRv.adapter = letterReceivedDiaryRVAdapter
    }

}