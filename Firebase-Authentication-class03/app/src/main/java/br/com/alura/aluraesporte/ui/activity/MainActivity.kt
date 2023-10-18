package br.com.alura.aluraesporte.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import br.com.alura.aluraesporte.R
import br.com.alura.aluraesporte.ui.viewmodel.EstadoAppViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.main_activity.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val controlador by lazy {
        findNavController(R.id.main_activity_nav_host)
    }
    private val viewModel: EstadoAppViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

//        var firebaseAuth = FirebaseAuth.getInstance();
//        //cadastraUsuario(firebaseAuth)
//        //autenticaUsuario(firebaseAuth)
//        verificaUsuario(firebaseAuth);
//        desloga(firebaseAuth)

        controlador.addOnDestinationChangedListener { _,
                                                      destination,
                                                      _ ->
            title = destination.label
            viewModel.componentes.observe(this, Observer {
                it?.let { temComponentes ->
                    if(temComponentes.appBar){
                        supportActionBar?.show()
                    } else {
                        supportActionBar?.hide()
                    }
                    if(temComponentes.bottomNavigation) {
                        main_activity_bottom_navigation.visibility = VISIBLE
                    } else {
                        main_activity_bottom_navigation.visibility = GONE
                    }
                }
            })
        }
        main_activity_bottom_navigation
            .setupWithNavController(controlador)
    }
//
//    private fun desloga(firebaseAuth: FirebaseAuth) {
//        firebaseAuth.signOut();
//    }
//
//    private fun verificaUsuario(firebaseAuth: FirebaseAuth) {
//        val currentUser: FirebaseUser? = firebaseAuth.currentUser;
//        if (currentUser != null) {
//            Toast.makeText(this, "Usuario logado $currentUser", Toast.LENGTH_SHORT).show()
//            Toast.makeText(this, "Usuario logado ${currentUser.email}", Toast.LENGTH_LONG).show()
//
//        } else {
//            Toast.makeText(this, "Nao tem usuario logado $currentUser", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    private fun autenticaUsuario(firebaseAuth: FirebaseAuth) {
//        firebaseAuth.signInWithEmailAndPassword("a@gmail.com", "Test123")
//            .addOnSuccessListener {
//                Toast.makeText(this, "Usuario logado com sucesso", Toast.LENGTH_SHORT).show()
//            }.addOnFailureListener {
//                Log.e("onCreate", "OnCreate: ", it)
//                Toast.makeText(this, "Autenticacao falhou", Toast.LENGTH_SHORT).show()
//            }
//    }
//
//    private fun cadastraUsuario(firebaseAuth: FirebaseAuth) {
//        val tarefa = firebaseAuth.createUserWithEmailAndPassword("alex@gmail.com", "Test321@");
//
//        tarefa.addOnSuccessListener {
//            Toast.makeText(this, "Usuario foi cadastro com sucesso", Toast.LENGTH_SHORT).show();
//        }
//
//        tarefa.addOnFailureListener {
//            Toast.makeText(this, "Usuario nao foi cadastro com sucesso", Toast.LENGTH_SHORT).show()
//            Log.e("onCreate", "OnCreate", it)
//        }
//    }

}
