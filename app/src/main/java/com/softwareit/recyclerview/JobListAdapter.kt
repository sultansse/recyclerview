package com.softwareit.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.softwareit.recyclerview.model.JobListItem
import com.softwareit.recyclerview.databinding.ItemJobBinding
import com.softwareit.recyclerview.databinding.ItemJobCategoryBinding

class JobListAdapter(
    private val onJobClick: (Int) -> Unit,
) : ListAdapter<JobListItem, RecyclerView.ViewHolder>(MyDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            R.layout.item_job -> JobViewHolder(
                ItemJobBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent, false
                )
            )
            R.layout.item_job_category -> JobCategoryViewHolder(
                ItemJobCategoryBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent, false
                )
            )
            else -> error("unknown viewType")
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is JobViewHolder -> holder.bind(getItem(position) as JobListItem.Job)
            is JobCategoryViewHolder -> holder.bind(getItem(position) as JobListItem.Category)
        }
    }


    override fun getItemViewType(position: Int): Int = when(getItem(position)) {
        is JobListItem.Job -> R.layout.item_job
        is JobListItem.Category -> R.layout.item_job_category
        else -> error("unknown")
    }

    inner class JobViewHolder(
        private val binding: ItemJobBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(job: JobListItem.Job) {
            with(binding) {
                jobName.text = job.name
                jobImg.setImageResource(job.image)
                jobCompany.text = job.company
                salary.text = itemView.context.getString(
                    R.string.salary, job.salaryPerYearRangeInK.first, job.salaryPerYearRangeInK.second
                )
                root.setOnClickListener { onJobClick(job.id) }
            }
        }
    }

    inner class JobCategoryViewHolder(
        private val binding: ItemJobCategoryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(category: JobListItem.Category) {
            binding.root.text = category.name
        }
    }
}

class MyDiffUtil : DiffUtil.ItemCallback<JobListItem>() {
    override fun areItemsTheSame(oldItem: JobListItem, newItem: JobListItem): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: JobListItem, newItem: JobListItem): Boolean =
        oldItem == newItem
}