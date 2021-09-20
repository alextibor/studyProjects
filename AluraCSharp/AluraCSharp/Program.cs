using System;
using AluraCSharp.Funcionarios;

namespace AluraCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            GerenciadorBonificacao gerenciador = new GerenciadorBonificacao();
            
            Funcionario carlos = new Funcionario();
            carlos.Nome = "Carlos";
            carlos.CPF = "546.879.157-23";
            carlos.Salario = 2000;
            gerenciador.Registrar(carlos);

            Diretor roberta = new Diretor();
            roberta.Nome = "Roberta";
            roberta.CPF = "456.789.123-45";
            roberta.Salario = 5000;
            gerenciador.Registrar(roberta);
            
            Console.WriteLine(carlos.Nome);
            Console.WriteLine(carlos.GetBonificacao());

            Console.WriteLine(roberta.Nome);
            Console.WriteLine(roberta.GetBonificacao());

            Console.WriteLine("Total de bonificacoes: " + gerenciador.GetTotalBonificacao());
            
            Console.ReadLine();
        }
    }
}