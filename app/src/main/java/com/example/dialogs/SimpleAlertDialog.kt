package com.example.dialogs

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater

class SimpleAlertDialog(context: Context) {
    private var title: String = "Title"
    private var message: String = "Message"
    private var dialog = AlertDialog.Builder(context).create()

    init {
        dialog.setTitle(title)
        dialog.setMessage(message)
        dialog.setButton(
            AlertDialog.BUTTON_POSITIVE,
            "Ok"
        ) { _, _ -> kotlin.run { listener?.invoke() } }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel") { _, _ -> }
    }

    private var listener: (() -> Unit)? = null

    public fun setOnClickListener(listener: (() -> Unit)) {
        this.listener = listener
    }

    fun show() {
        dialog.show()
    }

    fun close() {
        dialog.dismiss()
    }
}