using System;
using AluraCSharp.Funcionarios;

namespace AluraCSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Funcionario carlos = new Funcionario();
            carlos.Nome = "Carlos";
            carlos.CPF = "546.879.157-23";
            carlos.Salario = 2000;

            Diretor roberta = new Diretor();
            roberta.Nome = "Roberta";
            roberta.CPF = "456.789.123-45";
            roberta.Salario = 5000;

            Console.WriteLine(carlos.Nome);
            Console.WriteLine(carlos.GetBonificação());
            Console.WriteLine(roberta.GetBonificação());
            Console.WriteLine(roberta.GetBonificação());

            Console.ReadLine();
        }
    }
}