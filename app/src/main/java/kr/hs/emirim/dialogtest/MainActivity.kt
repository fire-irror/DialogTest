package kr.hs.emirim.dialogtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btnItem : Button
    lateinit var textResult : TextView
    lateinit var Imgv : ImageView
    var verrionArray = arrayOf("문동주" , "문현빈", "문성주")
    var idolImgRes = arrayOf(R.drawable.img2, R.drawable.img3, R.drawable.img4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnItem = findViewById(R.id.btn_item)
       textResult = findViewById(R.id.text_result)
        Imgv = findViewById(R.id.imgv)

       btnItem.setOnClickListener{
           var dlg = AlertDialog.Builder(this@MainActivity) //main객체로 대신해서 씀
           dlg.setTitle("좋아하는 야구선수는?")
           dlg.setIcon(R.drawable.img)
           dlg.setItems(verrionArray){ dialog, index ->
               textResult.text = verrionArray[index]
               Imgv.setImageResource(idolImgRes[index])
           }
           dlg.setNegativeButton("닫기",null)
           dlg.show()

       }
    }
}