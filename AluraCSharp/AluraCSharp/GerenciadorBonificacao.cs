using AluraCSharp.Funcionarios;

namespace AluraCSharp
{
    public class GerenciadorBonificacao
    {
        private double _totalBonificacao;
        
        public void Registrar(Funcionario funcionario)
        {
            _totalBonificacao += funcionario.GetBonificação();
            funcionario.GetBonificação();
        }

        public double GetTotalBonificacao()
        {
            return _totalBonificacao;
        }
    }
}