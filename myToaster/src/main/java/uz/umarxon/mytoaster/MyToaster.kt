package uz.umarxon.mytoaster

import android.content.Context
import android.widget.Toast

object MyToaster {
    fun toastShort(context: Context, str:String){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show()
    }
    fun toastLong(context: Context, str:String){
        Toast.makeText(context,str,Toast.LENGTH_LONG).show()
    }
}