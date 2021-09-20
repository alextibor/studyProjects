namespace AluraCSharp.Funcionarios
{
    public class Diretor
    {
        public string Nome { get; set; }
        public string CPF { get; set; }
        public double Salario { get; set; }

        public double GetBonificação()
        {
            return Salario * 0.10;
        }
    }
}