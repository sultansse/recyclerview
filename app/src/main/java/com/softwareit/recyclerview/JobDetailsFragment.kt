package com.softwareit.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.softwareit.recyclerview.data.DataSource.jobItems
import com.softwareit.recyclerview.databinding.FragmentJobDetailsBinding
import com.softwareit.recyclerview.model.JobListItem

class JobDetailsFragment : Fragment() {

    private lateinit var binding: FragmentJobDetailsBinding
    private val args: JobDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentJobDetailsBinding.inflate(inflater, container, false)
        return with(binding) {
            toolbar.setNavigationOnClickListener {
                findNavController().navigateUp()
            }
            val job = jobItems[args.id] as JobListItem.Job

            name.text = job.name
            company.text = job.company
            salary.text = requireContext().getString(R.string.salary, job.salaryPerYearRangeInK.first, job.salaryPerYearRangeInK.second)

            root
        }
    }
}