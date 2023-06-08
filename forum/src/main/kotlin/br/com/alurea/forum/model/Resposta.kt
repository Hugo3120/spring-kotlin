package br.com.alurea.forum.model

import java.time.LocalDateTime

class Resposta(
    val id: Long?,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val curso: Curso,
    val autor: Usuario,
    val status: StatusTopico= StatusTopico.NAO_RESPONDIDO,
    val respostas: List<Resposta> = ArrayList(),
    val topico: Topico,

)
