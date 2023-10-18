package br.com.alura.aluraesporte.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import br.com.alura.aluraesporte.R
import br.com.alura.aluraesporte.ui.viewmodel.CadastroUsuarioViewModel
import br.com.alura.aluraesporte.ui.viewmodel.ComponentesVisuais
import br.com.alura.aluraesporte.ui.viewmodel.EstadoAppViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.cadastro_usuario.*
import org.koin.android.viewmodel.ext.android.sharedViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class CadastroUsuarioFragment : Fragment() {

    private val controlador by lazy {
        findNavController()
    }
    private val estadoAppViewModel: EstadoAppViewModel by sharedViewModel();

    private val viewModel: CadastroUsuarioViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.cadastro_usuario,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        estadoAppViewModel.temComponentes = ComponentesVisuais()
        cadastro_usuario_botao_cadastrar.setOnClickListener {

            cadastro_usuario_email.error = null
            cadastro_usuario_senha.error = null
            cadastro_usuario_confirma_senha.error = null

            //controlador.popBackStack()
            val email = cadastro_usuario_email.editText?.text.toString();
            val senha = cadastro_usuario_senha.editText?.text.toString();
            val confirmaSenha = cadastro_usuario_confirma_senha.editText?.text.toString();

            var valido = true;

            if(email.isBlank()) {
                cadastro_usuario_email.error = "Email e necessario"
                valido = false
            }

            if(senha.isBlank()) {
                cadastro_usuario_senha.error = "Senha e necessario"
                valido = false
            }

            if(senha != confirmaSenha) {
                cadastro_usuario_confirma_senha.error = "Senha Diferentes"
                valido = false
            }

            if(valido) {
                viewModel.cadastra(email, senha).observe(viewLifecycleOwner, Observer {
                    it.let { recurso ->
                        if (recurso.dado) {
                            Snackbar.make(view, "Cadastro com sucesso", Snackbar.LENGTH_LONG)
                                .show();
                            controlador.popBackStack()
                        } else {
                            var mensagemError = recurso.erro ?: "Ocorreu uma falha no cadastro"
                            Snackbar.make(view, mensagemError, Snackbar.LENGTH_LONG).show();
                        }
                    }
                })
            }
        }
    }

}