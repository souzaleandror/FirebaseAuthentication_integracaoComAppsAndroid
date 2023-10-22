package br.com.alura.aluraesporte.extensions

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.snackbar(mensagem: String, duracao: Int = Snackbar.LENGTH_LONG) {
    Snackbar.make(this, mensagem, duracao)
        .show();
}