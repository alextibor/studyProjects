using System;

namespace AluraCSharp.Funcionarios
{
    public class Funcionario
    {
        public static int TotalDeFuncionarios { get; private set; }
        public string Nome { get; set; }
        public string CPF { get; set; }
        public double Salario { get; set; }
        
        public Funcionario()
        {
            Console.WriteLine("Criando funcionario");
            TotalDeFuncionarios++;
        }

        public virtual double GetBonificacao()
        {
            return Salario * 0.10;
        }
    }
}