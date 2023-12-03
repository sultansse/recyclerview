package com.softwareit.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearSnapHelper
import com.softwareit.recyclerview.data.DataSource.jobItems
import com.softwareit.recyclerview.databinding.FragmentJobListBinding
import com.softwareit.recyclerview.decoration.OffsetDecoration
import com.softwareit.recyclerview.decoration.StickyHeaderDecoration

class JobListFragment : Fragment() {

    private lateinit var binding: FragmentJobListBinding
    private val offsetDecoration = OffsetDecoration(vertical = 6)
    private val stickyHeaderDecoration = StickyHeaderDecoration()
    private val snapHelper = LinearSnapHelper()
    private val adapter by lazy {
        JobListAdapter { job ->
            findNavController().navigate(JobListFragmentDirections.actionJobListFragmentToJobDetailsFragment(job))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentJobListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            jobList.adapter = adapter
            jobList.addItemDecoration(offsetDecoration)
            jobList.addItemDecoration(stickyHeaderDecoration)
            snapHelper.attachToRecyclerView(binding.jobList)
            adapter.submitList(jobItems)
        }
    }


    override fun onDestroyView() {
        binding.jobList.removeItemDecoration(offsetDecoration)
        binding.jobList.removeItemDecoration(stickyHeaderDecoration)
        super.onDestroyView()
    }
}
