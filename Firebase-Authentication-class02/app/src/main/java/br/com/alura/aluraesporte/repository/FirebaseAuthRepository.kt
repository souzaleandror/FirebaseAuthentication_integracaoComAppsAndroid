package br.com.alura.aluraesporte.repository

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

private const val TAG = "FirebaseAuthRepository";
class FirebaseAuthRepository(
    private val firebaseAuth: FirebaseAuth
) {

    private fun desloga(firebaseAuth: FirebaseAuth) {
        firebaseAuth.signOut();
    }

    private fun verificaUsuario(firebaseAuth: FirebaseAuth) {
        val currentUser: FirebaseUser? = firebaseAuth.currentUser;
        if (currentUser != null) {
        } else {
        }
    }

    private fun autenticaUsuario(firebaseAuth: FirebaseAuth) {
        firebaseAuth.signInWithEmailAndPassword("a@gmail.com", "Test123")
            .addOnSuccessListener {

            }.addOnFailureListener {
                Log.e("onCreate", "OnCreate: ", it)

            }
    }

    public fun cadastra(email: String, senha: String): LiveData<Boolean> {
        val liveData = MutableLiveData<Boolean>();

        val tarefa = firebaseAuth.createUserWithEmailAndPassword(email, senha);

        tarefa.addOnSuccessListener {
            Log.i(TAG, "Cadastro com sucesso");
            liveData.value = true
        }

        tarefa.addOnFailureListener {
            Log.i(TAG, "Cadastro falhou", it);
            liveData.value = false
        }

        return liveData;
    }

}