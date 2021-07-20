package me.osvaldolima

fun main() {
    val joao = Funcionario(nome="João", salario=2000.0,tipoContratacao = "CLT")
    val pedro = Funcionario(nome="Pedro", salario=1500.0,tipoContratacao =  "PJ" )
    val maria = Funcionario(nome="Maria", salario=4000.0,tipoContratacao =  "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    println(repositorio.findByid(joao.nome))
}