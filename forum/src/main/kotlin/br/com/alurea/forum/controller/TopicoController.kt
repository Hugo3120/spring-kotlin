package br.com.alurea.forum.controller

import br.com.alurea.forum.model.Curso
import br.com.alurea.forum.model.Topico
import br.com.alurea.forum.model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topicos")
class TopicoController {

    @GetMapping
    fun listar(): List<Topico> {
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis no Kotlin",
            curso = Curso (
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome= "Ana da Silva",
                email= "ana@email.com"
            )

        )
        return Arrays.asList(topico, topico,topico)
    }

}