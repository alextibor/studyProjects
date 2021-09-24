using AluraCSharp.Funcionarios;

namespace AluraCSharp
{
    public class GerenciadorBonificacao
    {
        private double _totalBonificacao;
        
        public void Registrar(Funcionario funcionario)
        {
            _totalBonificacao += funcionario.GetBonificacao();
            funcionario.GetBonificacao();
        }
        public double GetTotalBonificacao()
        {
            return _totalBonificacao;
        }
    }
}