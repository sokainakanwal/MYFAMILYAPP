package com.Sokaina25582.familysafetyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragmant.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragmant : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_fregmant, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMember= listOf <MemberModel> (
            MemberModel("Sokaina","Lahore kahna kachaa","80%","40M"),
            MemberModel("Shafiq","Lahore kahna kachaa","80%","40M"),
            MemberModel("Qasim","Lahore kahna kachaa","80%","40M")
                )
        val adapter=MemberAdapter(listMember)
        val recycler= requireView().findViewById<RecyclerView>(R.id.recycler_member)
        recycler.layoutManager=LinearLayoutManager(requireContext())
        recycler.adapter=adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragmant()
    }
}