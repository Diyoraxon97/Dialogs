package com.example.dialogs

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface.OnMultiChoiceClickListener
import android.util.Log
import android.widget.Toast


class AlertDialogMultipleChoice(context: Context) {
    private var title="Title"
    private var items= arrayOf("item1","item2","item3")
    private var checkedItem= arrayOf(false,false,true)
    private var dialogBuilder = AlertDialog.Builder(context).setMultiChoiceItems(items,checkedItem,
        OnMultiChoiceClickListener { dialog, which, isChecked -> Log.d("ttt","do something")})
    private var dialog=dialogBuilder.create()

    init {
        dialog.setTitle(title) 
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ok") { _, _ -> kotlin.run { listener?.invoke() } }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel") { _, _ -> }
    }

    private var listener: (() -> Unit)? = null

    public fun setOnClickListener(listener: (() -> Unit)) {
        this.listener = listener
    }

    fun show() {
        dialog.show()
    }
    fun close(){
        dialog.dismiss()
    }
}