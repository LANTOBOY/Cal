package com.example.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.result
import kotlinx.android.synthetic.main.activity_main.plus
import android.view.View
import android.widget.Toast
import com.example.test.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
  val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setContentView(binding.root)
    var a: String = ""
    var list = mutableListOf<String>()
    var b: Long = 0L
    var c: Long = 1L
    var d: Double = 1.0
    var f: Double = 1.0
    thread(start = true) {
      Thread.sleep(3000)
      runOnUiThread {
        showProgress(false)
        binding.back.visibility = android.view.View.VISIBLE
        binding.textView.visibility = android.view.View.VISIBLE
        binding.radioGroup.visibility = android.view.View.VISIBLE
        binding.img.visibility = android.view.View.VISIBLE
      }
    }
    binding.btnTrip.setOnClickListener {
      binding.trip.visibility = android.view.View.VISIBLE
    }
    binding.back.setOnClickListener {
      binding.trip.visibility = android.view.View.INVISIBLE
    }
    binding.btnCal.setOnClickListener {
      binding.cal.visibility = android.view.View.VISIBLE
    }
    binding.back2.setOnClickListener {
      binding.cal.visibility = android.view.View.INVISIBLE
    }

      binding.one.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("1"))
        a = binding.num1.text.toString()
      }
      binding.two.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("2"))
        a = binding.num1.text.toString()
      }
      binding.three.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("3"))
        a = binding.num1.text.toString()
      }
      binding.four.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("4"))
        a = binding.num1.text.toString()
      }
      binding.five.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("5"))
        a = binding.num1.text.toString()
      }
      binding.six.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("6"))
        a = binding.num1.text.toString()
      }
      binding.seven.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("7"))
        a = binding.num1.text.toString()
      }
      binding.eight.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("8"))
        a = binding.num1.text.toString()
      }
      binding.nine.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("9"))
        a = binding.num1.text.toString()
      }
      binding.zero.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("0"))
        a = binding.num1.text.toString()
      }
      binding.dot.setOnClickListener {
        binding.num1.setText(binding.num1.text.append("."))
        a = binding.num1.text.toString()
      }
    binding.plus.setOnClickListener {
      binding.num1.setText(binding.num1.text.append("+"))
      a = binding.num1.text.toString()
    }
    binding.minus.setOnClickListener {
      binding.num1.setText(binding.num1.text.append("-"))
      a = binding.num1.text.toString()
    }
    binding.div.setOnClickListener {
      binding.num1.setText(binding.num1.text.append("/"))
      a = binding.num1.text.toString()
    }
    binding.rem.setOnClickListener {
      binding.num1.setText(binding.num1.text.append("%"))
      a = binding.num1.text.toString()
    }
    binding.multi.setOnClickListener {
      binding.num1.setText(binding.num1.text.append("*"))
      a = binding.num1.text.toString()
    }
    binding.clear.setOnClickListener {
      binding.num1.setText(" ")
    }
    binding.result.setOnClickListener {
      b = 0
      c = 1
      d = 1.0
      f = 1.0
      if (list.size != 0) {
        list = mutableListOf<String>()
      }

      if (binding.num1.text.contains("+")) {
        val str = binding.num1.text.split("+")
        val a = str[0].toDouble()
        val z = a.toInt()
        for (i in 0..str.size - 1) {
          if(i == 0){
            list.add(z.toString())
            b += list.get(i).toInt()
          }else{
            list.add(str[i])
            b += list.get(i).toInt()
          }

        }

        binding.num1.setText(String.format("%d", b))
      }

      if (binding.num1.text.contains("-")) {
        val str = binding.num1.text.split("-")
        val a = str[0].toDouble()
        val z = a.toLong()
        b = z
        for (i in 0..str.size - 1) {
          list.add(str[i])
          if (i != 0) {
            b -= list.get(i).toInt()

          }
        }

        binding.num1.setText(String.format("%d", b))
      }

      if (binding.num1.text.contains("*")) {
        val str = binding.num1.text.split("*")
        val a = str[0].toDouble()
        val z = a.toInt()

        for (i in 0..str.size - 1) {
          if(i == 0){
            list.add(z.toString())
            c *= list.get(i).toInt()
          }else{
            list.add(str[i])
            c *= list.get(i).toInt()
          }

        }

        binding.num1.setText(String.format("%d", c))
      }

      if (binding.num1.text.contains("/")) {
        val str = binding.num1.text.split("/")
        d = str[0].toDouble()
        for (i in 0..str.size - 1) {
          list.add(str[i])
          if (i != 0) {
            d /= list.get(i).toDouble()

          }
        }

        binding.num1.setText(String.format("%.2f", d))
      }

      if (binding.num1.text.contains("%")) {
        val str = binding.num1.text.split("%")
        f = str[0].toDouble()
        for (i in 0..str.size - 1) {
          list.add(str[i])
          if (i != 0) {
            f %= list.get(i).toDouble()

          }
        }

        binding.num1.setText(String.format("%.2f", f))
      }
    }

      binding.btnTrip.setOnClickListener {
        binding.trip.visibility = android.view.View.VISIBLE
      }
      binding.back.setOnClickListener {
        binding.trip.visibility = android.view.View.INVISIBLE
      }
      binding.btnCal.setOnClickListener {
        binding.cal.visibility = android.view.View.VISIBLE
      }
      binding.back2.setOnClickListener {
        binding.cal.visibility = android.view.View.INVISIBLE
      }
    binding.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
      when (i) {
        R.id.rdflower -> binding.img.setImageResource(R.drawable.flower)
        R.id.rdriver -> binding.img.setImageResource(R.drawable.river)
        R.id.rdhouse -> binding.img.setImageResource(R.drawable.house)
      }
    }
    }
  fun showProgress(show: Boolean) {
    binding.progresslayout.visibility = if (show) View.VISIBLE else View.GONE
  }
  }








