package com.example.hamlet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hamlet.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnEmployeesItemClickListener {

    lateinit var binding: ActivityMainBinding

    lateinit var employees: ArrayList<Employees>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        employees = ArrayList()
        Addemployees()

        recyclerview_id.layoutManager = LinearLayoutManager(this)
        recyclerview_id.addItemDecoration(DividerItemDecoration(this, 1))
        recyclerview_id.adapter = EmployeesAdapter(employees, this)


    }

    fun Addemployees() {
        employees.add(
            Employees(
                "Julia Steve",
                "Backend Developer",
                employee_image = R.drawable.julia_steve
            )
        )
        employees.add(
            Employees(
                "Boniface Akpan",
                "Android Developer",
                employee_image = R.drawable.ic_profile_picture
            )
        )
        employees.add(
            Employees(
                "Sophia Bob",
                "Android Developer",
                employee_image = R.drawable.sophia_bob
            )
        )
        employees.add(
            Employees(
                "Boniface Akpan", "Android Developer", employee_image = R.drawable.boniface
            )
        )

        employees.add(
            Employees(
                "Boniface Akpan",
                "Android Developer",
                employee_image = R.drawable.ic_profile_picture

            )
        )

        employees.add(
            Employees(
                "Boniface Akpan",
                "Android Developer",
                employee_image = R.drawable.ic_profile_picture

            )
        )

        employees.add(
            Employees(
                "Boniface Akpan",
                "Android Developer",
                employee_image = R.drawable.ic_profile_picture

            )
        )

    }

    override fun onItemClick(items: Employees, position: Int) {

        val intent = Intent(this, EmployeesDetails::class.java)
        intent.putExtra("EMPLOYEENAME", items.employee_name)
        intent.putExtra("EMPLOYEEROLE", items.employee_role)
        intent.putExtra("EMPLOYEEIMAGE", items.employee_image.toString())

        startActivity(intent)
    }


}

