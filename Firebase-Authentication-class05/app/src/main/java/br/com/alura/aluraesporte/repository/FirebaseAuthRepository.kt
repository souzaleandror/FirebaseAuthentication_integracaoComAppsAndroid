package br.com.alura.aluraesporte.repository

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.com.alura.aluraesporte.model.Usuario
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.google.firebase.auth.FirebaseUser
import java.lang.Exception
import java.lang.IllegalArgumentException

private const val TAG = "FirebaseAuthRepository";
class FirebaseAuthRepository(
    private val firebaseAuth: FirebaseAuth
) {

    public fun desloga() {
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

    public fun cadastra(usuario: Usuario): LiveData<Resource<Boolean>> {
        val liveData = MutableLiveData<Resource<Boolean>>();

        try {
            val tarefa = firebaseAuth.createUserWithEmailAndPassword(usuario.email, usuario.senha);

            tarefa.addOnSuccessListener {
                Log.i(TAG, "Cadastro com sucesso");
                liveData.value = Resource(true)
            }

            tarefa.addOnFailureListener { exception ->
                Log.i(TAG, "Cadastro falhou", exception);
                val msgErro: String = develveErroCadastro(exception)
                liveData.value = Resource(false, msgErro)
            }
        } catch (e: IllegalArgumentException) {
            liveData.value = Resource(false, "Email ou senha nao pode ser vazias")
        }

        return liveData;
    }

    private fun develveErroCadastro(exception: Exception): String = when (exception) {
        is FirebaseAuthWeakPasswordException -> "Senha precisa de pelo menos 6 digitos"
        is FirebaseAuthInvalidCredentialsException -> "Email invalido"
        is FirebaseAuthUserCollisionException -> "Email ja cadastrado"
        else -> "Erro deseconhecido"
    }

    fun estaLogado(): Boolean {
        val currentUser: FirebaseUser? = firebaseAuth.currentUser;
        if (currentUser != null) {
            return true
        }
        return false
    }

    fun autentica(usuario: Usuario) : LiveData<Resource<Boolean>> {

//        firebaseAuth.signInWithEmailAndPassword(usuario.email, usuario.senha)
//            .addOnSuccessListener {
//
//            }.addOnFailureListener {
//                Log.e("onCreate", "OnCreate: ", it)
//            }
    val liveData = MutableLiveData<Resource<Boolean>>()
        try {
            firebaseAuth.signInWithEmailAndPassword(usuario.email, usuario.senha)
                .addOnCompleteListener { tarefa ->
                    if(tarefa.isSuccessful) {
                        liveData.value = Resource(true)
                    } else {
                        Log.e(TAG, "Autentica", tarefa.exception)
                        val mensagemError: String = when(tarefa.exception) {
                            is FirebaseAuthInvalidUserException -> "Email invalido ou desabilitado"
                            is FirebaseAuthInvalidCredentialsException -> "Email e senha incorreta"
                            else -> "Error desconhecido"
                        }
                        liveData.value = Resource(false, mensagemError)
                    }
                }
        } catch (e: IllegalArgumentException) {
            liveData.value = Resource(false, "Email ou senha nao pode ser vazio")
        }
        return liveData;
    }
}