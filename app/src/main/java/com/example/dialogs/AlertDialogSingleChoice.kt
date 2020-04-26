package com.example.dialogs

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.util.Log
import android.view.LayoutInflater

class AlertDialogSingleChoice(context: Context) {
    var title: String? = null
    private var items= arrayOf("item1","item2","item3")
    private var dialog = AlertDialog.Builder(context).setSingleChoiceItems(items,1
    ) { dialog, which -> Log.d("ttt","Do something") }.create()

    init {
        title?.let { dialog.setTitle(title) }
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