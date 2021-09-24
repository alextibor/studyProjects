using System;

namespace AluraCSharp.Funcionarios
{
    public abstract class Funcionario
    {
        public static int TotalDeFuncionarios { get; private set; }
        public string Nome { get; set; }
        public string CPF { get; set; }
        public double Salario { get; protected set; }
        
        public Funcionario(double salario, string cpf)
        {
            CPF = cpf;
            Salario = salario;
            Console.WriteLine("Criando funcionario");
            TotalDeFuncionarios++;
        }
    
        public abstract void AumentarSalario();

        public abstract double GetBonificacao();
    }
}