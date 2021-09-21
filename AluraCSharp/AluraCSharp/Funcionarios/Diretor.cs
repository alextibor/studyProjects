using System;

namespace AluraCSharp.Funcionarios
{
    public class Diretor : Funcionario
    {
        public Diretor()
        {
            Console.WriteLine("Criando diretor!");
        }
        public override double GetBonificacao()
        {
            return Salario + base.GetBonificacao();
        }
    }
}