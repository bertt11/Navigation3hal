package robert.paba.navigation3hal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [f1.newInstance] factory method to
 * create an instance of this fragment.
 */
class f1 : Fragment() {

    private var angkaAwal: Int = 0
    private lateinit var angkaTextView: TextView

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_f1, container, false)
        angkaTextView = view.findViewById(R.id.angkaAwal1)
        updateAngka(angkaAwal)
        return view
    }


    fun updateAngka(newAngka: Int) {
        angkaAwal = newAngka
        if (this::angkaTextView.isInitialized) {
            angkaTextView.text = angkaAwal.toString()
        }
    }

    companion object {

        fun newInstance(angkaAwal: Int): f1 {
            val fragment = f1()
            fragment.angkaAwal = angkaAwal
            return fragment
        }
    }
}