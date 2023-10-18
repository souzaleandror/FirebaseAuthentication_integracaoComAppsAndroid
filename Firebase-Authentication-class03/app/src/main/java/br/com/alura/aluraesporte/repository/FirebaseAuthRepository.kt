package br.com.alura.aluraesporte.repository

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.google.firebase.auth.FirebaseUser
import java.lang.IllegalArgumentException

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

    public fun cadastra(email: String, senha: String): LiveData<Resource<Boolean>> {
        val liveData = MutableLiveData<Resource<Boolean>>();

        try {
            val tarefa = firebaseAuth.createUserWithEmailAndPassword(email, senha);

            tarefa.addOnSuccessListener {
                Log.i(TAG, "Cadastro com sucesso");
                liveData.value = Resource(true)
            }

            tarefa.addOnFailureListener { exception ->
                Log.i(TAG, "Cadastro falhou", exception);
                val msgErro: String = when(exception) {
                    is FirebaseAuthWeakPasswordException -> "Senha precisa de pelo menos 6 digitos"
                    is FirebaseAuthInvalidCredentialsException -> "Email invalido"
                    is FirebaseAuthUserCollisionException -> "Email ja cadastrado"
                    else -> "Erro deseconhecido"
                }
                liveData.value = Resource(false, msgErro)
            }
        } catch (e: IllegalArgumentException) {
            liveData.value = Resource(false, "Email ou senha nao pode ser vazias")
        }

        return liveData;
    }

}